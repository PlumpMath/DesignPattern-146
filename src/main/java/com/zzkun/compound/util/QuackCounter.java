package com.zzkun.compound.util;

import com.zzkun.compound.ducks.Quackable;
import com.zzkun.compound.observer.Observer;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 鸭鸣计数器，装饰者模式
 * Created by kun on 2016/4/27.
 */
public class QuackCounter implements Quackable {

    Quackable duck;
    private static AtomicInteger numberOfQuacks = new AtomicInteger(0);

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks.incrementAndGet();
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks.get();
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
