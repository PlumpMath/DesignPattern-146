package com.zzkun.compound.goose;

import com.zzkun.compound.ducks.Quackable;
import com.zzkun.compound.observer.Observable;
import com.zzkun.compound.observer.Observer;

/**
 * Created by kun on 2016/4/27.
 */
public class GooseAdapter implements Quackable {

    private Goose goose;
    private Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
