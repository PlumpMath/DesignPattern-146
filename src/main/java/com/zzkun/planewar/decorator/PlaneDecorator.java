package com.zzkun.planewar.decorator;

import com.zzkun.planewar.model.Position;
import com.zzkun.planewar.plane.BasePlane;

/**
 * Created by kun on 2016/3/22.
 */
public abstract class PlaneDecorator extends BasePlane {

    public PlaneDecorator(Position position, String name) {
        super(position, name);
    }

}
