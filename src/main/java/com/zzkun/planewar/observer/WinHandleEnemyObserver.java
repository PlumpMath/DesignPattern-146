package com.zzkun.planewar.observer;

import com.zzkun.planewar.plane.BasePlane;

/**
 * Created by kun on 2016/3/21.
 */
public class WinHandleEnemyObserver implements Observer {

    @Override
    public void update(BasePlane enemy) {
        System.out.println("敌机" + enemy.getName() + "已经阵亡~");
    }
}
