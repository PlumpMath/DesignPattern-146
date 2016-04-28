package com.zzkun.compound;

import com.zzkun.compound.ducks.AbstractDuck;
import com.zzkun.compound.ducks.Flock;
import com.zzkun.compound.factory.AbstractDuckFactory;
import com.zzkun.compound.factory.CountingAllDuckFactory;
import com.zzkun.compound.factory.CountingDuckFactory;
import com.zzkun.compound.observer.Quackologist;
import com.zzkun.compound.util.FlyCounter;
import com.zzkun.compound.util.QuackCounter;
import com.zzkun.compound.util.SwimCounter;

/**
 * 鸭鸣模拟器
 * Created by kun on 2016/4/27.
 */
public class DuckTest {

    void simulate(AbstractDuck duck) {
        duck.quack();
    }

    void fly(AbstractDuck duck) {
        duck.fly();
    }

    void swim(AbstractDuck duck) {
        duck.swim();
    }

    void simulate(AbstractDuckFactory factory) {
        AbstractDuck mallard1 = factory.createMallardDuck();
        AbstractDuck mallard2 = factory.createMallardDuck();
        Flock flockOfMallards = new Flock().add(mallard1).add(mallard2);

        AbstractDuck redheadDuck = factory.createRedheadDuck();
        AbstractDuck duckCall = factory.createDuckCall();
        AbstractDuck rubberDuck = factory.createRubberDuck();
        AbstractDuck gooseDuck = factory.createGoose();
        Flock flockOfDucks = new Flock().add(redheadDuck).add(duckCall).add(rubberDuck).add(gooseDuck).add(flockOfMallards);

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);
        System.out.println("鸭鸣次数：" + QuackCounter.getNumberOfQuacks());

        fly(flockOfDucks);
        System.out.println("飞行次数：" + FlyCounter.getNumberOfFlys());

        swim(flockOfDucks);
        System.out.println("游泳次数：" + SwimCounter.getNumberOfSwims());
    }

    public static void main(String[] args) {
        AbstractDuckFactory duckFactory = new CountingAllDuckFactory();
        new DuckTest().simulate(duckFactory);
    }

}
