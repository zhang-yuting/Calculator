package com.example.luxiangyang.weather_android.bean;


import com.google.gson.annotations.SerializedName;

public class WeatherBean  {


    /**
     * data : {"forecast_24h":{"0":{"day_wind_direction_code":"1","night_wind_direction":"微风","day_weather_code":"01","night_weather":"多云","night_weather_code":"01","day_weather":"多云","day_wind_power":"3","day_wind_direction":"东北风","day_weather_short":"多云","max_degree":"0","night_weather_short":"多云","min_degree":"-7","night_wind_power":"5","night_wind_direction_code":"0","night_wind_power_code":"2","time":"2018-12-10","day_wind_power_code":"0"},"1":{"day_wind_direction_code":"7","night_wind_direction":"北风","day_weather_code":"00","night_weather":"晴","night_weather_code":"00","day_weather":"晴","day_wind_power":"5","day_wind_direction":"西北风","day_weather_short":"晴","max_degree":"-1","night_weather_short":"晴","min_degree":"-10","night_wind_power":"3","night_wind_direction_code":"8","night_wind_power_code":"0","time":"2018-12-11","day_wind_power_code":"2"},"2":{"day_wind_direction_code":"5","night_wind_direction":"北风","day_weather_code":"00","night_weather":"晴","night_weather_code":"00","day_weather":"晴","day_wind_power":"3","day_wind_direction":"西南风","day_weather_short":"晴","max_degree":"1","night_weather_short":"晴","min_degree":"-8","night_wind_power":"3","night_wind_direction_code":"8","night_wind_power_code":"0","time":"2018-12-12","day_wind_power_code":"0"},"3":{"day_wind_direction_code":"8","night_wind_direction":"西南风","day_weather_code":"00","night_weather":"晴","night_weather_code":"00","day_weather":"晴","day_wind_power":"3","day_wind_direction":"北风","day_weather_short":"晴","max_degree":"3","night_weather_short":"晴","min_degree":"-7","night_wind_power":"3","night_wind_direction_code":"5","night_wind_power_code":"0","time":"2018-12-13","day_wind_power_code":"0"},"4":{"day_wind_direction_code":"4","night_wind_direction":"南风","day_weather_code":"01","night_weather":"多云","night_weather_code":"01","day_weather":"多云","day_wind_power":"3","day_wind_direction":"南风","day_weather_short":"多云","max_degree":"3","night_weather_short":"多云","min_degree":"-6","night_wind_power":"3","night_wind_direction_code":"4","night_wind_power_code":"0","time":"2018-12-14","day_wind_power_code":"0"},"5":{"day_wind_direction_code":"5","night_wind_direction":"北风","day_weather_code":"01","night_weather":"多云","night_weather_code":"01","day_weather":"多云","day_wind_power":"3","day_wind_direction":"西南风","day_weather_short":"多云","max_degree":"3","night_weather_short":"多云","min_degree":"-5","night_wind_power":"4","night_wind_direction_code":"8","night_wind_power_code":"1","time":"2018-12-15","day_wind_power_code":"0"},"6":{"day_wind_direction_code":"7","night_wind_direction":"西北风","day_weather_code":"01","night_weather":"多云","night_weather_code":"01","day_weather":"多云","day_wind_power":"4","day_wind_direction":"西北风","day_weather_short":"多云","max_degree":"6","night_weather_short":"多云","min_degree":"-5","night_wind_power":"3","night_wind_direction_code":"7","night_wind_power_code":"0","time":"2018-12-16","day_wind_power_code":"1"},"7":{"day_wind_direction_code":"5","night_wind_direction":"北风","day_weather_code":"00","night_weather":"晴","night_weather_code":"00","day_weather":"晴","day_wind_power":"3","day_wind_direction":"西南风","day_weather_short":"晴","max_degree":"4","night_weather_short":"晴","min_degree":"-4","night_wind_power":"3","night_wind_direction_code":"8","night_wind_power_code":"0","time":"2018-12-17","day_wind_power_code":"0"}},"alarm":{"0":{"type_name":"大风","update_time":"2018-12-10 16:25","level_name":"蓝色","province":"北京市","city":"","county":"","level_code":"01","detail":"市气象台2018年12月10日16时20分发布大风蓝色预警信号。受冷空气影响，预计11日本市将有4、5级偏北风，阵风可达7级左右，请注意防范。（预警信息来源：国家预警信息发布中心）","url":"10101-20181210162528-0501.html","info":"201812101625545112大风蓝色","type_code":"05"},"1":{"type_name":"持续低温","update_time":"2018-12-10 10:45","level_name":"蓝色","province":"北京市","city":"","county":"","level_code":"00","detail":"市气象台2018年12月10日10时30分继续发布持续低温蓝色预警信号。受冷空气影响，预计10日至12日本市平原大部分地区日平均气温比常年同期偏低5℃左右，请注意防范。（预警信息来源：国家预警信息发布中心）","url":"10101-20181210104510-5301.html","info":"201812101045545112持续低温蓝色","type_code":"00"}},"limit":{"tail_number":"3和8","time":"20181211"},"index":{"makeup":{"name":"化妆","detail":"天气寒冷，请用滋润保湿型化妆品，少扑粉，使用润唇膏后再抹口红。","info":"保湿"},"sunglasses":{"name":"太阳镜","detail":"白天天空晴朗，请适时佩戴太阳镜","info":"需要"},"diffusion":{"name":"空气污染扩散条件","detail":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。","info":"良"},"sunscreen":{"name":"防晒","detail":"紫外线强度较弱，建议涂擦SPF在12-15之间，PA+的防晒护肤品。","info":"较弱"},"mood":{"name":"心情","detail":"天气较好，柔和的阳光透过寒冷的空气给大地带来了温暖，也驱除了您身心的疲惫，让您的心情亮丽得几乎能触摸到成功与幸福的影子。","info":"较好"},"sports":{"name":"运动","detail":"天气较好，但考虑天气寒冷，风力较强，推荐您进行室内运动，若户外运动请注意保暖并做好准备活动。","info":"较不宜"},"umbrella":{"name":"雨伞","detail":"天气较好，您在出门的时候无须带雨伞。","info":"不带伞"},"chill":{"name":"风寒","detail":"风力较大，感觉寒冷，室外活动要注意保暖，可戴手套与帽子。","info":"寒冷"},"allergy":{"name":"过敏","detail":"天气条件极不易诱发过敏，风力较大，外出注意防风。","info":"极不易发"},"tourism":{"name":"旅游","detail":"天气较好，温度稍低，而且风稍大，让您感觉有些冷，会对外出有一定影响，外出注意防风保暖。","info":"一般"},"cold":{"name":"感冒","detail":"天冷风大，易发生感冒，请注意适当增加衣服，加强自我防护避免感冒。","info":"易发"},"dry":{"name":"路况","detail":"天气较好，路面比较干燥，路况较好。","info":"干燥"},"clothes":{"name":"穿衣","detail":"天气寒冷，建议着厚羽绒服、毛皮大衣加厚毛衣等隆冬服装。年老体弱者尤其要注意保暖防冻。","info":"寒冷"},"comfort":{"name":"舒适度","detail":"白天天气较凉，且风力较强，您会感觉偏冷，不很舒适，请注意添加衣物，以防感冒。","info":"较不舒适"},"morning":{"name":"晨练","detail":"早晨天气寒冷，风力较大，请尽量避免户外晨练，若坚持室外晨练请注意保暖避风防冻，建议年老体弱人群适当减少晨练时间。","info":"不宜"},"drying":{"name":"晾晒","detail":"天气不错，午后温暖的阳光仍能满足你驱潮消霉杀菌的晾晒需求。","info":"基本适宜"},"ultraviolet":{"name":"紫外线强度","detail":"紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。","info":"弱"},"fish":{"name":"钓鱼","detail":"天气冷，不适合垂钓。","info":"不宜"},"heatstroke":{"name":"中暑","detail":"温度不高，其他各项气象条件适宜，中暑机率极低。","info":"无"},"airconditioner":{"name":"空调开启","detail":"您将感到有些冷，可以适当开启制暖空调调节室内温度，以免着凉感冒。","info":"开启制暖空调"},"time":"20181211","carwash":{"name":"洗车","detail":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。","info":"较不宜"},"traffic":{"name":"交通","detail":"天气较好，路面干燥，交通气象条件良好，车辆可以正常行驶。","info":"良好"}},"forecast_1h":{"44":{"update_time":"20181213110000","degree":"0","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"},"45":{"update_time":"20181213120000","degree":"0","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"46":{"update_time":"20181213130000","degree":"1","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"47":{"update_time":"20181213140000","degree":"2","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"},"10":{"update_time":"20181212010000","degree":"-7","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"11":{"update_time":"20181212020000","degree":"-7","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"},"12":{"update_time":"20181212030000","degree":"-8","weather":"晴","weather_short":"晴","wind_direction":"东南风","weather_code":"00","wind_power":"3"},"13":{"update_time":"20181212040000","degree":"-9","weather":"晴","weather_short":"晴","wind_direction":"东南风","weather_code":"00","wind_power":"3"},"14":{"update_time":"20181212050000","degree":"-9","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"},"15":{"update_time":"20181212060000","degree":"-9","weather":"晴","weather_short":"晴","wind_direction":"东南风","weather_code":"00","wind_power":"3"},"16":{"update_time":"20181212070000","degree":"-9","weather":"晴","weather_short":"晴","wind_direction":"东南风","weather_code":"00","wind_power":"3"},"17":{"update_time":"20181212080000","degree":"-8","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"},"18":{"update_time":"20181212090000","degree":"-6","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"19":{"update_time":"20181212100000","degree":"-4","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"0":{"update_time":"20181211150000","degree":"-1","weather":"晴","weather_short":"晴","wind_direction":"西北风","weather_code":"00","wind_power":"5"},"1":{"update_time":"20181211160000","degree":"-1","weather":"晴","weather_short":"晴","wind_direction":"西北风","weather_code":"00","wind_power":"4"},"2":{"update_time":"20181211170000","degree":"-3","weather":"晴","weather_short":"晴","wind_direction":"西北风","weather_code":"00","wind_power":"3"},"3":{"update_time":"20181211180000","degree":"-4","weather":"晴","weather_short":"晴","wind_direction":"西北风","weather_code":"00","wind_power":"3"},"4":{"update_time":"20181211190000","degree":"-4","weather":"晴","weather_short":"晴","wind_direction":"西北风","weather_code":"00","wind_power":"3"},"5":{"update_time":"20181211200000","degree":"-5","weather":"晴","weather_short":"晴","wind_direction":"西北风","weather_code":"00","wind_power":"3"},"6":{"update_time":"20181211210000","degree":"-5","weather":"晴","weather_short":"晴","wind_direction":"西风","weather_code":"00","wind_power":"3"},"7":{"update_time":"20181211220000","degree":"-6","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"8":{"update_time":"20181211230000","degree":"-6","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"},"9":{"update_time":"20181212000000","degree":"-7","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"20":{"update_time":"20181212110000","degree":"-3","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"21":{"update_time":"20181212120000","degree":"-1","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"22":{"update_time":"20181212130000","degree":"0","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"23":{"update_time":"20181212140000","degree":"0","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"24":{"update_time":"20181212150000","degree":"1","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"25":{"update_time":"20181212160000","degree":"1","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"26":{"update_time":"20181212170000","degree":"-2","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"27":{"update_time":"20181212180000","degree":"-2","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"28":{"update_time":"20181212190000","degree":"-3","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"29":{"update_time":"20181212200000","degree":"-3","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"30":{"update_time":"20181212210000","degree":"-4","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"31":{"update_time":"20181212220000","degree":"-4","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"32":{"update_time":"20181212230000","degree":"-5","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"},"33":{"update_time":"20181213000000","degree":"-5","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"34":{"update_time":"20181213010000","degree":"-5","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"35":{"update_time":"20181213020000","degree":"-5","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"},"36":{"update_time":"20181213030000","degree":"-6","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"37":{"update_time":"20181213040000","degree":"-6","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"38":{"update_time":"20181213050000","degree":"-7","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"},"39":{"update_time":"20181213060000","degree":"-7","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"40":{"update_time":"20181213070000","degree":"-7","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"41":{"update_time":"20181213080000","degree":"-7","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"},"42":{"update_time":"20181213090000","degree":"-5","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"43":{"update_time":"20181213100000","degree":"-3","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"}},"location":"北京市,北京市","rise":{"11":{"sunrise":"07:32","sunset":"16:53","time":"20181222"},"12":{"sunrise":"07:33","sunset":"16:53","time":"20181223"},"13":{"sunrise":"07:33","sunset":"16:54","time":"20181224"},"14":{"sunrise":"07:33","sunset":"16:54","time":"20181225"},"0":{"sunrise":"07:25","sunset":"16:49","time":"20181211"},"1":{"sunrise":"07:26","sunset":"16:49","time":"20181212"},"2":{"sunrise":"07:27","sunset":"16:49","time":"20181213"},"3":{"sunrise":"07:27","sunset":"16:50","time":"20181214"},"4":{"sunrise":"07:28","sunset":"16:50","time":"20181215"},"5":{"sunrise":"07:29","sunset":"16:50","time":"20181216"},"6":{"sunrise":"07:29","sunset":"16:50","time":"20181217"},"7":{"sunrise":"07:30","sunset":"16:51","time":"20181218"},"8":{"sunrise":"07:31","sunset":"16:51","time":"20181219"},"9":{"sunrise":"07:31","sunset":"16:52","time":"20181220"},"10":{"sunrise":"07:32","sunset":"16:52","time":"20181221"}},"observe":{"precipitation":"0.0","update_time":"201812111540","degree":"-1","weather":"晴","weather_short":"晴","humidity":"12","wind_direction":"8","pressure":"1032","weather_code":"00","wind_power":"2"},"tips":{"observe":{"0":"你若安好，便是晴天~","1":"天冷了，多穿点衣服~"}}}
     * message : OK
     * status : 200
     */

