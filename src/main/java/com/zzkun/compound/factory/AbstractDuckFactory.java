package com.zzkun.compound.factory;

import com.zzkun.compound.ducks.Quackable;

/**
 * Created by kun on 2016/4/27.
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();

}
