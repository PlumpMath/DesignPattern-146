package com.zzkun.planewar.plane;

import com.zzkun.planewar.behavior.color.BlurColor;
import com.zzkun.planewar.behavior.color.RedColor;
import com.zzkun.planewar.behavior.fly.FastSpeedFly;
import com.zzkun.planewar.behavior.sound.BigSound;
import com.zzkun.planewar.behavior.sound.MiddleSound;
import com.zzkun.planewar.model.Position;

/**
 * Created by kun on 2016/3/21.
 */
public class EnemyBoss extends BasePlane {

    public EnemyBoss(Position position, String name) {
        super(position, name);

    }

    @Override
    public void display() {
        System.out.print("我是大Boss" + name);
        colorBehavior.showColor();
    }
}
