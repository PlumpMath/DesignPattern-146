package com.zzkun.elevator;

/**
 * Created by kun on 2016/4/20.
 */
public class ElevatorTest {
    public static void main(String[] args) {
        Elevator elevator1 = new Elevator(1, 1);
        Elevator elevator2 = new Elevator(1, 2);
        People people1 = new People(elevator1, elevator2, 1);
        People people2 = new People(elevator1, elevator2, 1);
        People people3 = new People(elevator1, elevator2, 1);
        people1.goUp(); people1.goUp();
        System.out.println();
        people2.goUp(); people2.goDown();
        System.out.println();
        people3.goUp(); people3.goDown();
        System.out.println();

        people1.repaire(1);
        people2.repaire(2);
    }
}
