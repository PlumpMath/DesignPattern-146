package com.zzkun.strategy.behavior.sound;

/**
 * Created by kun on 2016/3/9.
 * 发出巨大声音
 */
public class BigSound implements ISoundBehavior {

    @Override
    public void makeSound() {
        System.out.println("飞机发出200分贝巨大轰鸣...");
    }
}
