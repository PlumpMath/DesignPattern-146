package com.zzkun.elevator;

/**
 * Created by kun on 2016/4/20.
 */
public class Elevator {

    State repairingState;
    State runUpState;
    State runDownState;
    State stopState;
    State state;

    int current = 0;
    int id;

    public Elevator(int current, int id) {
        this.current = current;
        this.id = id;
        repairingState = new RepairingState(this);
        stopState = new StopState(this);
        runUpState = new RunUpState(this);
        runDownState = new RunDownState(this);
        state = stopState;
    }

    public void setState(State state) {
        this.state = state;
    }

    void pressTurnDown() {
        state.pressTurnDown();
    }
    void pressTurnUp() {
        state.pressTurnUp();
    }
    void repairElevator() {
        state.repairElevator();
    }
    void repairDone() {
        state.repairDone();
    }
    void reachStop() {
        state.reachStop();
    }
}
