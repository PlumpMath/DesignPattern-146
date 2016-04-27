package com.zzkun.compound.behavior.swim;

/**
 * Created by kun on 2016/4/27.
 */
public class NoSwimBehavior implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("我不会游泳...");
    }
}
