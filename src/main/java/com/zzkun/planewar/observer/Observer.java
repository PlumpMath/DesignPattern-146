package com.zzkun.planewar.observer;

import com.zzkun.planewar.plane.BasePlane;

/**
 * Created by kun on 2016/3/21.
 */
public interface Observer {
    void update(BasePlane enemy);
}
