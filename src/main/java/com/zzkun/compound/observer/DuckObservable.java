package com.zzkun.compound.observer;

/**
 * Created by kun on 2016/4/27.
 */
public interface DuckObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
