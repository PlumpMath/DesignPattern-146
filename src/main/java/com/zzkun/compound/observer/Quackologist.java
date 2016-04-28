package com.zzkun.compound.observer;

import com.zzkun.compound.ducks.AbstractDuck;

/**
 * Created by kun on 2016/4/27.
 */
public class Quackologist implements Observer {

    @Override
    public void update(AbstractDuck duck, String info) {
        System.out.println("监视器：" + info + " " + duck);
    }
}
