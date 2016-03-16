package com.zzkun.oberver;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by kun on 2016/3/16.
 */
public class MyTest {

    @Test
    public void test() {

        Weather weather = new Weather(23, 100, 101);
        Hotel hotel = new Hotel("青岛皇家旅馆", "良好", "17854258245");
        Guide guide = new Guide("小王");
        Tourist tourist = new Tourist("小张");

        guide.subscribe(weather).subscribe(hotel);
        tourist.subscribe(weather).subscribe(hotel);

        weather.setTemperature(30);

    }
}