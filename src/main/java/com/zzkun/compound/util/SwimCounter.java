package com.zzkun.compound.util;

import com.zzkun.compound.ducks.AbstractDuck;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by kun on 2016/4/28.
 */
public class SwimCounter extends DuckDecorator {

    private static AtomicInteger numberOfSwims = new AtomicInteger(0);

    public SwimCounter(AbstractDuck duck) {
        super(duck);
    }

    @Override
    public void swim() {
        super.swim();
        numberOfSwims.incrementAndGet();
    }

    public static int getNumberOfSwims() {
        return numberOfSwims.get();
    }
}
