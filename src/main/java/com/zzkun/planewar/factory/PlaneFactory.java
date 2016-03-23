package com.zzkun.planewar.factory;

import com.zzkun.planewar.plane.BasePlane;

/**
 * Created by kun on 2016/3/22.
 */
public abstract class PlaneFactory {
    abstract public BasePlane createPlane(String name);
}
