package com.zzkun.choutuan.command;

import com.zzkun.choutuan.store.Barbecuefood;

/**
 * 山科烤肉拌饭下单命令
 * Created by kun on 2016/4/6.
 */
public class BarbecuefoodCommand implements Command {

    Barbecuefood store;

    public BarbecuefoodCommand(Barbecuefood store) {
        this.store = store;
    }

    @Override
    public void execute() {
        store.prepareFlovoring();
        store.prepareRice();
        store.assembleFood();
        store.pack();
        store.send();
        store.calcPrice();
    }
}
