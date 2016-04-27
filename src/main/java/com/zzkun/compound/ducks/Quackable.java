package com.zzkun.compound.ducks;

import com.zzkun.compound.observer.DuckObservable;

/**
 * Created by kun on 2016/4/27.
 */
public interface Quackable extends DuckObservable {
    void quack();
}
