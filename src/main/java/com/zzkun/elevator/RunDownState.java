package com.zzkun.elevator;

/**
 * Created by kun on 2016/4/20.
 */
public class RunDownState implements State {

    Elevator elevator;

    public RunDownState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void pressTurnDown() {
        System.out.printf("电梯%d：正在下降，请耐心等待\n", elevator.id);
    }

    @Override
    public void pressTurnUp() {
        System.out.printf("电梯%d：正在下降，无法上升！\n", elevator.id);
    }

    @Override
    public void reachStop() {
        System.out.printf("电梯%d：已经到达一楼，门已经打开\n", elevator.id);
        elevator.setState(elevator.stopState);
    }

    @Override
    public void repairElevator() {
        System.out.printf("电梯%d：正在运行，无法检修\n", elevator.id);
    }

    @Override
    public void repairDone() {
        System.out.printf("电梯%d：不是检修状态...\n", elevator.id);
    }
}
