package com.zzkun.compound.ducks;

import com.zzkun.compound.behavior.fly.FlyBehavior;
import com.zzkun.compound.behavior.swim.SwimBehavior;
import com.zzkun.compound.observer.DuckObservable;
import com.zzkun.compound.observer.Observable;
import com.zzkun.compound.observer.Observer;

/**
 * 抽象鸭子基类
 * Created by kun on 2016/4/27.
 */
public abstract class AbstractDuck implements Quackable, DuckObservable {

    protected FlyBehavior flyBehavior;
    protected SwimBehavior swimBehavior;
    protected Observable observable;

    public AbstractDuck(FlyBehavior flyBehavior, SwimBehavior swimBehavior) {
        this.flyBehavior = flyBehavior;
        this.swimBehavior = swimBehavior;
        observable = new Observable(this);
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setSwimBehavior(SwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }


    public void fly() {
        flyBehavior.changePosition();
    }

    public void swim() {
        swimBehavior.swim();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers(String info) {
        observable.notifyObservers(info);
    }

    @Override
    public abstract void quack();
}
