package com.zzkun.compound.ducks;

import com.zzkun.compound.behavior.fly.DirectFlyBehavior;
import com.zzkun.compound.behavior.swim.FrontCrawlSwimBehavior;
import com.zzkun.compound.observer.Observable;
import com.zzkun.compound.observer.Observer;

/**
 * 标准绿头鸭
 * Created by kun on 2016/4/27.
 */
public class MallardDuck extends AbstractDuck {

    Observable observable;

    public MallardDuck() {
        super(new DirectFlyBehavior(), new FrontCrawlSwimBehavior());
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers("quack");
    }
}
