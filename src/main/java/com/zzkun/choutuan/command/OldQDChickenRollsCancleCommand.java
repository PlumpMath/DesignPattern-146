package com.zzkun.choutuan.command;

import com.zzkun.choutuan.store.OldQDChickenRolls;

/**
 * 老青岛鸡肉卷连锁店山科大北门分店下订单命令
 * Created by kun on 2016/4/6.
 */
public class OldQDChickenRollsCancleCommand implements Command {

    OldQDChickenRolls store;

    public OldQDChickenRollsCancleCommand(OldQDChickenRolls store) {
        this.store = store;
    }

    @Override
    public void execute() {
        store.cancle();
    }
}
