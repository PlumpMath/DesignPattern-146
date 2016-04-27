package com.zzkun.compound.ducks;

import com.zzkun.compound.observer.Observable;
import com.zzkun.compound.observer.Observer;

/**
 * 标准绿头鸭
 * Created by kun on 2016/4/27.
 */
public class MallardDuck implements Quackable {

    Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
