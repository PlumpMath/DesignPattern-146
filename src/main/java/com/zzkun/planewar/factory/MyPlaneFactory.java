package com.zzkun.planewar.factory;

import com.zzkun.planewar.behavior.color.BlurColor;
import com.zzkun.planewar.behavior.fly.FastSpeedFly;
import com.zzkun.planewar.behavior.sound.MiddleSound;
import com.zzkun.planewar.model.Position;
import com.zzkun.planewar.plane.BasePlane;
import com.zzkun.planewar.plane.MyPlane;

/**
 * Created by kun on 2016/3/22.
 */
public class MyPlaneFactory extends PlaneFactory {
    @Override
    public BasePlane createPlane(String name) {
        BasePlane res = new MyPlane(Position.random(), name);
        res.setColorBehavior(new BlurColor());
        res.setFlyBehavior(new FastSpeedFly());
        res.setSoundBehavior(new MiddleSound());
        return res;
    }
}
