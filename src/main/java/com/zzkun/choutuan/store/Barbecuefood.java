package com.zzkun.choutuan.store;

/**
 * 山科烤肉拌饭
 * Created by kun on 2016/3/30.
 */
public class Barbecuefood {

    public void prepareRice() {
        System.out.println("山科烤肉拌饭：正在蒸米饭...");
    }

    public void prepareFlovoring() {
        System.out.println("山科烤肉拌饭：正在制作调料...");
    }

    public void assembleFood() {
        System.out.println("山科烤肉拌饭：正在混合调料和米饭...");
    }

    public void pack() {
        System.out.println("山科烤肉拌饭：打包...");
    }

    public void calcPrice() {
        System.out.println("山科烤肉拌饭：订单价格：￥10");
    }

    public void send() {
        System.out.println("山科烤肉拌饭：正在急速派送");
    }

    public void cancle() {
        System.out.println("山科烤肉拌饭：取消订单成功");
    }
}
