package com.zzkun.strategy.behavior.sound;

/**
 * Created by kun on 2016/3/9.
 * 无声
 */
public class SilentSound implements ISoundBehavior {

    @Override
    public void makeSound() {
        System.out.println("无声飞机...静音...");
    }
}
