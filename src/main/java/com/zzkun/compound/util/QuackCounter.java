package com.zzkun.compound.util;

import com.zzkun.compound.behavior.fly.NoFlyBehavior;
import com.zzkun.compound.behavior.swim.NoSwimBehavior;
import com.zzkun.compound.ducks.AbstractDuck;
import com.zzkun.compound.ducks.Quackable;
import com.zzkun.compound.observer.Observer;

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
        duck.quack();
        numberOfQuacks.incrementAndGet();
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks.get();
    }
}
