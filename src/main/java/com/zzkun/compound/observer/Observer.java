package com.zzkun.compound.observer;

import com.zzkun.compound.ducks.AbstractDuck;

/**
 * Created by kun on 2016/4/27.
 */
public interface Observer {
    void update(AbstractDuck duck, String info);
}
