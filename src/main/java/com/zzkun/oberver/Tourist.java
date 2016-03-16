package com.zzkun.oberver;

import java.util.*;

/**
 * Created by kun on 2016/3/16.
 */
public class Tourist extends Subscriber {

    private String name;
    private double temperature;
    private String hotelSite;


    public Tourist(String name) {
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
        } else if(o instanceof Hotel) {
            Hotel hotel = (Hotel) o;
            hotelSite = hotel.getSite();
        }
        talk();
    }

    @Override
    public void talk() {
        System.out.println("游客" + name + "：\n当前天气：" + temperature + " 目标旅馆地址：" + hotelSite);
    }
}
