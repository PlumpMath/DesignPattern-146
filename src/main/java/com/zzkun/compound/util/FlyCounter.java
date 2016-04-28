package com.zzkun.compound.util;

import com.zzkun.compound.ducks.AbstractDuck;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by kun on 2016/4/28.
 */
public class FlyCounter extends DuckDecorator {

    private static AtomicInteger numberOfFlys = new AtomicInteger(0);

    public FlyCounter(AbstractDuck duck) {
        super(duck);
    }

    @Override
    public void fly() {
        super.fly();
        numberOfFlys.incrementAndGet();
    }

    public static int getNumberOfFlys() {
        return numberOfFlys.get();
    }
}
