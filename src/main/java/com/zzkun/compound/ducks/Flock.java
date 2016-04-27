package com.zzkun.compound.ducks;

import com.zzkun.compound.behavior.fly.NoFlyBehavior;
import com.zzkun.compound.behavior.swim.NoSwimBehavior;
import com.zzkun.compound.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kun on 2016/4/27.
 */
public class Flock extends AbstractDuck {

    private List<AbstractDuck> ducks = new ArrayList<>();

    public Flock() {
        super(new NoFlyBehavior(), new NoSwimBehavior());
    }

    public Flock add(AbstractDuck duck) {
        ducks.add(duck);
        return this;
    }

    @Override
    public void quack() {
        for(AbstractDuck duck : ducks)
            duck.quack();
    }

    @Override
    public void fly() {
        for(AbstractDuck duck : ducks)
            duck.fly();
    }

    @Override
    public void swim() {
        for(AbstractDuck duck : ducks)
            duck.swim();
    }

    @Override
    public void registerObserver(Observer observer) {
        for(AbstractDuck duck : ducks)
            duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers(String info) {
        // 无需通知
    }
}
