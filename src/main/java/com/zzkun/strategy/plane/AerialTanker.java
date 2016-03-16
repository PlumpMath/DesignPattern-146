package com.zzkun.strategy.plane;

import com.zzkun.strategy.behavior.color.GreenColor;
import com.zzkun.strategy.behavior.fly.SlowSpeedFly;
import com.zzkun.strategy.behavior.sound.BigSound;
import com.zzkun.strategy.behavior.sound.MiddleSound;

/**
 * Created by kun on 2016/3/9.
 * 空中加油机
 */
public class AerialTanker extends BasePlane {
    public AerialTanker() {
        super();
        colorBehavior = new GreenColor();
        flyBehavior = new SlowSpeedFly();
        soundBehavior = new BigSound();
    }

    @Override
    public void display() {
        System.out.println("我是AerialTanker（空中加油机）...");
    }
}