    private DataBean data;
    private String message;
    private int status;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class DataBean {
        /**
         * forecast_24h : {"0":{"day_wind_direction_code":"1","night_wind_direction":"微风","day_weather_code":"01","night_weather":"多云","night_weather_code":"01","day_weather":"多云","day_wind_power":"3","day_wind_direction":"东北风","day_weather_short":"多云","max_degree":"0","night_weather_short":"多云","min_degree":"-7","night_wind_power":"5","night_wind_direction_code":"0","night_wind_power_code":"2","time":"2018-12-10","day_wind_power_code":"0"},"1":{"day_wind_direction_code":"7","night_wind_direction":"北风","day_weather_code":"00","night_weather":"晴","night_weather_code":"00","day_weather":"晴","day_wind_power":"5","day_wind_direction":"西北风","day_weather_short":"晴","max_degree":"-1","night_weather_short":"晴","min_degree":"-10","night_wind_power":"3","night_wind_direction_code":"8","night_wind_power_code":"0","time":"2018-12-11","day_wind_power_code":"2"},"2":{"day_wind_direction_code":"5","night_wind_direction":"北风","day_weather_code":"00","night_weather":"晴","night_weather_code":"00","day_weather":"晴","day_wind_power":"3","day_wind_direction":"西南风","day_weather_short":"晴","max_degree":"1","night_weather_short":"晴","min_degree":"-8","night_wind_power":"3","night_wind_direction_code":"8","night_wind_power_code":"0","time":"2018-12-12","day_wind_power_code":"0"},"3":{"day_wind_direction_code":"8","night_wind_direction":"西南风","day_weather_code":"00","night_weather":"晴","night_weather_code":"00","day_weather":"晴","day_wind_power":"3","day_wind_direction":"北风","day_weather_short":"晴","max_degree":"3","night_weather_short":"晴","min_degree":"-7","night_wind_power":"3","night_wind_direction_code":"5","night_wind_power_code":"0","time":"2018-12-13","day_wind_power_code":"0"},"4":{"day_wind_direction_code":"4","night_wind_direction":"南风","day_weather_code":"01","night_weather":"多云","night_weather_code":"01","day_weather":"多云","day_wind_power":"3","day_wind_direction":"南风","day_weather_short":"多云","max_degree":"3","night_weather_short":"多云","min_degree":"-6","night_wind_power":"3","night_wind_direction_code":"4","night_wind_power_code":"0","time":"2018-12-14","day_wind_power_code":"0"},"5":{"day_wind_direction_code":"5","night_wind_direction":"北风","day_weather_code":"01","night_weather":"多云","night_weather_code":"01","day_weather":"多云","day_wind_power":"3","day_wind_direction":"西南风","day_weather_short":"多云","max_degree":"3","night_weather_short":"多云","min_degree":"-5","night_wind_power":"4","night_wind_direction_code":"8","night_wind_power_code":"1","time":"2018-12-15","day_wind_power_code":"0"},"6":{"day_wind_direction_code":"7","night_wind_direction":"西北风","day_weather_code":"01","night_weather":"多云","night_weather_code":"01","day_weather":"多云","day_wind_power":"4","day_wind_direction":"西北风","day_weather_short":"多云","max_degree":"6","night_weather_short":"多云","min_degree":"-5","night_wind_power":"3","night_wind_direction_code":"7","night_wind_power_code":"0","time":"2018-12-16","day_wind_power_code":"1"},"7":{"day_wind_direction_code":"5","night_wind_direction":"北风","day_weather_code":"00","night_weather":"晴","night_weather_code":"00","day_weather":"晴","day_wind_power":"3","day_wind_direction":"西南风","day_weather_short":"晴","max_degree":"4","night_weather_short":"晴","min_degree":"-4","night_wind_power":"3","night_wind_direction_code":"8","night_wind_power_code":"0","time":"2018-12-17","day_wind_power_code":"0"}}
         * alarm : {"0":{"type_name":"大风","update_time":"2018-12-10 16:25","level_name":"蓝色","province":"北京市","city":"","county":"","level_code":"01","detail":"市气象台2018年12月10日16时20分发布大风蓝色预警信号。受冷空气影响，预计11日本市将有4、5级偏北风，阵风可达7级左右，请注意防范。（预警信息来源：国家预警信息发布中心）","url":"10101-20181210162528-0501.html","info":"201812101625545112大风蓝色","type_code":"05"},"1":{"type_name":"持续低温","update_time":"2018-12-10 10:45","level_name":"蓝色","province":"北京市","city":"","county":"","level_code":"00","detail":"市气象台2018年12月10日10时30分继续发布持续低温蓝色预警信号。受冷空气影响，预计10日至12日本市平原大部分地区日平均气温比常年同期偏低5℃左右，请注意防范。（预警信息来源：国家预警信息发布中心）","url":"10101-20181210104510-5301.html","info":"201812101045545112持续低温蓝色","type_code":"00"}}
         * limit : {"tail_number":"3和8","time":"20181211"}
         * index : {"makeup":{"name":"化妆","detail":"天气寒冷，请用滋润保湿型化妆品，少扑粉，使用润唇膏后再抹口红。","info":"保湿"},"sunglasses":{"name":"太阳镜","detail":"白天天空晴朗，请适时佩戴太阳镜","info":"需要"},"diffusion":{"name":"空气污染扩散条件","detail":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。","info":"良"},"sunscreen":{"name":"防晒","detail":"紫外线强度较弱，建议涂擦SPF在12-15之间，PA+的防晒护肤品。","info":"较弱"},"mood":{"name":"心情","detail":"天气较好，柔和的阳光透过寒冷的空气给大地带来了温暖，也驱除了您身心的疲惫，让您的心情亮丽得几乎能触摸到成功与幸福的影子。","info":"较好"},"sports":{"name":"运动","detail":"天气较好，但考虑天气寒冷，风力较强，推荐您进行室内运动，若户外运动请注意保暖并做好准备活动。","info":"较不宜"},"umbrella":{"name":"雨伞","detail":"天气较好，您在出门的时候无须带雨伞。","info":"不带伞"},"chill":{"name":"风寒","detail":"风力较大，感觉寒冷，室外活动要注意保暖，可戴手套与帽子。","info":"寒冷"},"allergy":{"name":"过敏","detail":"天气条件极不易诱发过敏，风力较大，外出注意防风。","info":"极不易发"},"tourism":{"name":"旅游","detail":"天气较好，温度稍低，而且风稍大，让您感觉有些冷，会对外出有一定影响，外出注意防风保暖。","info":"一般"},"cold":{"name":"感冒","detail":"天冷风大，易发生感冒，请注意适当增加衣服，加强自我防护避免感冒。","info":"易发"},"dry":{"name":"路况","detail":"天气较好，路面比较干燥，路况较好。","info":"干燥"},"clothes":{"name":"穿衣","detail":"天气寒冷，建议着厚羽绒服、毛皮大衣加厚毛衣等隆冬服装。年老体弱者尤其要注意保暖防冻。","info":"寒冷"},"comfort":{"name":"舒适度","detail":"白天天气较凉，且风力较强，您会感觉偏冷，不很舒适，请注意添加衣物，以防感冒。","info":"较不舒适"},"morning":{"name":"晨练","detail":"早晨天气寒冷，风力较大，请尽量避免户外晨练，若坚持室外晨练请注意保暖避风防冻，建议年老体弱人群适当减少晨练时间。","info":"不宜"},"drying":{"name":"晾晒","detail":"天气不错，午后温暖的阳光仍能满足你驱潮消霉杀菌的晾晒需求。","info":"基本适宜"},"ultraviolet":{"name":"紫外线强度","detail":"紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。","info":"弱"},"fish":{"name":"钓鱼","detail":"天气冷，不适合垂钓。","info":"不宜"},"heatstroke":{"name":"中暑","detail":"温度不高，其他各项气象条件适宜，中暑机率极低。","info":"无"},"airconditioner":{"name":"空调开启","detail":"您将感到有些冷，可以适当开启制暖空调调节室内温度，以免着凉感冒。","info":"开启制暖空调"},"time":"20181211","carwash":{"name":"洗车","detail":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。","info":"较不宜"},"traffic":{"name":"交通","detail":"天气较好，路面干燥，交通气象条件良好，车辆可以正常行驶。","info":"良好"}}
         * forecast_1h : {"44":{"update_time":"20181213110000","degree":"0","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"},"45":{"update_time":"20181213120000","degree":"0","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"46":{"update_time":"20181213130000","degree":"1","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"47":{"update_time":"20181213140000","degree":"2","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"},"10":{"update_time":"20181212010000","degree":"-7","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"11":{"update_time":"20181212020000","degree":"-7","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"},"12":{"update_time":"20181212030000","degree":"-8","weather":"晴","weather_short":"晴","wind_direction":"东南风","weather_code":"00","wind_power":"3"},"13":{"update_time":"20181212040000","degree":"-9","weather":"晴","weather_short":"晴","wind_direction":"东南风","weather_code":"00","wind_power":"3"},"14":{"update_time":"20181212050000","degree":"-9","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"},"15":{"update_time":"20181212060000","degree":"-9","weather":"晴","weather_short":"晴","wind_direction":"东南风","weather_code":"00","wind_power":"3"},"16":{"update_time":"20181212070000","degree":"-9","weather":"晴","weather_short":"晴","wind_direction":"东南风","weather_code":"00","wind_power":"3"},"17":{"update_time":"20181212080000","degree":"-8","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"},"18":{"update_time":"20181212090000","degree":"-6","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"19":{"update_time":"20181212100000","degree":"-4","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"0":{"update_time":"20181211150000","degree":"-1","weather":"晴","weather_short":"晴","wind_direction":"西北风","weather_code":"00","wind_power":"5"},"1":{"update_time":"20181211160000","degree":"-1","weather":"晴","weather_short":"晴","wind_direction":"西北风","weather_code":"00","wind_power":"4"},"2":{"update_time":"20181211170000","degree":"-3","weather":"晴","weather_short":"晴","wind_direction":"西北风","weather_code":"00","wind_power":"3"},"3":{"update_time":"20181211180000","degree":"-4","weather":"晴","weather_short":"晴","wind_direction":"西北风","weather_code":"00","wind_power":"3"},"4":{"update_time":"20181211190000","degree":"-4","weather":"晴","weather_short":"晴","wind_direction":"西北风","weather_code":"00","wind_power":"3"},"5":{"update_time":"20181211200000","degree":"-5","weather":"晴","weather_short":"晴","wind_direction":"西北风","weather_code":"00","wind_power":"3"},"6":{"update_time":"20181211210000","degree":"-5","weather":"晴","weather_short":"晴","wind_direction":"西风","weather_code":"00","wind_power":"3"},"7":{"update_time":"20181211220000","degree":"-6","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"8":{"update_time":"20181211230000","degree":"-6","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"},"9":{"update_time":"20181212000000","degree":"-7","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"20":{"update_time":"20181212110000","degree":"-3","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"21":{"update_time":"20181212120000","degree":"-1","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"22":{"update_time":"20181212130000","degree":"0","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"23":{"update_time":"20181212140000","degree":"0","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"24":{"update_time":"20181212150000","degree":"1","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"25":{"update_time":"20181212160000","degree":"1","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"26":{"update_time":"20181212170000","degree":"-2","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"27":{"update_time":"20181212180000","degree":"-2","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"28":{"update_time":"20181212190000","degree":"-3","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"29":{"update_time":"20181212200000","degree":"-3","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"30":{"update_time":"20181212210000","degree":"-4","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"31":{"update_time":"20181212220000","degree":"-4","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"},"32":{"update_time":"20181212230000","degree":"-5","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"},"33":{"update_time":"20181213000000","degree":"-5","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"34":{"update_time":"20181213010000","degree":"-5","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"35":{"update_time":"20181213020000","degree":"-5","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"},"36":{"update_time":"20181213030000","degree":"-6","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"37":{"update_time":"20181213040000","degree":"-6","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"38":{"update_time":"20181213050000","degree":"-7","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"},"39":{"update_time":"20181213060000","degree":"-7","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"40":{"update_time":"20181213070000","degree":"-7","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"41":{"update_time":"20181213080000","degree":"-7","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"},"42":{"update_time":"20181213090000","degree":"-5","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"},"43":{"update_time":"20181213100000","degree":"-3","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"}}
         * location : 北京市,北京市
         * rise : {"11":{"sunrise":"07:32","sunset":"16:53","time":"20181222"},"12":{"sunrise":"07:33","sunset":"16:53","time":"20181223"},"13":{"sunrise":"07:33","sunset":"16:54","time":"20181224"},"14":{"sunrise":"07:33","sunset":"16:54","time":"20181225"},"0":{"sunrise":"07:25","sunset":"16:49","time":"20181211"},"1":{"sunrise":"07:26","sunset":"16:49","time":"20181212"},"2":{"sunrise":"07:27","sunset":"16:49","time":"20181213"},"3":{"sunrise":"07:27","sunset":"16:50","time":"20181214"},"4":{"sunrise":"07:28","sunset":"16:50","time":"20181215"},"5":{"sunrise":"07:29","sunset":"16:50","time":"20181216"},"6":{"sunrise":"07:29","sunset":"16:50","time":"20181217"},"7":{"sunrise":"07:30","sunset":"16:51","time":"20181218"},"8":{"sunrise":"07:31","sunset":"16:51","time":"20181219"},"9":{"sunrise":"07:31","sunset":"16:52","time":"20181220"},"10":{"sunrise":"07:32","sunset":"16:52","time":"20181221"}}
         * observe : {"precipitation":"0.0","update_time":"201812111540","degree":"-1","weather":"晴","weather_short":"晴","humidity":"12","wind_direction":"8","pressure":"1032","weather_code":"00","wind_power":"2"}
         * tips : {"observe":{"0":"你若安好，便是晴天~","1":"天冷了，多穿点衣服~"}}
         */

        private Forecast24hBean forecast_24h;
        private AlarmBean alarm;
        private LimitBean limit;
        private IndexBean index;
        private Forecast1hBean forecast_1h;
        private String location;
        private RiseBean rise;
        private ObserveBean observe;
        private TipsBean tips;

        public Forecast24hBean getForecast_24h() {
            return forecast_24h;
        }

        public void setForecast_24h(Forecast24hBean forecast_24h) {
            this.forecast_24h = forecast_24h;
        }

        public AlarmBean getAlarm() {
            return alarm;
        }

        public void setAlarm(AlarmBean alarm) {
            this.alarm = alarm;
        }

        public LimitBean getLimit() {
            return limit;
        }

        public void setLimit(LimitBean limit) {
            this.limit = limit;
        }

        public IndexBean getIndex() {
            return index;
        }

        public void setIndex(IndexBean index) {
            this.index = index;
        }

        public Forecast1hBean getForecast_1h() {
            return forecast_1h;
        }

        public void setForecast_1h(Forecast1hBean forecast_1h) {
            this.forecast_1h = forecast_1h;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public RiseBean getRise() {
            return rise;
        }

        public void setRise(RiseBean rise) {
            this.rise = rise;
        }

        public ObserveBean getObserve() {
            return observe;
        }

        public void setObserve(ObserveBean observe) {
            this.observe = observe;
        }

        public TipsBean getTips() {
            return tips;
        }

        public void setTips(TipsBean tips) {
            this.tips = tips;
        }

        public static class Forecast24hBean {
            /**
             * 0 : {"day_wind_direction_code":"1","night_wind_direction":"微风","day_weather_code":"01","night_weather":"多云","night_weather_code":"01","day_weather":"多云","day_wind_power":"3","day_wind_direction":"东北风","day_weather_short":"多云","max_degree":"0","night_weather_short":"多云","min_degree":"-7","night_wind_power":"5","night_wind_direction_code":"0","night_wind_power_code":"2","time":"2018-12-10","day_wind_power_code":"0"}
             * 1 : {"day_wind_direction_code":"7","night_wind_direction":"北风","day_weather_code":"00","night_weather":"晴","night_weather_code":"00","day_weather":"晴","day_wind_power":"5","day_wind_direction":"西北风","day_weather_short":"晴","max_degree":"-1","night_weather_short":"晴","min_degree":"-10","night_wind_power":"3","night_wind_direction_code":"8","night_wind_power_code":"0","time":"2018-12-11","day_wind_power_code":"2"}
             * 2 : {"day_wind_direction_code":"5","night_wind_direction":"北风","day_weather_code":"00","night_weather":"晴","night_weather_code":"00","day_weather":"晴","day_wind_power":"3","day_wind_direction":"西南风","day_weather_short":"晴","max_degree":"1","night_weather_short":"晴","min_degree":"-8","night_wind_power":"3","night_wind_direction_code":"8","night_wind_power_code":"0","time":"2018-12-12","day_wind_power_code":"0"}
             * 3 : {"day_wind_direction_code":"8","night_wind_direction":"西南风","day_weather_code":"00","night_weather":"晴","night_weather_code":"00","day_weather":"晴","day_wind_power":"3","day_wind_direction":"北风","day_weather_short":"晴","max_degree":"3","night_weather_short":"晴","min_degree":"-7","night_wind_power":"3","night_wind_direction_code":"5","night_wind_power_code":"0","time":"2018-12-13","day_wind_power_code":"0"}
             * 4 : {"day_wind_direction_code":"4","night_wind_direction":"南风","day_weather_code":"01","night_weather":"多云","night_weather_code":"01","day_weather":"多云","day_wind_power":"3","day_wind_direction":"南风","day_weather_short":"多云","max_degree":"3","night_weather_short":"多云","min_degree":"-6","night_wind_power":"3","night_wind_direction_code":"4","night_wind_power_code":"0","time":"2018-12-14","day_wind_power_code":"0"}
             * 5 : {"day_wind_direction_code":"5","night_wind_direction":"北风","day_weather_code":"01","night_weather":"多云","night_weather_code":"01","day_weather":"多云","day_wind_power":"3","day_wind_direction":"西南风","day_weather_short":"多云","max_degree":"3","night_weather_short":"多云","min_degree":"-5","night_wind_power":"4","night_wind_direction_code":"8","night_wind_power_code":"1","time":"2018-12-15","day_wind_power_code":"0"}
             * 6 : {"day_wind_direction_code":"7","night_wind_direction":"西北风","day_weather_code":"01","night_weather":"多云","night_weather_code":"01","day_weather":"多云","day_wind_power":"4","day_wind_direction":"西北风","day_weather_short":"多云","max_degree":"6","night_weather_short":"多云","min_degree":"-5","night_wind_power":"3","night_wind_direction_code":"7","night_wind_power_code":"0","time":"2018-12-16","day_wind_power_code":"1"}
             * 7 : {"day_wind_direction_code":"5","night_wind_direction":"北风","day_weather_code":"00","night_weather":"晴","night_weather_code":"00","day_weather":"晴","day_wind_power":"3","day_wind_direction":"西南风","day_weather_short":"晴","max_degree":"4","night_weather_short":"晴","min_degree":"-4","night_wind_power":"3","night_wind_direction_code":"8","night_wind_power_code":"0","time":"2018-12-17","day_wind_power_code":"0"}
             */

            @SerializedName("0")
            private _$0Bean _$0;
            @SerializedName("1")
            private _$1Bean _$1;
            @SerializedName("2")
            private _$2Bean _$2;
            @SerializedName("3")
            private _$3Bean _$3;
            @SerializedName("4")
            private _$4Bean _$4;
            @SerializedName("5")
            private _$5Bean _$5;
            @SerializedName("6")
            private _$6Bean _$6;
            @SerializedName("7")
            private _$7Bean _$7;

            public _$0Bean get_$0() {
                return _$0;
            }

            public void set_$0(_$0Bean _$0) {
                this._$0 = _$0;
            }

            public _$1Bean get_$1() {
                return _$1;
            }

            public void set_$1(_$1Bean _$1) {
                this._$1 = _$1;
            }

            public _$2Bean get_$2() {
                return _$2;
            }

            public void set_$2(_$2Bean _$2) {
                this._$2 = _$2;
            }

            public _$3Bean get_$3() {
                return _$3;
            }

            public void set_$3(_$3Bean _$3) {
                this._$3 = _$3;
            }

            public _$4Bean get_$4() {
                return _$4;
            }

            public void set_$4(_$4Bean _$4) {
                this._$4 = _$4;
            }

            public _$5Bean get_$5() {
                return _$5;
            }

            public void set_$5(_$5Bean _$5) {
                this._$5 = _$5;
            }

            public _$6Bean get_$6() {
                return _$6;
            }

            public void set_$6(_$6Bean _$6) {
                this._$6 = _$6;
            }

            public _$7Bean get_$7() {
                return _$7;
            }

            public void set_$7(_$7Bean _$7) {
                this._$7 = _$7;
            }

            public static class _$0Bean {
                /**
                 * day_wind_direction_code : 1
                 * night_wind_direction : 微风
                 * day_weather_code : 01
                 * night_weather : 多云
                 * night_weather_code : 01
                 * day_weather : 多云
                 * day_wind_power : 3
                 * day_wind_direction : 东北风
                 * day_weather_short : 多云
                 * max_degree : 0
                 * night_weather_short : 多云
                 * min_degree : -7
                 * night_wind_power : 5
                 * night_wind_direction_code : 0
                 * night_wind_power_code : 2
                 * time : 2018-12-10
                 * day_wind_power_code : 0
                 */

                private String day_wind_direction_code;
                private String night_wind_direction;
                private String day_weather_code;
                private String night_weather;
                private String night_weather_code;
                private String day_weather;
                private String day_wind_power;
                private String day_wind_direction;
                private String day_weather_short;
                private String max_degree;
                private String night_weather_short;
                private String min_degree;
                private String night_wind_power;
                private String night_wind_direction_code;
                private String night_wind_power_code;
                private String time;
                private String day_wind_power_code;

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }
            }

            public static class _$1Bean {
                /**
                 * day_wind_direction_code : 7
                 * night_wind_direction : 北风
                 * day_weather_code : 00
                 * night_weather : 晴
                 * night_weather_code : 00
                 * day_weather : 晴
                 * day_wind_power : 5
                 * day_wind_direction : 西北风
                 * day_weather_short : 晴
                 * max_degree : -1
                 * night_weather_short : 晴
                 * min_degree : -10
                 * night_wind_power : 3
                 * night_wind_direction_code : 8
                 * night_wind_power_code : 0
                 * time : 2018-12-11
                 * day_wind_power_code : 2
                 */

                private String day_wind_direction_code;
                private String night_wind_direction;
                private String day_weather_code;
                private String night_weather;
                private String night_weather_code;
                private String day_weather;
                private String day_wind_power;
                private String day_wind_direction;
                private String day_weather_short;
                private String max_degree;
                private String night_weather_short;
                private String min_degree;
                private String night_wind_power;
                private String night_wind_direction_code;
                private String night_wind_power_code;
                private String time;
                private String day_wind_power_code;

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }
            }

            public static class _$2Bean {
                /**
                 * day_wind_direction_code : 5
                 * night_wind_direction : 北风
                 * day_weather_code : 00
                 * night_weather : 晴
                 * night_weather_code : 00
                 * day_weather : 晴
                 * day_wind_power : 3
                 * day_wind_direction : 西南风
                 * day_weather_short : 晴
                 * max_degree : 1
                 * night_weather_short : 晴
                 * min_degree : -8
                 * night_wind_power : 3
                 * night_wind_direction_code : 8
                 * night_wind_power_code : 0
                 * time : 2018-12-12
                 * day_wind_power_code : 0
                 */

                private String day_wind_direction_code;
                private String night_wind_direction;
                private String day_weather_code;
                private String night_weather;
                private String night_weather_code;
                private String day_weather;
                private String day_wind_power;
                private String day_wind_direction;
                private String day_weather_short;
                private String max_degree;
                private String night_weather_short;
                private String min_degree;
                private String night_wind_power;
                private String night_wind_direction_code;
                private String night_wind_power_code;
                private String time;
                private String day_wind_power_code;

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }
            }

