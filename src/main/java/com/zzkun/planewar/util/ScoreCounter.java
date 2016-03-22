package com.zzkun.planewar.util;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by kun on 2016/3/21.
 */
public class ScoreCounter {

    private static ScoreCounter counter = null;

    private AtomicInteger cnt = new AtomicInteger(0);

    private ScoreCounter() {
    }

    public static synchronized ScoreCounter getCounter() {
        if(counter == null) {
            counter = new ScoreCounter();
        }
        return counter;
    }

    public int addScore(int x) {
        return cnt.addAndGet(x);
    }

    public int minusScore(int x) {
        return cnt.addAndGet(-x);
    }

    public int getScore() {
        return cnt.get();
    }
}
