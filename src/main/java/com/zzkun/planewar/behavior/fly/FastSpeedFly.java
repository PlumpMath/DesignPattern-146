package com.zzkun.planewar.behavior.fly;

import com.zzkun.planewar.model.Position;

/**
 * Created by kun on 2016/3/9.
 * 快速飞行
 */
public class FastSpeedFly implements IFlyBehavior {
    @Override
    public void changePosition(Position pos) {
        pos.move(0, 10);
        System.out.println("飞机向前移动了10个单位，目前坐标：" + pos);
    }
}
