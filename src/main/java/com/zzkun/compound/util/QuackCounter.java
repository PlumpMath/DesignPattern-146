package com.zzkun.compound.util;

import com.zzkun.compound.ducks.AbstractDuck;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 鸭鸣计数器，装饰者模式
 * Created by kun on 2016/4/27.
 */
public class QuackCounter extends DuckDecorator {

    private static AtomicInteger numberOfQuacks = new AtomicInteger(0);

    public QuackCounter(AbstractDuck duck) {
        super(duck);
    }

    @Override
    public void quack() {
        super.quack();
        numberOfQuacks.incrementAndGet();
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks.get();
    }
}
