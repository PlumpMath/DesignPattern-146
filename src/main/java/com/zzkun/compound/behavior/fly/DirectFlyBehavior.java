package com.zzkun.compound.behavior.fly;

/**
 * Created by kun on 2016/4/27.
 */
public class DirectFlyBehavior implements FlyBehavior {
    @Override
    public void changePosition() {
        System.out.println("鸭子直线飞向前方...");
    }
}
