package com.zzkun.compound.behavior.fly;

/**
 * Created by kun on 2016/4/27.
 */
public class RotateFlyBehavior implements FlyBehavior {
    @Override
    public void changePosition() {
        System.out.println("鸭子旋转飞行...");
    }
}
