package com.zzkun.compound.factory;

import com.zzkun.compound.chicken.Chicken;
import com.zzkun.compound.chicken.ChickenAdapter;
import com.zzkun.compound.ducks.*;
import com.zzkun.compound.goose.Goose;
import com.zzkun.compound.goose.GooseAdapter;
import com.zzkun.compound.util.QuackCounter;

/**
 * Created by kun on 2016/4/27.
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public AbstractDuck createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public AbstractDuck createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public AbstractDuck createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public AbstractDuck createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public AbstractDuck createGoose() {
        return new QuackCounter(new GooseAdapter(new Goose()));
    }

    @Override
    public AbstractDuck createChicken() {
        return new QuackCounter(new ChickenAdapter(new Chicken()));
    }
}
