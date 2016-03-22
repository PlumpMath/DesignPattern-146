package com.zzkun.planewar.factory;

import com.zzkun.planewar.behavior.color.RedColor;
import com.zzkun.planewar.behavior.fly.FastSpeedFly;
import com.zzkun.planewar.behavior.sound.BigSound;
import com.zzkun.planewar.model.Position;
import com.zzkun.planewar.plane.BasePlane;
import com.zzkun.planewar.plane.EnemyBoss;

/**
 * Created by kun on 2016/3/22.
 */
public class EnemyBossFactory extends PlaneFactory {
    @Override
    BasePlane createPlane(String name) {
        BasePlane res = new EnemyBoss(Position.random(), name);
        res.setColorBehavior(new RedColor());
        res.setFlyBehavior(new FastSpeedFly());
        res.setSoundBehavior(new BigSound());
        return res;
    }
}
