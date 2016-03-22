package com.zzkun.planewar.plane;

import com.zzkun.planewar.behavior.color.BlurColor;
import com.zzkun.planewar.behavior.fly.FastSpeedFly;
import com.zzkun.planewar.behavior.sound.MiddleSound;
import com.zzkun.planewar.model.Position;
import com.zzkun.planewar.observer.Observer;
import com.zzkun.planewar.observer.WinHandleEnemyObserver;
import com.zzkun.planewar.observer.WinScoreObserver;

import java.util.Vector;

/**
 * Created by kun on 2016/3/21.
 */
public class MyPlane extends BasePlane {

    Vector<Observer> observers = new Vector<>();

    public MyPlane(Position position, String name) {
        super(position, name);
        observers.add(new WinHandleEnemyObserver());
        observers.add(new WinScoreObserver());
    }

    public void destoryEnemy(BasePlane enemy) {
        for(Observer observer: observers) {
            observer.update(enemy);
        }
    }

    @Override
    public void display() {
        System.out.print("我就是" + name);
        colorBehavior.showColor();
    }
}
