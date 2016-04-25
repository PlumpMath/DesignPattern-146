package com.zzkun.elevator;

/**
 * Created by kun on 2016/4/20.
 */
public interface State {
    // 乘客按下上升按钮
    void pressTurnDown();

    // 乘客按下下降按钮
    void pressTurnUp();

    // 电梯到达目的地，停下来并开门
    void reachStop();

    // 检修电梯
    void repairElevator();

    // 完成电梯检修
    void repairDone();
}
