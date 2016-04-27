package com.zzkun.compound.factory;

import com.zzkun.compound.ducks.*;
import com.zzkun.compound.goose.Goose;
import com.zzkun.compound.goose.GooseAdapter;

/**
 * Created by kun on 2016/4/27.
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public AbstractDuck createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public AbstractDuck createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public AbstractDuck createDuckCall() {
        return new DuckCall();
    }

    @Override
    public AbstractDuck createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public AbstractDuck createGoose() {
        return new GooseAdapter(new Goose());
    }
}
