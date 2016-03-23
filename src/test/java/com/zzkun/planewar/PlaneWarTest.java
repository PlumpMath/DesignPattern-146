package com.zzkun.planewar;

import com.zzkun.planewar.behavior.color.RedColor;
import com.zzkun.planewar.behavior.fly.FastSpeedFly;
import com.zzkun.planewar.factory.EnemyBossFactory;
import com.zzkun.planewar.factory.EnemyPlaneFactory;
import com.zzkun.planewar.factory.MyPlaneFactory;
import com.zzkun.planewar.model.Position;
import com.zzkun.planewar.plane.EnemyBoss;
import com.zzkun.planewar.plane.EnemyPlane;
import com.zzkun.planewar.plane.MyPlane;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kun on 2016/3/21.
 */
public class PlaneWarTest {

    @Test
    public void test1() {
        MyPlane myPlane = (MyPlane) new MyPlaneFactory().createPlane("°夏沫浅雨つ");
        EnemyPlane enemyPlane1 = (EnemyPlane) new EnemyPlaneFactory().createPlane("、浅夏诗韵");
        EnemyPlane enemyPlane2 = (EnemyPlane) new EnemyPlaneFactory().createPlane("ンバ离8弃。");
        EnemyBoss boss = (EnemyBoss) new EnemyBossFactory().createPlane("这殇，太美、");

        myPlane.display();
        enemyPlane1.display();
        myPlane.makeSound();
        System.out.println();

        myPlane.setColorBehavior(new RedColor());
        myPlane.fly();
        myPlane.display();
        System.out.println();

        myPlane.destoryEnemy(enemyPlane1);
        myPlane.destoryEnemy(boss);
        System.out.println();
    }
}