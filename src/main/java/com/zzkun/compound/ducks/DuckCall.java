package com.zzkun.compound.ducks;


import com.zzkun.compound.observer.Observable;
import com.zzkun.compound.observer.Observer;

/**
 * 鸭鸣器
 * Created by kun on 2016/4/27.
 */
public class DuckCall implements Quackable {

    Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
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
