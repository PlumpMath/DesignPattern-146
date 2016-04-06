package com.zzkun.choutuan.store;

/**
 * 老青岛鸡肉卷连锁店山科大北门分店
 * Created by kun on 2016/3/30.
 */
public class OldQDChickenRolls {

    public void prepare() {
        System.out.println("老青岛鸡肉卷连锁店山科大北门分店：正在准备鸡肉...");
    }

    public void make () {
        System.out.println("老青岛鸡肉卷连锁店山科大北门分店：厨师正在精心制作");
    }

    public void send() {
        System.out.println("老青岛鸡肉卷连锁店山科大北门分店：正在急速派送");
    }

    public void cancle() {
        System.out.println("老青岛鸡肉卷连锁店山科大北门分店：取消订单成功");
    }


    public void calcPrice() {
        System.out.println("老青岛鸡肉卷连锁店山科大北门分店：订单价格：￥20");
    }
}
