package com.zzkun.compound.observer;

import com.zzkun.compound.ducks.AbstractDuck;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kun on 2016/4/27.
 */
public class Observable implements DuckObservable {

    List<Observer> list = new ArrayList<>();
    AbstractDuck duck;

    public Observable(AbstractDuck duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void notifyObservers(String info) {
        for(Observer observer : list)
            observer.update(duck, info);
    }
}
