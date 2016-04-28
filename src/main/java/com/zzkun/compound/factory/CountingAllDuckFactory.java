package com.zzkun.compound.factory;

import com.zzkun.compound.chicken.Chicken;
import com.zzkun.compound.chicken.ChickenAdapter;
import com.zzkun.compound.ducks.*;
import com.zzkun.compound.goose.Goose;
import com.zzkun.compound.goose.GooseAdapter;
import com.zzkun.compound.util.FlyCounter;
import com.zzkun.compound.util.QuackCounter;
import com.zzkun.compound.util.SwimCounter;

/**
 * Created by kun on 2016/4/28.
 */
public class CountingAllDuckFactory extends AbstractDuckFactory {

    @Override
    public AbstractDuck createMallardDuck() {
        return new FlyCounter(new QuackCounter(new SwimCounter(new MallardDuck())));
    }

    @Override
    public AbstractDuck createRedheadDuck() {
        return new FlyCounter(new QuackCounter(new SwimCounter(new RedheadDuck())));
    }

    @Override
    public AbstractDuck createDuckCall() {
        return new FlyCounter(new QuackCounter(new SwimCounter(new DuckCall())));
    }

    @Override
    public AbstractDuck createRubberDuck() {
        return new FlyCounter(new QuackCounter(new SwimCounter(new RubberDuck())));
    }

    @Override
    public AbstractDuck createGoose() {
        return new FlyCounter(new QuackCounter(new SwimCounter(new GooseAdapter(new Goose()))));
    }

    @Override
    public AbstractDuck createChicken() {
        return new FlyCounter(new QuackCounter(new SwimCounter(new ChickenAdapter(new Chicken()))));
    }
}
