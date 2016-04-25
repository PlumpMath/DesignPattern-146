package com.zzkun.elevator;

/**
 * Created by kun on 2016/4/20.
 */
public class People {
    Elevator elevator1, elevator2;
    int current;


    public People(Elevator elevator1, Elevator elevator2, int cur) {
        this.elevator1 = elevator1;
        this.elevator2 = elevator2;
        this.current = cur;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    void goUp() {
        if(current == 2) {
            System.out.println("您已经在最高层，按钮按不动");
            return;
        }
        if(elevator1.state == elevator1.stopState && elevator1.current == 1) {
            elevator1.pressTurnUp();
            current = 2;
        } else if(elevator2.state == elevator2.stopState && elevator2.current == 1) {
            elevator2.pressTurnUp();
            current = 2;
        } else {
            System.out.println("没有可用电梯");
        }
    }

    void goDown() {
        if(current == 1) {
            System.out.println("您已经在最底层，按钮按不动");
            return;
        }
        if(elevator1.state == elevator1.stopState && elevator1.current == 2) {
            elevator1.pressTurnDown();
            current = 1;
        } else if(elevator2.state == elevator2.stopState && elevator2.current == 2) {
            elevator2.pressTurnDown();
            current = 1;
        } else {
            System.out.println("没有可用电梯");
        }
    }

    void repaire(int id) {
        if(id == 1) {
            elevator1.repairElevator();
            elevator1.repairDone();
        }
        if(id == 2) {
            elevator2.repairElevator();
            elevator2.repairDone();
        }
    }
}
