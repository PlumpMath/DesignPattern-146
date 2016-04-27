package com.zzkun.compound.ducks;

import com.zzkun.compound.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kun on 2016/4/27.
 */
public class Flock implements Quackable {

    private List<Quackable> ducks = new ArrayList<>();

    public Flock add(Quackable duck) {
        ducks.add(duck);
        return this;
    }

    @Override
    public void quack() {
        for(Quackable duck : ducks)
            duck.quack();
    }

    @Override
    public void registerObserver(Observer observer) {
        for(Quackable duck : ducks)
            duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
    }
}
