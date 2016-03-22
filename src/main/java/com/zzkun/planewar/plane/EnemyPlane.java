package com.zzkun.planewar.plane;

import com.zzkun.planewar.behavior.color.BlurColor;
import com.zzkun.planewar.behavior.color.GreenColor;
import com.zzkun.planewar.behavior.fly.FastSpeedFly;
import com.zzkun.planewar.behavior.fly.SlowSpeedFly;
import com.zzkun.planewar.behavior.sound.MiddleSound;
import com.zzkun.planewar.behavior.sound.SilentSound;
import com.zzkun.planewar.model.Position;

/**
 * Created by kun on 2016/3/21.
 */
public class EnemyPlane extends BasePlane {

    public EnemyPlane(Position position, String name) {
        super(position, name);
    }

    @Override
    public void display() {
        System.out.print("我是普通敌机" + name);
        colorBehavior.showColor();
    }
}
