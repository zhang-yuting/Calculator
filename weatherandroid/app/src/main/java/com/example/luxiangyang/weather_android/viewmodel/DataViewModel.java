package com.example.luxiangyang.weather_android.viewmodel;

import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.bigkoo.pickerview.OptionsPickerView;
import com.example.luxiangyang.weather_android.MainActivity;
import com.example.luxiangyang.weather_android.api.OkHttpUtil;
import com.example.luxiangyang.weather_android.bean.RegionBean;
import com.example.luxiangyang.weather_android.api.RequestCallBack;
import com.example.luxiangyang.weather_android.util.Util;
import com.example.luxiangyang.weather_android.bean.WeatherBean;
import com.google.gson.Gson;
import com.lzy.okgo.model.Response;

import org.json.JSONArray;

import java.util.ArrayList;

public class DataViewModel {

    private MainActivity activity;
    private ArrayList<RegionBean> options1Items = new ArrayList<>();
    private ArrayList<ArrayList<String>> options2Items = new ArrayList<>();
    private ArrayList<ArrayList<ArrayList<String>>> options3Items = new ArrayList<>();
    private TextView degreeText;
    private TextView select_city;
    private TextView province;
    private TextView area;
    private TextView info;


    public DataViewModel(MainActivity mainActivity) {
        this.activity = mainActivity;
        initJsonData();
        initWeather("北京市");
    }


    /**
     * 初始化
     */
    private void init() {

        degreeText = (TextView)  activity.findViewById(R.id.degree_text);//实时天气信息--温度
        select_city = (TextView)  activity.findViewById(R.id.select_city);
        province = (TextView)  activity.findViewById(R.id.province);
        area = (TextView)  activity.findViewById(R.id.area);
        info = (TextView)  activity.findViewById(R.id.info);

        select_city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OptionsPickerView pickerView = new OptionsPickerView.Builder(activity, new OptionsPickerView.OnOptionsSelectListener() {
                    @Override
                    public void onOptionsSelect(int options1, int options2, int options3, View v) {


                        String s = options3Items.get(options1).get(options2).get(options3);

                        initWeather(s);


                    }
                }).setTitleText("")
                        .setDividerColor(Color.BLACK)
                        .setTextColorCenter(Color.BLACK) //设置选中项文字颜色
                        .setSubmitColor(Color.BLACK)//确定按钮文字颜色
                        .setCancelColor(Color.BLACK)//取消按钮文字颜色
                        .setContentTextSize(16)
                        .build();

                pickerView.setPicker(options1Items, options2Items, options3Items);
                pickerView.show();


            }
        });
    }

    private void initWeather(String str) {

        OkHttpUtil.getRequest("http://www.pubtian.com/freeservice/weather/index?city="+str, new RequestCallBack<WeatherBean>() {
            @Override
            public void onSuccess(Response<WeatherBean> response) {
                WeatherBean weatherBean = response.body();

                WeatherBean.DataBean data = weatherBean.getData();
                WeatherBean.DataBean.Forecast24hBean._$0Bean bean = data.getForecast_24h().get_$0();

                WeatherBean.DataBean.AlarmBean alarm = data.getAlarm();

                WeatherBean.DataBean.AlarmBean._$0BeanX webean = alarm.get_$0();
                if (webean != null){
                    province.setText(webean.getProvince());
                    area.setText(webean.getCity());
                    info.setText(webean.getDetail());
                }else{
                    province.setText("");
                    area.setText("");
                    info.setText("");
                }
                if(bean != null){
                    String maxDegree = bean.getMax_degree();
                    String minDegree = bean.getMin_degree();
                    degreeText.setText(minDegree+"℃"+"  --  "+maxDegree+"℃");
                }


            }

            @Override
            public WeatherBean parseNetworkResponse(String jsonResult) {
                Log.e("JS",jsonResult);
                Gson gson = new Gson();
                WeatherBean weatherBean = gson.fromJson(jsonResult, WeatherBean.class);

                return weatherBean;
            }

            @Override
            public void onFailed(int code, String msg) {

            }
        });
    }

    /**
     * 解析数据
     */
    private void initJsonData() {   //解析数据

        //  获取json数据
        String jsonData = Util.getJson("china_city_data.json", activity);
        //用Gson 转成实体
        ArrayList<RegionBean> jsonBean = parseData(jsonData);//用Gson 转成实体
        /**
         * 添加省份数据
         *
         * 注意：如果是添加的JavaBean实体，则实体类需要实现 IPickerViewData 接口，
         * PickerView会通过getPickerViewText方法获取字符串显示出来。
         */
        options1Items = jsonBean;

        for (int i = 0; i < jsonBean.size(); i++) {//遍历省份
            ArrayList<String> CityList = new ArrayList<>();//该省的城市列表（第二级）
            ArrayList<ArrayList<String>> Province_AreaList = new ArrayList<>();//该省的所有地区列表（第三极）

            for (int c = 0; c < jsonBean.get(i).getCityList().size(); c++) {//遍历该省份的所有城市
                String CityName = jsonBean.get(i).getCityList().get(c).getName();
                CityList.add(CityName);//添加城市

                ArrayList<String> City_AreaList = new ArrayList<>();//该城市的所有地区列表

                //如果无地区数据，建议添加空字符串，防止数据为null 导致三个选项长度不匹配造成崩溃
                if (jsonBean.get(i).getCityList().get(c).getArea() == null
                        || jsonBean.get(i).getCityList().get(c).getArea().size() == 0) {
                    City_AreaList.add("");
                } else {

                    for (int d = 0; d < jsonBean.get(i).getCityList().get(c).getArea().size(); d++) {//该城市对应地区所有数据
                        String AreaName = jsonBean.get(i).getCityList().get(c).getArea().get(d);

                        City_AreaList.add(AreaName);//添加该城市所有地区数据
                    }
                }
                Province_AreaList.add(City_AreaList);//添加该省所有地区数据
            }

            /**
             * 添加城市数据
             */
            options2Items.add(CityList);

            /**
             * 添加地区数据
             */
            options3Items.add(Province_AreaList);

        }
        init();
    }


    public ArrayList<RegionBean> parseData(String result) {//Gson 解析
        ArrayList<RegionBean> detail = new ArrayList<>();
        try {
            JSONArray data = new JSONArray(result);
            Gson gson = new Gson();
            for (int i = 0; i < data.length(); i++) {
                RegionBean entity = gson.fromJson(data.optJSONObject(i).toString(), RegionBean.class);
                detail.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
            // mHandler.sendEmptyMessage(MSG_LOAD_FAILED);
        }
        return detail;
    }

}
