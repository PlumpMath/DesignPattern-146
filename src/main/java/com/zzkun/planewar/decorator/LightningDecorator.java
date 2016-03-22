package com.zzkun.planewar.decorator;

import com.zzkun.planewar.model.Position;
import com.zzkun.planewar.plane.BasePlane;

/**
 * Created by kun on 2016/3/22.
 */
public class LightningDecorator extends PlaneDecorator {

    BasePlane plane;

    public LightningDecorator(Position position, String name) {
        super(position, name);
    }

    @Override
    public void display() {
        plane.display();
        System.out.println("喷气~~~");
    }
}
