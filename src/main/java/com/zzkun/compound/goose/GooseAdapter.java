package com.zzkun.compound.goose;

import com.zzkun.compound.behavior.fly.DirectFlyBehavior;
import com.zzkun.compound.behavior.swim.FrontCrawlSwimBehavior;
import com.zzkun.compound.ducks.AbstractDuck;
import com.zzkun.compound.ducks.Quackable;
import com.zzkun.compound.observer.Observable;
import com.zzkun.compound.observer.Observer;

/**
 * Created by kun on 2016/4/27.
 */
public class GooseAdapter extends AbstractDuck {

    private Goose goose;

    public GooseAdapter(Goose goose) {
        super(new DirectFlyBehavior(), new FrontCrawlSwimBehavior());
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
        notifyObservers("quack");
    }
}
