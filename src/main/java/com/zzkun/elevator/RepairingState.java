package com.zzkun.elevator;

/**
 * Created by kun on 2016/4/20.
 */
public class RepairingState implements State {

    Elevator elevator;

    public RepairingState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void pressTurnDown() {
        System.out.printf("电梯%d：正在维修中，无法上升\n", elevator.id);
    }

    @Override
    public void pressTurnUp() {
        System.out.printf("电梯%d：正在维修中，无法下降\n", elevator.id);
    }

    @Override
    public void reachStop() {
        System.out.printf("电梯%d：正在维修中，无法运行\n", elevator.id);
    }

    @Override
    public void repairElevator() {
        System.out.printf("电梯%d：正在维修中...\n", elevator.id);
    }

    @Override
    public void repairDone() {
        elevator.current = 1;
        elevator.setState(elevator.stopState);
        System.out.printf("电梯%d：电梯维修完毕，可以正常使用\n", elevator.id);
    }
}
