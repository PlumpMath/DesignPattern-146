package com.zzkun.choutuan.command;

import com.zzkun.choutuan.store.OldQDChickenRolls;

/**
 * 老青岛鸡肉卷连锁店山科大北门分店取消订单命令
 * Created by kun on 2016/4/6.
 */
public class OldQDChickenRollsCommand implements Command {

    OldQDChickenRolls store;

    public OldQDChickenRollsCommand(OldQDChickenRolls store) {
        this.store = store;
    }

    @Override
    public void execute() {
        store.prepare();
        store.make();
        store.send();
        store.calcPrice();
    }
}
