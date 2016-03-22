package com.zzkun.planewar.factory;

import com.zzkun.planewar.behavior.color.GreenColor;
import com.zzkun.planewar.behavior.fly.SlowSpeedFly;
import com.zzkun.planewar.behavior.sound.SilentSound;
import com.zzkun.planewar.model.Position;
import com.zzkun.planewar.plane.BasePlane;
import com.zzkun.planewar.plane.EnemyPlane;

/**
 * Created by kun on 2016/3/22.
 */
public class EnemyPlaneFactory extends PlaneFactory {
    @Override
    BasePlane createPlane(String name) {
        BasePlane res = new EnemyPlane(Position.random(), name);
        res.setColorBehavior(new GreenColor());
        res.setFlyBehavior(new SlowSpeedFly());
        res.setSoundBehavior(new SilentSound());
        return res;
    }
}
