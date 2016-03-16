package com.zzkun.strategy.behavior.sound;

/**
 * Created by kun on 2016/3/9.
 * 发出中型声音
 */
public class MiddleSound implements ISoundBehavior {

    @Override
    public void makeSound() {
        System.out.println("飞机发出100分贝轰鸣...");
    }
}
