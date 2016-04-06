package com.zzkun.choutuan.command;

import com.zzkun.choutuan.store.FourteenMonth;

/**
 * Created by kun on 2016/4/6.
 */
public class FourteenMonthCancleCommand implements Command {

    FourteenMonth store;

    public FourteenMonthCancleCommand(FourteenMonth store) {
        this.store = store;
    }

    @Override
    public void execute() {
        store.cancle();
    }
}
