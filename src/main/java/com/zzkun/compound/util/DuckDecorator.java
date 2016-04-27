package com.zzkun.compound.util;

import com.zzkun.compound.behavior.fly.FlyBehavior;
import com.zzkun.compound.behavior.fly.NoFlyBehavior;
import com.zzkun.compound.behavior.swim.NoSwimBehavior;
import com.zzkun.compound.behavior.swim.SwimBehavior;
import com.zzkun.compound.ducks.AbstractDuck;
import com.zzkun.compound.observer.Observer;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by kun on 2016/4/27.
 */
public abstract class DuckDecorator extends AbstractDuck {

    AbstractDuck duck;

    public DuckDecorator(AbstractDuck duck) {
        super(new NoFlyBehavior(), new NoSwimBehavior());
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers(String info) {
        duck.notifyObservers(info);
    }
}
