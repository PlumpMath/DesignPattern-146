package com.zzkun.oberver;

import java.util.*;

/**
 * Created by kun on 2016/3/16.
 */
public abstract class Subscriber implements Observer {

    private Vector<Observable> infoList = new Vector<>();

    public abstract void talk();

    public Subscriber subscribe(Observable observable) {
        infoList.add(observable);
        observable.addObserver(this);
        update(observable, null);
        return this;
    }

    public void cancelSubscribe(Observable observable) {
        observable.deleteObserver(this);
        infoList.remove(observable);
    }
}
