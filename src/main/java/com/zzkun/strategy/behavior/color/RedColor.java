package com.zzkun.strategy.behavior.color;

/**
 * Created by kun on 2016/3/9.
 * 飞机颜色为红色
 */
public class RedColor implements IColorBehavior {
    @Override
    public void showColor() {
        System.out.println("飞机颜色为红色...");
    }
}
