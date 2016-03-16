package com.zzkun.strategy.plane;

import com.zzkun.strategy.behavior.color.BlurColor;
import com.zzkun.strategy.behavior.fly.FastSpeedFly;
import com.zzkun.strategy.behavior.sound.SilentSound;

/**
 * Created by kun on 2016/3/9.
 * 蓝色侦察机
 */
public class BlueSpyPlane extends BasePlane {

    public BlueSpyPlane() {
        super();
        colorBehavior = new BlurColor();
        flyBehavior = new FastSpeedFly();
        soundBehavior = new SilentSound();
    }

    @Override
    public void display() {
        System.out.println("我是BlueSpyPlane（蓝色侦察机）...");
    }
}
