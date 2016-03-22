package com.zzkun.planewar.observer;


import com.zzkun.planewar.plane.BasePlane;
import com.zzkun.planewar.plane.EnemyBoss;
import com.zzkun.planewar.plane.EnemyPlane;
import com.zzkun.planewar.util.ScoreCounter;

import java.util.Random;

/**
 * Created by kun on 2016/3/21.
 */
public class WinScoreObserver implements Observer {

    @Override
    public void update(BasePlane enemy) {
        ScoreCounter counter = ScoreCounter.getCounter();
        if(enemy instanceof EnemyPlane) {
            counter.addScore(7);
            System.out.println("帅呆了~，击中敌机增加7分~");
        } else if(enemy instanceof EnemyBoss) {
            counter.addScore(77);
            System.out.println("NB啊~，击中大Boss增加77分~");
        }
    }
}
