package com.zzkun.compound.behavior.fly;

/**
 * Created by kun on 2016/4/27.
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void changePosition() {
        System.out.println("不能飞行...");
    }
}
