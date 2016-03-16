package com.zzkun.strategy.plane;

import com.zzkun.strategy.behavior.color.RedColor;
import com.zzkun.strategy.behavior.fly.FastSpeedFly;
import com.zzkun.strategy.behavior.sound.BigSound;

/**
 * Created by kun on 2016/3/9.
 * 红色战斗机
 */
public class RedFighterPlane extends BasePlane {

    public RedFighterPlane() {
        super();
        colorBehavior = new RedColor();
        flyBehavior = new FastSpeedFly();
        soundBehavior = new BigSound();
    }

    @Override
    public void display() {
        System.out.println("我是RedFighterPlane（红色战斗机）...");
    }
}
