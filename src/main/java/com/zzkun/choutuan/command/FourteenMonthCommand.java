package com.zzkun.choutuan.command;

import com.zzkun.choutuan.store.FourteenMonth;

/**
 * 十四月餐厅下订单命令
 * Created by kun on 2016/4/6.
 */
public class FourteenMonthCommand implements Command {

    FourteenMonth store;

    public FourteenMonthCommand(FourteenMonth store) {
        this.store = store;
    }

    @Override
    public void execute() {
        store.prepare();
        store.cooking();
        store.send();
        store.calcPrice();
    }
}
