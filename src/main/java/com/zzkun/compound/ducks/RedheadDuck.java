package com.zzkun.compound.ducks;

import com.zzkun.compound.behavior.fly.DirectFlyBehavior;
import com.zzkun.compound.behavior.swim.CnvertedCrawlSwimBehavior;
import com.zzkun.compound.observer.Observable;
import com.zzkun.compound.observer.Observer;

/**
 * 红头鸭
 * Created by kun on 2016/4/27.
 */
public class RedheadDuck extends AbstractDuck {

    Observable observable;

    public RedheadDuck() {
        super(new DirectFlyBehavior(), new CnvertedCrawlSwimBehavior());
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers("quack");
    }
}
