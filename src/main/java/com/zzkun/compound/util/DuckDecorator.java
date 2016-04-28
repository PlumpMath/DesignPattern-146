package com.zzkun.compound.util;

import com.zzkun.compound.behavior.fly.FlyBehavior;
import com.zzkun.compound.behavior.fly.NoFlyBehavior;
import com.zzkun.compound.behavior.swim.NoSwimBehavior;
import com.zzkun.compound.behavior.swim.SwimBehavior;
import com.zzkun.compound.ducks.AbstractDuck;
import com.zzkun.compound.observer.Observer;

/**
 * 鸭子装饰者抽象基类
 * Created by kun on 2016/4/27.
 */
public abstract class DuckDecorator extends AbstractDuck {

    AbstractDuck duck;

    public DuckDecorator(AbstractDuck duck) {
        super(new NoFlyBehavior(), new NoSwimBehavior());
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack(); //交给被装饰着处理
    }

    @Override
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        duck.setFlyBehavior(flyBehavior); //交给被装饰着处理
    }

    @Override
    public void setSwimBehavior(SwimBehavior swimBehavior) {
        duck.setSwimBehavior(swimBehavior); //交给被装饰着处理
    }

    @Override
    public void fly() {
        duck.fly(); //交给被装饰着处理
    }

    @Override
    public void swim() {
        duck.swim(); //交给被装饰着处理
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer); //交给被装饰着处理
    }

    @Override
    public void notifyObservers(String info) {
        duck.notifyObservers(info); //交给被装饰着处理
    }
}