            public static class _$3Bean {
                /**
                 * day_wind_direction_code : 8
                 * night_wind_direction : 西南风
                 * day_weather_code : 00
                 * night_weather : 晴
                 * night_weather_code : 00
                 * day_weather : 晴
                 * day_wind_power : 3
                 * day_wind_direction : 北风
                 * day_weather_short : 晴
                 * max_degree : 3
                 * night_weather_short : 晴
                 * min_degree : -7
                 * night_wind_power : 3
                 * night_wind_direction_code : 5
                 * night_wind_power_code : 0
                 * time : 2018-12-13
                 * day_wind_power_code : 0
                 */

                private String day_wind_direction_code;
                private String night_wind_direction;
                private String day_weather_code;
                private String night_weather;
                private String night_weather_code;
                private String day_weather;
                private String day_wind_power;
                private String day_wind_direction;
                private String day_weather_short;
                private String max_degree;
                private String night_weather_short;
                private String min_degree;
                private String night_wind_power;
                private String night_wind_direction_code;
                private String night_wind_power_code;
                private String time;
                private String day_wind_power_code;

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }
            }

            public static class _$4Bean {
                /**
                 * day_wind_direction_code : 4
                 * night_wind_direction : 南风
                 * day_weather_code : 01
                 * night_weather : 多云
                 * night_weather_code : 01
                 * day_weather : 多云
                 * day_wind_power : 3
                 * day_wind_direction : 南风
                 * day_weather_short : 多云
                 * max_degree : 3
                 * night_weather_short : 多云
                 * min_degree : -6
                 * night_wind_power : 3
                 * night_wind_direction_code : 4
                 * night_wind_power_code : 0
                 * time : 2018-12-14
                 * day_wind_power_code : 0
                 */

                private String day_wind_direction_code;
                private String night_wind_direction;
                private String day_weather_code;
                private String night_weather;
                private String night_weather_code;
                private String day_weather;
                private String day_wind_power;
                private String day_wind_direction;
                private String day_weather_short;
                private String max_degree;
                private String night_weather_short;
                private String min_degree;
                private String night_wind_power;
                private String night_wind_direction_code;
                private String night_wind_power_code;
                private String time;
                private String day_wind_power_code;

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }
            }

            public static class _$5Bean {
                /**
                 * day_wind_direction_code : 5
                 * night_wind_direction : 北风
                 * day_weather_code : 01
                 * night_weather : 多云
                 * night_weather_code : 01
                 * day_weather : 多云
                 * day_wind_power : 3
                 * day_wind_direction : 西南风
                 * day_weather_short : 多云
                 * max_degree : 3
                 * night_weather_short : 多云
                 * min_degree : -5
                 * night_wind_power : 4
                 * night_wind_direction_code : 8
                 * night_wind_power_code : 1
                 * time : 2018-12-15
                 * day_wind_power_code : 0
                 */

                private String day_wind_direction_code;
                private String night_wind_direction;
                private String day_weather_code;
                private String night_weather;
                private String night_weather_code;
                private String day_weather;
                private String day_wind_power;
                private String day_wind_direction;
                private String day_weather_short;
                private String max_degree;
                private String night_weather_short;
                private String min_degree;
                private String night_wind_power;
                private String night_wind_direction_code;
                private String night_wind_power_code;
                private String time;
                private String day_wind_power_code;

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }
            }

            public static class _$6Bean {
                /**
                 * day_wind_direction_code : 7
                 * night_wind_direction : 西北风
                 * day_weather_code : 01
                 * night_weather : 多云
                 * night_weather_code : 01
                 * day_weather : 多云
                 * day_wind_power : 4
                 * day_wind_direction : 西北风
                 * day_weather_short : 多云
                 * max_degree : 6
                 * night_weather_short : 多云
                 * min_degree : -5
                 * night_wind_power : 3
                 * night_wind_direction_code : 7
                 * night_wind_power_code : 0
                 * time : 2018-12-16
                 * day_wind_power_code : 1
                 */

                private String day_wind_direction_code;
                private String night_wind_direction;
                private String day_weather_code;
                private String night_weather;
                private String night_weather_code;
                private String day_weather;
                private String day_wind_power;
                private String day_wind_direction;
                private String day_weather_short;
                private String max_degree;
                private String night_weather_short;
                private String min_degree;
                private String night_wind_power;
                private String night_wind_direction_code;
                private String night_wind_power_code;
                private String time;
                private String day_wind_power_code;

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }
            }

            public static class _$7Bean {
                /**
                 * day_wind_direction_code : 5
                 * night_wind_direction : 北风
                 * day_weather_code : 00
                 * night_weather : 晴
                 * night_weather_code : 00
                 * day_weather : 晴
                 * day_wind_power : 3
                 * day_wind_direction : 西南风
                 * day_weather_short : 晴
                 * max_degree : 4
                 * night_weather_short : 晴
                 * min_degree : -4
                 * night_wind_power : 3
                 * night_wind_direction_code : 8
                 * night_wind_power_code : 0
                 * time : 2018-12-17
                 * day_wind_power_code : 0
                 */

                private String day_wind_direction_code;
                private String night_wind_direction;
                private String day_weather_code;
                private String night_weather;
                private String night_weather_code;
                private String day_weather;
                private String day_wind_power;
                private String day_wind_direction;
                private String day_weather_short;
                private String max_degree;
                private String night_weather_short;
                private String min_degree;
                private String night_wind_power;
                private String night_wind_direction_code;
                private String night_wind_power_code;
                private String time;
                private String day_wind_power_code;

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }
            }
        }

        public static class AlarmBean {
            /**
             * 0 : {"type_name":"大风","update_time":"2018-12-10 16:25","level_name":"蓝色","province":"北京市","city":"","county":"","level_code":"01","detail":"市气象台2018年12月10日16时20分发布大风蓝色预警信号。受冷空气影响，预计11日本市将有4、5级偏北风，阵风可达7级左右，请注意防范。（预警信息来源：国家预警信息发布中心）","url":"10101-20181210162528-0501.html","info":"201812101625545112大风蓝色","type_code":"05"}
             * 1 : {"type_name":"持续低温","update_time":"2018-12-10 10:45","level_name":"蓝色","province":"北京市","city":"","county":"","level_code":"00","detail":"市气象台2018年12月10日10时30分继续发布持续低温蓝色预警信号。受冷空气影响，预计10日至12日本市平原大部分地区日平均气温比常年同期偏低5℃左右，请注意防范。（预警信息来源：国家预警信息发布中心）","url":"10101-20181210104510-5301.html","info":"201812101045545112持续低温蓝色","type_code":"00"}
             */

            @SerializedName("0")
            private _$0BeanX _$0;
            @SerializedName("1")
            private _$1BeanX _$1;

            public _$0BeanX get_$0() {
                return _$0;
            }

            public void set_$0(_$0BeanX _$0) {
                this._$0 = _$0;
            }

            public _$1BeanX get_$1() {
                return _$1;
            }

            public void set_$1(_$1BeanX _$1) {
                this._$1 = _$1;
            }

            public static class _$0BeanX {
                /**
                 * type_name : 大风
                 * update_time : 2018-12-10 16:25
                 * level_name : 蓝色
                 * province : 北京市
                 * city :
                 * county :
                 * level_code : 01
                 * detail : 市气象台2018年12月10日16时20分发布大风蓝色预警信号。受冷空气影响，预计11日本市将有4、5级偏北风，阵风可达7级左右，请注意防范。（预警信息来源：国家预警信息发布中心）
                 * url : 10101-20181210162528-0501.html
                 * info : 201812101625545112大风蓝色
                 * type_code : 05
                 */

                private String type_name;
                private String update_time;
                private String level_name;
                private String province;
                private String city;
                private String county;
                private String level_code;
                private String detail;
                private String url;
                private String info;
                private String type_code;

                public String getType_name() {
                    return type_name;
                }

                public void setType_name(String type_name) {
                    this.type_name = type_name;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getLevel_name() {
                    return level_name;
                }

                public void setLevel_name(String level_name) {
                    this.level_name = level_name;
                }

                public String getProvince() {
                    return province;
                }

                public void setProvince(String province) {
                    this.province = province;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCounty() {
                    return county;
                }

                public void setCounty(String county) {
                    this.county = county;
                }

                public String getLevel_code() {
                    return level_code;
                }

                public void setLevel_code(String level_code) {
                    this.level_code = level_code;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getType_code() {
                    return type_code;
                }

                public void setType_code(String type_code) {
                    this.type_code = type_code;
                }
            }

            public static class _$1BeanX {
                /**
                 * type_name : 持续低温
                 * update_time : 2018-12-10 10:45
                 * level_name : 蓝色
                 * province : 北京市
                 * city :
                 * county :
                 * level_code : 00
                 * detail : 市气象台2018年12月10日10时30分继续发布持续低温蓝色预警信号。受冷空气影响，预计10日至12日本市平原大部分地区日平均气温比常年同期偏低5℃左右，请注意防范。（预警信息来源：国家预警信息发布中心）
                 * url : 10101-20181210104510-5301.html
                 * info : 201812101045545112持续低温蓝色
                 * type_code : 00
                 */

                private String type_name;
                private String update_time;
                private String level_name;
                private String province;
                private String city;
                private String county;
                private String level_code;
                private String detail;
                private String url;
                private String info;
                private String type_code;

                public String getType_name() {
                    return type_name;
                }

                public void setType_name(String type_name) {
                    this.type_name = type_name;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getLevel_name() {
                    return level_name;
                }

                public void setLevel_name(String level_name) {
                    this.level_name = level_name;
                }

                public String getProvince() {
                    return province;
                }

                public void setProvince(String province) {
                    this.province = province;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCounty() {
                    return county;
                }

                public void setCounty(String county) {
                    this.county = county;
                }

                public String getLevel_code() {
                    return level_code;
                }

                public void setLevel_code(String level_code) {
                    this.level_code = level_code;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getType_code() {
                    return type_code;
                }

                public void setType_code(String type_code) {
                    this.type_code = type_code;
                }
            }
        }

        public static class LimitBean {
            /**
             * tail_number : 3和8
             * time : 20181211
             */

            private String tail_number;
            private String time;

            public String getTail_number() {
                return tail_number;
            }

            public void setTail_number(String tail_number) {
                this.tail_number = tail_number;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class IndexBean {
            /**
             * makeup : {"name":"化妆","detail":"天气寒冷，请用滋润保湿型化妆品，少扑粉，使用润唇膏后再抹口红。","info":"保湿"}
             * sunglasses : {"name":"太阳镜","detail":"白天天空晴朗，请适时佩戴太阳镜","info":"需要"}
             * diffusion : {"name":"空气污染扩散条件","detail":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。","info":"良"}
             * sunscreen : {"name":"防晒","detail":"紫外线强度较弱，建议涂擦SPF在12-15之间，PA+的防晒护肤品。","info":"较弱"}
             * mood : {"name":"心情","detail":"天气较好，柔和的阳光透过寒冷的空气给大地带来了温暖，也驱除了您身心的疲惫，让您的心情亮丽得几乎能触摸到成功与幸福的影子。","info":"较好"}
             * sports : {"name":"运动","detail":"天气较好，但考虑天气寒冷，风力较强，推荐您进行室内运动，若户外运动请注意保暖并做好准备活动。","info":"较不宜"}
             * umbrella : {"name":"雨伞","detail":"天气较好，您在出门的时候无须带雨伞。","info":"不带伞"}
             * chill : {"name":"风寒","detail":"风力较大，感觉寒冷，室外活动要注意保暖，可戴手套与帽子。","info":"寒冷"}
             * allergy : {"name":"过敏","detail":"天气条件极不易诱发过敏，风力较大，外出注意防风。","info":"极不易发"}
             * tourism : {"name":"旅游","detail":"天气较好，温度稍低，而且风稍大，让您感觉有些冷，会对外出有一定影响，外出注意防风保暖。","info":"一般"}
             * cold : {"name":"感冒","detail":"天冷风大，易发生感冒，请注意适当增加衣服，加强自我防护避免感冒。","info":"易发"}
             * dry : {"name":"路况","detail":"天气较好，路面比较干燥，路况较好。","info":"干燥"}
             * clothes : {"name":"穿衣","detail":"天气寒冷，建议着厚羽绒服、毛皮大衣加厚毛衣等隆冬服装。年老体弱者尤其要注意保暖防冻。","info":"寒冷"}
             * comfort : {"name":"舒适度","detail":"白天天气较凉，且风力较强，您会感觉偏冷，不很舒适，请注意添加衣物，以防感冒。","info":"较不舒适"}
             * morning : {"name":"晨练","detail":"早晨天气寒冷，风力较大，请尽量避免户外晨练，若坚持室外晨练请注意保暖避风防冻，建议年老体弱人群适当减少晨练时间。","info":"不宜"}
             * drying : {"name":"晾晒","detail":"天气不错，午后温暖的阳光仍能满足你驱潮消霉杀菌的晾晒需求。","info":"基本适宜"}
             * ultraviolet : {"name":"紫外线强度","detail":"紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。","info":"弱"}
             * fish : {"name":"钓鱼","detail":"天气冷，不适合垂钓。","info":"不宜"}
             * heatstroke : {"name":"中暑","detail":"温度不高，其他各项气象条件适宜，中暑机率极低。","info":"无"}
             * airconditioner : {"name":"空调开启","detail":"您将感到有些冷，可以适当开启制暖空调调节室内温度，以免着凉感冒。","info":"开启制暖空调"}
             * time : 20181211
             * carwash : {"name":"洗车","detail":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。","info":"较不宜"}
             * traffic : {"name":"交通","detail":"天气较好，路面干燥，交通气象条件良好，车辆可以正常行驶。","info":"良好"}
             */

            private MakeupBean makeup;
            private SunglassesBean sunglasses;
            private DiffusionBean diffusion;
            private SunscreenBean sunscreen;
            private MoodBean mood;
            private SportsBean sports;
            private UmbrellaBean umbrella;
            private ChillBean chill;
            private AllergyBean allergy;
            private TourismBean tourism;
            private ColdBean cold;
            private DryBean dry;
            private ClothesBean clothes;
            private ComfortBean comfort;
            private MorningBean morning;
            private DryingBean drying;
            private UltravioletBean ultraviolet;
            private FishBean fish;
            private HeatstrokeBean heatstroke;
            private AirconditionerBean airconditioner;
            private String time;
            private CarwashBean carwash;
            private TrafficBean traffic;

            public MakeupBean getMakeup() {
                return makeup;
            }

            public void setMakeup(MakeupBean makeup) {
                this.makeup = makeup;
            }

            public SunglassesBean getSunglasses() {
                return sunglasses;
            }

            public void setSunglasses(SunglassesBean sunglasses) {
                this.sunglasses = sunglasses;
            }

            public DiffusionBean getDiffusion() {
                return diffusion;
            }

            public void setDiffusion(DiffusionBean diffusion) {
                this.diffusion = diffusion;
            }

            public SunscreenBean getSunscreen() {
                return sunscreen;
            }

            public void setSunscreen(SunscreenBean sunscreen) {
                this.sunscreen = sunscreen;
            }

            public MoodBean getMood() {
                return mood;
            }

            public void setMood(MoodBean mood) {
                this.mood = mood;
            }

            public SportsBean getSports() {
                return sports;
            }

            public void setSports(SportsBean sports) {
                this.sports = sports;
            }

            public UmbrellaBean getUmbrella() {
                return umbrella;
            }

            public void setUmbrella(UmbrellaBean umbrella) {
                this.umbrella = umbrella;
            }

            public ChillBean getChill() {
                return chill;
            }

            public void setChill(ChillBean chill) {
                this.chill = chill;
            }

            public AllergyBean getAllergy() {
                return allergy;
            }

            public void setAllergy(AllergyBean allergy) {
                this.allergy = allergy;
            }

            public TourismBean getTourism() {
                return tourism;
            }

            public void setTourism(TourismBean tourism) {
                this.tourism = tourism;
            }

            public ColdBean getCold() {
                return cold;
            }

            public void setCold(ColdBean cold) {
                this.cold = cold;
            }

            public DryBean getDry() {
                return dry;
            }

            public void setDry(DryBean dry) {
                this.dry = dry;
            }

            public ClothesBean getClothes() {
                return clothes;
            }

            public void setClothes(ClothesBean clothes) {
                this.clothes = clothes;
            }

            public ComfortBean getComfort() {
                return comfort;
            }

            public void setComfort(ComfortBean comfort) {
                this.comfort = comfort;
            }

            public MorningBean getMorning() {
                return morning;
            }

            public void setMorning(MorningBean morning) {
                this.morning = morning;
            }

            public DryingBean getDrying() {
                return drying;
            }

            public void setDrying(DryingBean drying) {
                this.drying = drying;
            }

            public UltravioletBean getUltraviolet() {
                return ultraviolet;
            }

            public void setUltraviolet(UltravioletBean ultraviolet) {
                this.ultraviolet = ultraviolet;
            }

            public FishBean getFish() {
                return fish;
            }

            public void setFish(FishBean fish) {
                this.fish = fish;
            }

            public HeatstrokeBean getHeatstroke() {
                return heatstroke;
            }

            public void setHeatstroke(HeatstrokeBean heatstroke) {
                this.heatstroke = heatstroke;
            }

            public AirconditionerBean getAirconditioner() {
                return airconditioner;
            }

            public void setAirconditioner(AirconditionerBean airconditioner) {
                this.airconditioner = airconditioner;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public CarwashBean getCarwash() {
                return carwash;
            }

            public void setCarwash(CarwashBean carwash) {
                this.carwash = carwash;
            }

            public TrafficBean getTraffic() {
                return traffic;
            }

            public void setTraffic(TrafficBean traffic) {
                this.traffic = traffic;
            }

            public static class MakeupBean {
                /**
                 * name : 化妆
                 * detail : 天气寒冷，请用滋润保湿型化妆品，少扑粉，使用润唇膏后再抹口红。
                 * info : 保湿
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }

            public static class SunglassesBean {
                /**
                 * name : 太阳镜
                 * detail : 白天天空晴朗，请适时佩戴太阳镜
                 * info : 需要
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }

            public static class DiffusionBean {
                /**
                 * name : 空气污染扩散条件
                 * detail : 气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。
                 * info : 良
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }

            public static class SunscreenBean {
                /**
                 * name : 防晒
                 * detail : 紫外线强度较弱，建议涂擦SPF在12-15之间，PA+的防晒护肤品。
                 * info : 较弱
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }

            public static class MoodBean {
                /**
                 * name : 心情
                 * detail : 天气较好，柔和的阳光透过寒冷的空气给大地带来了温暖，也驱除了您身心的疲惫，让您的心情亮丽得几乎能触摸到成功与幸福的影子。
                 * info : 较好
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }

            public static class SportsBean {
                /**
                 * name : 运动
                 * detail : 天气较好，但考虑天气寒冷，风力较强，推荐您进行室内运动，若户外运动请注意保暖并做好准备活动。
                 * info : 较不宜
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }

            public static class UmbrellaBean {
                /**
                 * name : 雨伞
                 * detail : 天气较好，您在出门的时候无须带雨伞。
                 * info : 不带伞
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }

            public static class ChillBean {
                /**
                 * name : 风寒
                 * detail : 风力较大，感觉寒冷，室外活动要注意保暖，可戴手套与帽子。
                 * info : 寒冷
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }

            public static class AllergyBean {
                /**
                 * name : 过敏
                 * detail : 天气条件极不易诱发过敏，风力较大，外出注意防风。
                 * info : 极不易发
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }

            public static class TourismBean {
                /**
                 * name : 旅游
                 * detail : 天气较好，温度稍低，而且风稍大，让您感觉有些冷，会对外出有一定影响，外出注意防风保暖。
                 * info : 一般
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }

            public static class ColdBean {
                /**
                 * name : 感冒
                 * detail : 天冷风大，易发生感冒，请注意适当增加衣服，加强自我防护避免感冒。
                 * info : 易发
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }

            public static class DryBean {
                /**
                 * name : 路况
                 * detail : 天气较好，路面比较干燥，路况较好。
                 * info : 干燥
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }

            public static class ClothesBean {
                /**
                 * name : 穿衣
                 * detail : 天气寒冷，建议着厚羽绒服、毛皮大衣加厚毛衣等隆冬服装。年老体弱者尤其要注意保暖防冻。
                 * info : 寒冷
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }

            public static class ComfortBean {
                /**
                 * name : 舒适度
                 * detail : 白天天气较凉，且风力较强，您会感觉偏冷，不很舒适，请注意添加衣物，以防感冒。
                 * info : 较不舒适
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }

            public static class MorningBean {
                /**
                 * name : 晨练
                 * detail : 早晨天气寒冷，风力较大，请尽量避免户外晨练，若坚持室外晨练请注意保暖避风防冻，建议年老体弱人群适当减少晨练时间。
                 * info : 不宜
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }

            public static class DryingBean {
                /**
                 * name : 晾晒
                 * detail : 天气不错，午后温暖的阳光仍能满足你驱潮消霉杀菌的晾晒需求。
                 * info : 基本适宜
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }

            public static class UltravioletBean {
                /**
                 * name : 紫外线强度
                 * detail : 紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。
                 * info : 弱
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }

            public static class FishBean {
                /**
                 * name : 钓鱼
                 * detail : 天气冷，不适合垂钓。
                 * info : 不宜
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }

            public static class HeatstrokeBean {
                /**
                 * name : 中暑
                 * detail : 温度不高，其他各项气象条件适宜，中暑机率极低。
                 * info : 无
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }

            public static class AirconditionerBean {
                /**
                 * name : 空调开启
                 * detail : 您将感到有些冷，可以适当开启制暖空调调节室内温度，以免着凉感冒。
                 * info : 开启制暖空调
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }

            public static class CarwashBean {
                /**
                 * name : 洗车
                 * detail : 较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。
                 * info : 较不宜
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }

            public static class TrafficBean {
                /**
                 * name : 交通
                 * detail : 天气较好，路面干燥，交通气象条件良好，车辆可以正常行驶。
                 * info : 良好
                 */

                private String name;
                private String detail;
                private String info;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }
        }

        public static class Forecast1hBean {
            /**
             * 44 : {"update_time":"20181213110000","degree":"0","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"}
             * 45 : {"update_time":"20181213120000","degree":"0","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"}
             * 46 : {"update_time":"20181213130000","degree":"1","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"}
             * 47 : {"update_time":"20181213140000","degree":"2","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"}
             * 10 : {"update_time":"20181212010000","degree":"-7","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"}
             * 11 : {"update_time":"20181212020000","degree":"-7","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"}
             * 12 : {"update_time":"20181212030000","degree":"-8","weather":"晴","weather_short":"晴","wind_direction":"东南风","weather_code":"00","wind_power":"3"}
             * 13 : {"update_time":"20181212040000","degree":"-9","weather":"晴","weather_short":"晴","wind_direction":"东南风","weather_code":"00","wind_power":"3"}
             * 14 : {"update_time":"20181212050000","degree":"-9","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"}
             * 15 : {"update_time":"20181212060000","degree":"-9","weather":"晴","weather_short":"晴","wind_direction":"东南风","weather_code":"00","wind_power":"3"}
             * 16 : {"update_time":"20181212070000","degree":"-9","weather":"晴","weather_short":"晴","wind_direction":"东南风","weather_code":"00","wind_power":"3"}
             * 17 : {"update_time":"20181212080000","degree":"-8","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"}
             * 18 : {"update_time":"20181212090000","degree":"-6","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"}
             * 19 : {"update_time":"20181212100000","degree":"-4","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"}
             * 0 : {"update_time":"20181211150000","degree":"-1","weather":"晴","weather_short":"晴","wind_direction":"西北风","weather_code":"00","wind_power":"5"}
             * 1 : {"update_time":"20181211160000","degree":"-1","weather":"晴","weather_short":"晴","wind_direction":"西北风","weather_code":"00","wind_power":"4"}
             * 2 : {"update_time":"20181211170000","degree":"-3","weather":"晴","weather_short":"晴","wind_direction":"西北风","weather_code":"00","wind_power":"3"}
             * 3 : {"update_time":"20181211180000","degree":"-4","weather":"晴","weather_short":"晴","wind_direction":"西北风","weather_code":"00","wind_power":"3"}
             * 4 : {"update_time":"20181211190000","degree":"-4","weather":"晴","weather_short":"晴","wind_direction":"西北风","weather_code":"00","wind_power":"3"}
             * 5 : {"update_time":"20181211200000","degree":"-5","weather":"晴","weather_short":"晴","wind_direction":"西北风","weather_code":"00","wind_power":"3"}
             * 6 : {"update_time":"20181211210000","degree":"-5","weather":"晴","weather_short":"晴","wind_direction":"西风","weather_code":"00","wind_power":"3"}
             * 7 : {"update_time":"20181211220000","degree":"-6","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"}
             * 8 : {"update_time":"20181211230000","degree":"-6","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"}
             * 9 : {"update_time":"20181212000000","degree":"-7","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"}
             * 20 : {"update_time":"20181212110000","degree":"-3","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"}
             * 21 : {"update_time":"20181212120000","degree":"-1","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"}
             * 22 : {"update_time":"20181212130000","degree":"0","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"}
             * 23 : {"update_time":"20181212140000","degree":"0","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"}
             * 24 : {"update_time":"20181212150000","degree":"1","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"}
             * 25 : {"update_time":"20181212160000","degree":"1","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"}
             * 26 : {"update_time":"20181212170000","degree":"-2","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"}
             * 27 : {"update_time":"20181212180000","degree":"-2","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"}
             * 28 : {"update_time":"20181212190000","degree":"-3","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"}
             * 29 : {"update_time":"20181212200000","degree":"-3","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"}
             * 30 : {"update_time":"20181212210000","degree":"-4","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"}
             * 31 : {"update_time":"20181212220000","degree":"-4","weather":"晴","weather_short":"晴","wind_direction":"西南风","weather_code":"00","wind_power":"3"}
             * 32 : {"update_time":"20181212230000","degree":"-5","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"}
             * 33 : {"update_time":"20181213000000","degree":"-5","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"}
             * 34 : {"update_time":"20181213010000","degree":"-5","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"}
             * 35 : {"update_time":"20181213020000","degree":"-5","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"}
             * 36 : {"update_time":"20181213030000","degree":"-6","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"}
             * 37 : {"update_time":"20181213040000","degree":"-6","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"}
             * 38 : {"update_time":"20181213050000","degree":"-7","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"}
             * 39 : {"update_time":"20181213060000","degree":"-7","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"}
             * 40 : {"update_time":"20181213070000","degree":"-7","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"}
             * 41 : {"update_time":"20181213080000","degree":"-7","weather":"晴","weather_short":"晴","wind_direction":"北风","weather_code":"00","wind_power":"3"}
             * 42 : {"update_time":"20181213090000","degree":"-5","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"}
             * 43 : {"update_time":"20181213100000","degree":"-3","weather":"晴","weather_short":"晴","wind_direction":"南风","weather_code":"00","wind_power":"3"}
             */

            @SerializedName("44")
            private _$44Bean _$44;
            @SerializedName("45")
            private _$45Bean _$45;
            @SerializedName("46")
            private _$46Bean _$46;
            @SerializedName("47")
            private _$47Bean _$47;
            @SerializedName("10")
            private _$10Bean _$10;
            @SerializedName("11")
            private _$11Bean _$11;
            @SerializedName("12")
            private _$12Bean _$12;
            @SerializedName("13")
            private _$13Bean _$13;
            @SerializedName("14")
            private _$14Bean _$14;
            @SerializedName("15")
            private _$15Bean _$15;
            @SerializedName("16")
            private _$16Bean _$16;
            @SerializedName("17")
            private _$17Bean _$17;
            @SerializedName("18")
            private _$18Bean _$18;
            @SerializedName("19")
            private _$19Bean _$19;
            @SerializedName("0")
            private _$0BeanXX _$0;
            @SerializedName("1")
            private _$1BeanXX _$1;
            @SerializedName("2")
            private _$2BeanX _$2;
            @SerializedName("3")
            private _$3BeanX _$3;
            @SerializedName("4")
            private _$4BeanX _$4;
            @SerializedName("5")
            private _$5BeanX _$5;
            @SerializedName("6")
            private _$6BeanX _$6;
            @SerializedName("7")
            private _$7BeanX _$7;
            @SerializedName("8")
            private _$8Bean _$8;
            @SerializedName("9")
            private _$9Bean _$9;
            @SerializedName("20")
            private _$20Bean _$20;
            @SerializedName("21")
            private _$21Bean _$21;
            @SerializedName("22")
            private _$22Bean _$22;
            @SerializedName("23")
            private _$23Bean _$23;
            @SerializedName("24")
            private _$24Bean _$24;
            @SerializedName("25")
            private _$25Bean _$25;
            @SerializedName("26")
            private _$26Bean _$26;
            @SerializedName("27")
            private _$27Bean _$27;
            @SerializedName("28")
            private _$28Bean _$28;
            @SerializedName("29")
            private _$29Bean _$29;
            @SerializedName("30")
            private _$30Bean _$30;
            @SerializedName("31")
            private _$31Bean _$31;
            @SerializedName("32")
            private _$32Bean _$32;
            @SerializedName("33")
            private _$33Bean _$33;
            @SerializedName("34")
            private _$34Bean _$34;
            @SerializedName("35")
            private _$35Bean _$35;
            @SerializedName("36")
            private _$36Bean _$36;
            @SerializedName("37")
            private _$37Bean _$37;
            @SerializedName("38")
            private _$38Bean _$38;
            @SerializedName("39")
            private _$39Bean _$39;
            @SerializedName("40")
            private _$40Bean _$40;
            @SerializedName("41")
            private _$41Bean _$41;
            @SerializedName("42")
            private _$42Bean _$42;
            @SerializedName("43")
            private _$43Bean _$43;

            public _$44Bean get_$44() {
                return _$44;
            }

            public void set_$44(_$44Bean _$44) {
                this._$44 = _$44;
            }

            public _$45Bean get_$45() {
                return _$45;
            }

            public void set_$45(_$45Bean _$45) {
                this._$45 = _$45;
            }

            public _$46Bean get_$46() {
                return _$46;
            }

            public void set_$46(_$46Bean _$46) {
                this._$46 = _$46;
            }

            public _$47Bean get_$47() {
                return _$47;
            }

            public void set_$47(_$47Bean _$47) {
                this._$47 = _$47;
            }

            public _$10Bean get_$10() {
                return _$10;
            }

            public void set_$10(_$10Bean _$10) {
                this._$10 = _$10;
            }

            public _$11Bean get_$11() {
                return _$11;
            }

            public void set_$11(_$11Bean _$11) {
                this._$11 = _$11;
            }

            public _$12Bean get_$12() {
                return _$12;
            }

            public void set_$12(_$12Bean _$12) {
                this._$12 = _$12;
            }

            public _$13Bean get_$13() {
                return _$13;
            }

            public void set_$13(_$13Bean _$13) {
                this._$13 = _$13;
            }

            public _$14Bean get_$14() {
                return _$14;
            }

            public void set_$14(_$14Bean _$14) {
                this._$14 = _$14;
            }

            public _$15Bean get_$15() {
                return _$15;
            }

            public void set_$15(_$15Bean _$15) {
                this._$15 = _$15;
            }

            public _$16Bean get_$16() {
                return _$16;
            }

            public void set_$16(_$16Bean _$16) {
                this._$16 = _$16;
            }

            public _$17Bean get_$17() {
                return _$17;
            }

            public void set_$17(_$17Bean _$17) {
                this._$17 = _$17;
            }

            public _$18Bean get_$18() {
                return _$18;
            }

            public void set_$18(_$18Bean _$18) {
                this._$18 = _$18;
            }

            public _$19Bean get_$19() {
                return _$19;
            }

            public void set_$19(_$19Bean _$19) {
                this._$19 = _$19;
            }

            public _$0BeanXX get_$0() {
                return _$0;
            }

            public void set_$0(_$0BeanXX _$0) {
                this._$0 = _$0;
            }

            public _$1BeanXX get_$1() {
                return _$1;
            }

            public void set_$1(_$1BeanXX _$1) {
                this._$1 = _$1;
            }

            public _$2BeanX get_$2() {
                return _$2;
            }

            public void set_$2(_$2BeanX _$2) {
                this._$2 = _$2;
            }

            public _$3BeanX get_$3() {
                return _$3;
            }

            public void set_$3(_$3BeanX _$3) {
                this._$3 = _$3;
            }

            public _$4BeanX get_$4() {
                return _$4;
            }

            public void set_$4(_$4BeanX _$4) {
                this._$4 = _$4;
            }

            public _$5BeanX get_$5() {
                return _$5;
            }

            public void set_$5(_$5BeanX _$5) {
                this._$5 = _$5;
            }

            public _$6BeanX get_$6() {
                return _$6;
            }

            public void set_$6(_$6BeanX _$6) {
                this._$6 = _$6;
            }

            public _$7BeanX get_$7() {
                return _$7;
            }

            public void set_$7(_$7BeanX _$7) {
                this._$7 = _$7;
            }

            public _$8Bean get_$8() {
                return _$8;
            }

            public void set_$8(_$8Bean _$8) {
                this._$8 = _$8;
            }

            public _$9Bean get_$9() {
                return _$9;
            }

            public void set_$9(_$9Bean _$9) {
                this._$9 = _$9;
            }

            public _$20Bean get_$20() {
                return _$20;
            }

            public void set_$20(_$20Bean _$20) {
                this._$20 = _$20;
            }

            public _$21Bean get_$21() {
                return _$21;
            }

            public void set_$21(_$21Bean _$21) {
                this._$21 = _$21;
            }

            public _$22Bean get_$22() {
                return _$22;
            }

            public void set_$22(_$22Bean _$22) {
                this._$22 = _$22;
            }

            public _$23Bean get_$23() {
                return _$23;
            }

            public void set_$23(_$23Bean _$23) {
                this._$23 = _$23;
            }

            public _$24Bean get_$24() {
                return _$24;
            }

            public void set_$24(_$24Bean _$24) {
                this._$24 = _$24;
            }

            public _$25Bean get_$25() {
                return _$25;
            }

            public void set_$25(_$25Bean _$25) {
                this._$25 = _$25;
            }

            public _$26Bean get_$26() {
                return _$26;
            }

            public void set_$26(_$26Bean _$26) {
                this._$26 = _$26;
            }

            public _$27Bean get_$27() {
                return _$27;
            }

            public void set_$27(_$27Bean _$27) {
                this._$27 = _$27;
            }

            public _$28Bean get_$28() {
                return _$28;
            }

            public void set_$28(_$28Bean _$28) {
                this._$28 = _$28;
            }

            public _$29Bean get_$29() {
                return _$29;
            }

            public void set_$29(_$29Bean _$29) {
                this._$29 = _$29;
            }

            public _$30Bean get_$30() {
                return _$30;
            }

            public void set_$30(_$30Bean _$30) {
                this._$30 = _$30;
            }

            public _$31Bean get_$31() {
                return _$31;
            }

            public void set_$31(_$31Bean _$31) {
                this._$31 = _$31;
            }

            public _$32Bean get_$32() {
                return _$32;
            }

            public void set_$32(_$32Bean _$32) {
                this._$32 = _$32;
            }

            public _$33Bean get_$33() {
                return _$33;
            }

            public void set_$33(_$33Bean _$33) {
                this._$33 = _$33;
            }

            public _$34Bean get_$34() {
                return _$34;
            }

            public void set_$34(_$34Bean _$34) {
                this._$34 = _$34;
            }

            public _$35Bean get_$35() {
                return _$35;
            }

            public void set_$35(_$35Bean _$35) {
                this._$35 = _$35;
            }

            public _$36Bean get_$36() {
                return _$36;
            }

            public void set_$36(_$36Bean _$36) {
                this._$36 = _$36;
            }

            public _$37Bean get_$37() {
                return _$37;
            }

            public void set_$37(_$37Bean _$37) {
                this._$37 = _$37;
            }

            public _$38Bean get_$38() {
                return _$38;
            }

            public void set_$38(_$38Bean _$38) {
                this._$38 = _$38;
            }

            public _$39Bean get_$39() {
                return _$39;
            }

            public void set_$39(_$39Bean _$39) {
                this._$39 = _$39;
            }

            public _$40Bean get_$40() {
                return _$40;
            }

            public void set_$40(_$40Bean _$40) {
                this._$40 = _$40;
            }

            public _$41Bean get_$41() {
                return _$41;
            }

            public void set_$41(_$41Bean _$41) {
                this._$41 = _$41;
            }

            public _$42Bean get_$42() {
                return _$42;
            }

            public void set_$42(_$42Bean _$42) {
                this._$42 = _$42;
            }

            public _$43Bean get_$43() {
                return _$43;
            }

            public void set_$43(_$43Bean _$43) {
                this._$43 = _$43;
            }

            public static class _$44Bean {
                /**
                 * update_time : 20181213110000
                 * degree : 0
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 北风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$45Bean {
                /**
                 * update_time : 20181213120000
                 * degree : 0
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$46Bean {
                /**
                 * update_time : 20181213130000
                 * degree : 1
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$47Bean {
                /**
                 * update_time : 20181213140000
                 * degree : 2
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 北风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$10Bean {
                /**
                 * update_time : 20181212010000
                 * degree : -7
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$11Bean {
                /**
                 * update_time : 20181212020000
                 * degree : -7
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 北风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$12Bean {
                /**
                 * update_time : 20181212030000
                 * degree : -8
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 东南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$13Bean {
                /**
                 * update_time : 20181212040000
                 * degree : -9
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 东南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$14Bean {
                /**
                 * update_time : 20181212050000
                 * degree : -9
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 北风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$15Bean {
                /**
                 * update_time : 20181212060000
                 * degree : -9
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 东南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$16Bean {
                /**
                 * update_time : 20181212070000
                 * degree : -9
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 东南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$17Bean {
                /**
                 * update_time : 20181212080000
                 * degree : -8
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 北风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$18Bean {
                /**
                 * update_time : 20181212090000
                 * degree : -6
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$19Bean {
                /**
                 * update_time : 20181212100000
                 * degree : -4
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$0BeanXX {
                /**
                 * update_time : 20181211150000
                 * degree : -1
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 西北风
                 * weather_code : 00
                 * wind_power : 5
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$1BeanXX {
                /**
                 * update_time : 20181211160000
                 * degree : -1
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 西北风
                 * weather_code : 00
                 * wind_power : 4
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$2BeanX {
                /**
                 * update_time : 20181211170000
                 * degree : -3
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 西北风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$3BeanX {
                /**
                 * update_time : 20181211180000
                 * degree : -4
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 西北风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$4BeanX {
                /**
                 * update_time : 20181211190000
                 * degree : -4
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 西北风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$5BeanX {
                /**
                 * update_time : 20181211200000
                 * degree : -5
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 西北风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$6BeanX {
                /**
                 * update_time : 20181211210000
                 * degree : -5
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 西风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$7BeanX {
                /**
                 * update_time : 20181211220000
                 * degree : -6
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 西南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$8Bean {
                /**
                 * update_time : 20181211230000
                 * degree : -6
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 北风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$9Bean {
                /**
                 * update_time : 20181212000000
                 * degree : -7
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$20Bean {
                /**
                 * update_time : 20181212110000
                 * degree : -3
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 西南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$21Bean {
                /**
                 * update_time : 20181212120000
                 * degree : -1
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 西南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$22Bean {
                /**
                 * update_time : 20181212130000
                 * degree : 0
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 西南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$23Bean {
                /**
                 * update_time : 20181212140000
                 * degree : 0
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 西南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$24Bean {
                /**
                 * update_time : 20181212150000
                 * degree : 1
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 西南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$25Bean {
                /**
                 * update_time : 20181212160000
                 * degree : 1
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 西南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$26Bean {
                /**
                 * update_time : 20181212170000
                 * degree : -2
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 西南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$27Bean {
                /**
                 * update_time : 20181212180000
                 * degree : -2
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 西南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$28Bean {
                /**
                 * update_time : 20181212190000
                 * degree : -3
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 西南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$29Bean {
                /**
                 * update_time : 20181212200000
                 * degree : -3
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 西南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$30Bean {
                /**
                 * update_time : 20181212210000
                 * degree : -4
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 西南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$31Bean {
                /**
                 * update_time : 20181212220000
                 * degree : -4
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 西南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$32Bean {
                /**
                 * update_time : 20181212230000
                 * degree : -5
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 北风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$33Bean {
                /**
                 * update_time : 20181213000000
                 * degree : -5
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$34Bean {
                /**
                 * update_time : 20181213010000
                 * degree : -5
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$35Bean {
                /**
                 * update_time : 20181213020000
                 * degree : -5
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 北风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$36Bean {
                /**
                 * update_time : 20181213030000
                 * degree : -6
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$37Bean {
                /**
                 * update_time : 20181213040000
                 * degree : -6
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$38Bean {
                /**
                 * update_time : 20181213050000
                 * degree : -7
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 北风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$39Bean {
                /**
                 * update_time : 20181213060000
                 * degree : -7
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$40Bean {
                /**
                 * update_time : 20181213070000
                 * degree : -7
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$41Bean {
                /**
                 * update_time : 20181213080000
                 * degree : -7
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 北风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$42Bean {
                /**
                 * update_time : 20181213090000
                 * degree : -5
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }

            public static class _$43Bean {
                /**
                 * update_time : 20181213100000
                 * degree : -3
                 * weather : 晴
                 * weather_short : 晴
                 * wind_direction : 南风
                 * weather_code : 00
                 * wind_power : 3
                 */

                private String update_time;
                private String degree;
                private String weather;
                private String weather_short;
                private String wind_direction;
                private String weather_code;
                private String wind_power;

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getDegree() {
                    return degree;
                }

                public void setDegree(String degree) {
                    this.degree = degree;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public String getWeather_short() {
                    return weather_short;
                }

                public void setWeather_short(String weather_short) {
                    this.weather_short = weather_short;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWeather_code() {
                    return weather_code;
                }

                public void setWeather_code(String weather_code) {
                    this.weather_code = weather_code;
                }

                public String getWind_power() {
                    return wind_power;
                }

                public void setWind_power(String wind_power) {
                    this.wind_power = wind_power;
                }
            }
        }

        public static class RiseBean {
            /**
             * 11 : {"sunrise":"07:32","sunset":"16:53","time":"20181222"}
             * 12 : {"sunrise":"07:33","sunset":"16:53","time":"20181223"}
             * 13 : {"sunrise":"07:33","sunset":"16:54","time":"20181224"}
             * 14 : {"sunrise":"07:33","sunset":"16:54","time":"20181225"}
             * 0 : {"sunrise":"07:25","sunset":"16:49","time":"20181211"}
             * 1 : {"sunrise":"07:26","sunset":"16:49","time":"20181212"}
             * 2 : {"sunrise":"07:27","sunset":"16:49","time":"20181213"}
             * 3 : {"sunrise":"07:27","sunset":"16:50","time":"20181214"}
             * 4 : {"sunrise":"07:28","sunset":"16:50","time":"20181215"}
             * 5 : {"sunrise":"07:29","sunset":"16:50","time":"20181216"}
             * 6 : {"sunrise":"07:29","sunset":"16:50","time":"20181217"}
             * 7 : {"sunrise":"07:30","sunset":"16:51","time":"20181218"}
             * 8 : {"sunrise":"07:31","sunset":"16:51","time":"20181219"}
             * 9 : {"sunrise":"07:31","sunset":"16:52","time":"20181220"}
             * 10 : {"sunrise":"07:32","sunset":"16:52","time":"20181221"}
             */

            @SerializedName("11")
            private _$11BeanX _$11;
            @SerializedName("12")
            private _$12BeanX _$12;
            @SerializedName("13")
            private _$13BeanX _$13;
            @SerializedName("14")
            private _$14BeanX _$14;
            @SerializedName("0")
            private _$0BeanXXX _$0;
            @SerializedName("1")
            private _$1BeanXXX _$1;
            @SerializedName("2")
            private _$2BeanXX _$2;
            @SerializedName("3")
            private _$3BeanXX _$3;
            @SerializedName("4")
            private _$4BeanXX _$4;
            @SerializedName("5")
            private _$5BeanXX _$5;
            @SerializedName("6")
            private _$6BeanXX _$6;
            @SerializedName("7")
            private _$7BeanXX _$7;
            @SerializedName("8")
            private _$8BeanX _$8;
            @SerializedName("9")
            private _$9BeanX _$9;
            @SerializedName("10")
            private _$10BeanX _$10;

            public _$11BeanX get_$11() {
                return _$11;
            }

            public void set_$11(_$11BeanX _$11) {
                this._$11 = _$11;
            }

            public _$12BeanX get_$12() {
                return _$12;
            }

            public void set_$12(_$12BeanX _$12) {
                this._$12 = _$12;
            }

            public _$13BeanX get_$13() {
                return _$13;
            }

            public void set_$13(_$13BeanX _$13) {
                this._$13 = _$13;
            }

            public _$14BeanX get_$14() {
                return _$14;
            }

            public void set_$14(_$14BeanX _$14) {
                this._$14 = _$14;
            }

            public _$0BeanXXX get_$0() {
                return _$0;
            }

            public void set_$0(_$0BeanXXX _$0) {
                this._$0 = _$0;
            }

            public _$1BeanXXX get_$1() {
                return _$1;
            }

            public void set_$1(_$1BeanXXX _$1) {
                this._$1 = _$1;
            }

            public _$2BeanXX get_$2() {
                return _$2;
            }

            public void set_$2(_$2BeanXX _$2) {
                this._$2 = _$2;
            }

            public _$3BeanXX get_$3() {
                return _$3;
            }

            public void set_$3(_$3BeanXX _$3) {
                this._$3 = _$3;
            }

            public _$4BeanXX get_$4() {
                return _$4;
            }

            public void set_$4(_$4BeanXX _$4) {
                this._$4 = _$4;
            }

            public _$5BeanXX get_$5() {
                return _$5;
            }

            public void set_$5(_$5BeanXX _$5) {
                this._$5 = _$5;
            }

            public _$6BeanXX get_$6() {
                return _$6;
            }

            public void set_$6(_$6BeanXX _$6) {
                this._$6 = _$6;
            }

            public _$7BeanXX get_$7() {
                return _$7;
            }

            public void set_$7(_$7BeanXX _$7) {
                this._$7 = _$7;
            }

            public _$8BeanX get_$8() {
                return _$8;
            }

            public void set_$8(_$8BeanX _$8) {
                this._$8 = _$8;
            }

            public _$9BeanX get_$9() {
                return _$9;
            }

            public void set_$9(_$9BeanX _$9) {
                this._$9 = _$9;
            }

            public _$10BeanX get_$10() {
                return _$10;
            }

            public void set_$10(_$10BeanX _$10) {
                this._$10 = _$10;
            }

            public static class _$11BeanX {
                /**
                 * sunrise : 07:32
                 * sunset : 16:53
                 * time : 20181222
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$12BeanX {
                /**
                 * sunrise : 07:33
                 * sunset : 16:53
                 * time : 20181223
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$13BeanX {
                /**
                 * sunrise : 07:33
                 * sunset : 16:54
                 * time : 20181224
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$14BeanX {
                /**
                 * sunrise : 07:33
                 * sunset : 16:54
                 * time : 20181225
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$0BeanXXX {
                /**
                 * sunrise : 07:25
                 * sunset : 16:49
                 * time : 20181211
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$1BeanXXX {
                /**
                 * sunrise : 07:26
                 * sunset : 16:49
                 * time : 20181212
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$2BeanXX {
                /**
                 * sunrise : 07:27
                 * sunset : 16:49
                 * time : 20181213
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$3BeanXX {
                /**
                 * sunrise : 07:27
                 * sunset : 16:50
                 * time : 20181214
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$4BeanXX {
                /**
                 * sunrise : 07:28
                 * sunset : 16:50
                 * time : 20181215
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$5BeanXX {
                /**
                 * sunrise : 07:29
                 * sunset : 16:50
                 * time : 20181216
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$6BeanXX {
                /**
                 * sunrise : 07:29
                 * sunset : 16:50
                 * time : 20181217
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$7BeanXX {
                /**
                 * sunrise : 07:30
                 * sunset : 16:51
                 * time : 20181218
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$8BeanX {
                /**
                 * sunrise : 07:31
                 * sunset : 16:51
                 * time : 20181219
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$9BeanX {
                /**
                 * sunrise : 07:31
                 * sunset : 16:52
                 * time : 20181220
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$10BeanX {
                /**
                 * sunrise : 07:32
                 * sunset : 16:52
                 * time : 20181221
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }
        }

        public static class ObserveBean {
            /**
             * precipitation : 0.0
             * update_time : 201812111540
             * degree : -1
             * weather : 晴
             * weather_short : 晴
             * humidity : 12
             * wind_direction : 8
             * pressure : 1032
             * weather_code : 00
             * wind_power : 2
             */

            private String precipitation;
            private String update_time;
            private String degree;
            private String weather;
            private String weather_short;
            private String humidity;
            private String wind_direction;
            private String pressure;
            private String weather_code;
            private String wind_power;

            public String getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(String precipitation) {
                this.precipitation = precipitation;
            }

            public String getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(String update_time) {
                this.update_time = update_time;
            }

            public String getDegree() {
                return degree;
            }

            public void setDegree(String degree) {
                this.degree = degree;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public String getWeather_short() {
                return weather_short;
            }

            public void setWeather_short(String weather_short) {
                this.weather_short = weather_short;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public String getPressure() {
                return pressure;
            }

            public void setPressure(String pressure) {
                this.pressure = pressure;
            }

            public String getWeather_code() {
                return weather_code;
            }

            public void setWeather_code(String weather_code) {
                this.weather_code = weather_code;
            }

            public String getWind_power() {
                return wind_power;
            }

            public void setWind_power(String wind_power) {
                this.wind_power = wind_power;
            }
        }

        public static class TipsBean {
            /**
             * observe : {"0":"你若安好，便是晴天~","1":"天冷了，多穿点衣服~"}
             */

            private ObserveBeanX observe;

            public ObserveBeanX getObserve() {
                return observe;
            }

            public void setObserve(ObserveBeanX observe) {
                this.observe = observe;
            }

            public static class ObserveBeanX {
                /**
                 * 0 : 你若安好，便是晴天~
                 * 1 : 天冷了，多穿点衣服~
                 */

                @SerializedName("0")
                private String _$0;
                @SerializedName("1")
                private String _$1;

                public String get_$0() {
                    return _$0;
                }

                public void set_$0(String _$0) {
                    this._$0 = _$0;
                }

                public String get_$1() {
                    return _$1;
                }

                public void set_$1(String _$1) {
                    this._$1 = _$1;
                }
            }
        }
    }
}
