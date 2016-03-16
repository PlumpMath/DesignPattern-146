package com.zzkun.oberver;

import java.util.Observable;

/**
 * Created by kun on 2016/3/16.
 */
public class Hotel extends Observable {

    private String site;
    private String traffic;
    private String phone;

    public Hotel(String site, String traffic, String phone) {
        this.site = site;
        this.traffic = traffic;
        this.phone = phone;
        hotelInfoChanged();
    }

    public void setHotelInfo(String site, String traffic, String phone) {
        this.site = site;
        this.traffic = traffic;
        this.phone = phone;
        hotelInfoChanged();
    }

    public void hotelInfoChanged() {
        setChanged();
        notifyObservers();
    }

    public String getSite() {
        return site;
    }

    public String getTraffic() {
        return traffic;
    }

    public String getPhone() {
        return phone;
    }

    public void setSite(String site) {
        this.site = site;
        hotelInfoChanged();
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
        hotelInfoChanged();
    }

    public void setPhone(String phone) {
        this.phone = phone;
        hotelInfoChanged();
    }
}
