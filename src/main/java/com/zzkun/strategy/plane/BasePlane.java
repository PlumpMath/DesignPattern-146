package com.zzkun.strategy.plane;

import com.zzkun.strategy.behavior.color.IColorBehavior;
import com.zzkun.strategy.behavior.fly.IFlyBehavior;
import com.zzkun.strategy.behavior.sound.ISoundBehavior;
import com.zzkun.strategy.model.Position;

import java.util.Random;

/**
 * Created by kun on 2016/3/9.
 * 所有飞机的基类
 */
public abstract class BasePlane {
    protected Position position;
    protected IColorBehavior colorBehavior;
    protected IFlyBehavior flyBehavior;
    protected ISoundBehavior soundBehavior;

    public BasePlane() {
        Random random = new Random();
        position = new Position(random.nextInt(100), random.nextInt(100));
    }

    public void setColorBehavior(IColorBehavior colorBehavior) {
        this.colorBehavior = colorBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setSoundBehavior(ISoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }

    public void show() {
        colorBehavior.showColor();
    }

    public void fly() {
        flyBehavior.changePosition(position);
    }

    public void makeSound() {
        soundBehavior.makeSound();
    }

    public abstract void display();
}
