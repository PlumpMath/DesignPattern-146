package com.zzkun.elevator;

/**
 * Created by kun on 2016/4/20.
 */
public interface State {
    void pressTurnDown();
    void pressTurnUp();
    void reachStop();
    void repairElevator();
    void repairDone();
}
