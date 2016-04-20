package com.zzkun.elevator;

/**
 * Created by kun on 2016/4/20.
 */
public class StopState implements State {

    Elevator elevator;

    public StopState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void pressTurnDown() {
        if(elevator.current == 2) {
            System.out.printf("电梯%d：正在下降...\n", elevator.id);
            elevator.setState(elevator.runDownState);
            elevator.reachStop();
            elevator.current = 1;
        } else if(elevator.current == 1) {
            System.out.printf("电梯%d：正在一楼，电梯已经开门.\n", elevator.id);
        }
    }

    @Override
    public void pressTurnUp() {
        if(elevator.current == 1) {
            System.out.printf("电梯%d：正在上升...\n", elevator.id);
            elevator.setState(elevator.runUpState);
            elevator.reachStop();
            elevator.current = 2;
        } else if(elevator.current == 2) {
            System.out.printf("电梯%d：正在二楼，电梯已经开门.\n", elevator.id);
        }
    }

    @Override
    public void reachStop() {
        System.out.printf("电梯%d：电梯已经停止.\n", elevator.id);
    }

    @Override
    public void repairElevator() {
        elevator.setState(elevator.repairingState);
        System.out.printf("电梯%d：电梯正在维修中.\n", elevator.id);
        System.out.println("电梯正在维修中");
    }

    @Override
    public void repairDone() {
        System.out.printf("电梯%d：抱歉，电梯不是维修状态...\n", elevator.id);
    }
}
