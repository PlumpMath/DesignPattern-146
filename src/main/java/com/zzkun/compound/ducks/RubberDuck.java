package com.zzkun.compound.ducks;

import com.zzkun.compound.behavior.fly.RotateFlyBehavior;
import com.zzkun.compound.behavior.swim.CnvertedCrawlSwimBehavior;
import com.zzkun.compound.observer.Observable;
import com.zzkun.compound.observer.Observer;

/**
 * 橡皮鸭
 * Created by kun on 2016/4/27.
 */
public class RubberDuck extends AbstractDuck {

    Observable observable;

    public RubberDuck() {
        super(new RotateFlyBehavior(), new CnvertedCrawlSwimBehavior());
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObservers("quack");
    }
}
