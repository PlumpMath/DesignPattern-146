package com.zzkun.compound.chicken;

import com.zzkun.compound.behavior.fly.DirectFlyBehavior;
import com.zzkun.compound.behavior.swim.FrontCrawlSwimBehavior;
import com.zzkun.compound.behavior.swim.NoSwimBehavior;
import com.zzkun.compound.ducks.AbstractDuck;
import com.zzkun.compound.observer.Observable;

/**
 * Created by kun on 2016/4/27.
 */
public class ChickenAdapter extends AbstractDuck {

    private Chicken chicken;

    public ChickenAdapter(Chicken chicken) {
        super(new DirectFlyBehavior(), new NoSwimBehavior());
        this.chicken = chicken;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        chicken.chuckle();
        notifyObservers("quack");
    }
}
