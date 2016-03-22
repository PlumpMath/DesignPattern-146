package com.zzkun.planewar.model;

import java.util.Random;

/**
 * Created by kun on 2016/3/9.
 */
public class Position {
    int x;
    int y;

    public Position() {
        x = y = 0;
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public static Position random() {
        Random random = new Random();
        return new Position(random.nextInt(100), random.nextInt(100));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
