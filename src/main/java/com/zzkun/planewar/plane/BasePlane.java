package com.zzkun.planewar.plane;

import com.zzkun.planewar.behavior.color.IColorBehavior;
import com.zzkun.planewar.behavior.fly.IFlyBehavior;
import com.zzkun.planewar.behavior.sound.ISoundBehavior;
import com.zzkun.planewar.model.Position;
import com.zzkun.planewar.util.ScoreCounter;

import java.util.Observable;

/**
 * Created by kun on 2016/3/9.
 * 所有飞机的基类
 */
public abstract class BasePlane {

    protected String name;
    protected Position position;
    protected IColorBehavior colorBehavior;
    protected IFlyBehavior flyBehavior;
    protected ISoundBehavior soundBehavior;

    public BasePlane(Position position, String name) {
        this.position = position;
        this.name = name;
    }

    public String getName() {
        return name;
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
