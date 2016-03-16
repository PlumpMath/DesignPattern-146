package com.zzkun.oberver;

import java.util.Observable;

/**
 * Created by kun on 2016/3/16.
 */
public class Guide extends Subscriber {

    private String name;
    private double temperature;
    private double airQuality;
    private String hotelSite;
    private String hotelPhone;

    public Guide(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Weather) {
            Weather weather = (Weather) o;
            temperature = weather.getTemperature();
            airQuality = weather.getAirQuality();
        } else if(o instanceof Hotel) {
            Hotel hotel = (Hotel) o;
            hotelSite = hotel.getSite();
            hotelPhone = hotel.getPhone();
        }
        talk();
    }

    @Override
    public void talk() {
        System.out.println("导游" + name + "：\n当前天气：" + temperature + " 当前空气质量状况：" + airQuality +
                " 目标旅馆地址：" + hotelSite + " 旅馆电话：" + hotelPhone);
    }
}
