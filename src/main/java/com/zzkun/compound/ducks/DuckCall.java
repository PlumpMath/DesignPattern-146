package com.zzkun.compound.ducks;


import com.zzkun.compound.behavior.fly.NoFlyBehavior;
import com.zzkun.compound.behavior.swim.NoSwimBehavior;
import com.zzkun.compound.observer.Observable;
import com.zzkun.compound.observer.Observer;

/**
 * 鸭鸣器
 * Created by kun on 2016/4/27.
 */
public class DuckCall extends AbstractDuck {

    public DuckCall() {
        super(new NoFlyBehavior(), new NoSwimBehavior());
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers("quack");
    }
}
