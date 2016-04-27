package com.zzkun.compound.factory;

import com.zzkun.compound.ducks.AbstractDuck;
import com.zzkun.compound.ducks.Quackable;

/**
 * Created by kun on 2016/4/27.
 */
public abstract class AbstractDuckFactory {
    public abstract AbstractDuck createMallardDuck();
    public abstract AbstractDuck createRedheadDuck();
    public abstract AbstractDuck createDuckCall();
    public abstract AbstractDuck createRubberDuck();
    public abstract AbstractDuck createGoose();
}
