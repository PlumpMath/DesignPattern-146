package com.zzkun.strategy.plane;

import com.zzkun.strategy.behavior.color.RedColor;
import com.zzkun.strategy.behavior.fly.FastSpeedFly;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kun on 2016/3/9.
 * Junit测试类，测试飞机大战策略模式
 */
public class BasePlaneTest {

    @Test
    public void test1() throws Exception {
        BasePlane myPlane = new BlueSpyPlane();
        myPlane.display();
        myPlane.show();
        myPlane.fly();
        myPlane.makeSound();
    }

    @Test
    public void test2() throws Exception {
        BasePlane myPlane = new AerialTanker();
        myPlane.setColorBehavior(new RedColor());
        myPlane.setFlyBehavior(new FastSpeedFly());
        myPlane.display();
        myPlane.show();
        myPlane.fly();
        myPlane.makeSound();
    }
}