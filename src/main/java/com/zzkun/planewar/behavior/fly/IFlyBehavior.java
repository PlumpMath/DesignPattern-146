package com.zzkun.planewar.behavior.fly;


import com.zzkun.planewar.model.Position;

/**
 * Created by kun on 2016/3/9.
 * 飞机飞行行为接口
 */
public interface IFlyBehavior {
    /**
     * 改变飞机位置
     * @param pos 飞机原位置
     */
    void changePosition(Position pos);
}
