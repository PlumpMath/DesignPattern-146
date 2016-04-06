package com.zzkun.choutuan.command;

import com.zzkun.choutuan.store.Barbecuefood;

/**
 * 山科烤肉拌饭取消订单命令
 * Created by kun on 2016/4/6.
 */
public class BarbecuefoodCancleCommand implements Command {


    Barbecuefood store;

    public BarbecuefoodCancleCommand(Barbecuefood store) {
        this.store = store;
    }

    @Override
    public void execute() {
        store.cancle();
    }
}
