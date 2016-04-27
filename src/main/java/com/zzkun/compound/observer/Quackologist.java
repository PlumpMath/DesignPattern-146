package com.zzkun.compound.observer;

/**
 * Created by kun on 2016/4/27.
 */
public class Quackologist implements Observer {

    @Override
    public void update(DuckObservable duck) {
        System.out.println("鸭鸣监视器：" + duck);
    }
}
