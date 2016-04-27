package com.zzkun.compound;

import com.zzkun.compound.ducks.Flock;
import com.zzkun.compound.ducks.Quackable;
import com.zzkun.compound.factory.AbstractDuckFactory;
import com.zzkun.compound.factory.CountingDuckFactory;
import com.zzkun.compound.goose.Goose;
import com.zzkun.compound.goose.GooseAdapter;
import com.zzkun.compound.observer.Quackologist;
import com.zzkun.compound.util.QuackCounter;

/**
 * 鸭鸣模拟器
 * Created by kun on 2016/4/27.
 */
public class DuckSimulator {

    void simulate(Quackable duck) {
        duck.quack();
    }

    void simulate(AbstractDuckFactory factory) {
        Quackable mallard1 = factory.createMallardDuck();
        Quackable mallard2 = factory.createMallardDuck();
        Quackable mallard3 = factory.createMallardDuck();
        Quackable mallard4 = factory.createMallardDuck();
        Flock flockOfMallards = new Flock().add(mallard1).add(mallard2).add(mallard3).add(mallard4);

        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Flock flockOfDucks = new Flock().add(redheadDuck).add(duckCall).add(rubberDuck).add(gooseDuck).add(flockOfMallards);

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);
        System.out.println("鸭鸣次数：" + QuackCounter.getNumberOfQuacks());
    }

    public static void main(String[] args) {
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        new DuckSimulator().simulate(duckFactory);
    }

}
