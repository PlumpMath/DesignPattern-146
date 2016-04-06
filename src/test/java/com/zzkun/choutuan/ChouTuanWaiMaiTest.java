package com.zzkun.choutuan;

import com.zzkun.choutuan.command.BarbecuefoodCancleCommand;
import com.zzkun.choutuan.command.BarbecuefoodCommand;
import com.zzkun.choutuan.command.OldQDChickenRollsCancleCommand;
import com.zzkun.choutuan.command.OldQDChickenRollsCommand;
import com.zzkun.choutuan.store.Barbecuefood;
import com.zzkun.choutuan.store.OldQDChickenRolls;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kun on 2016/4/6.
 */
public class ChouTuanWaiMaiTest {

    @Test
    public void test1() {
        ChouTuanWaiMai waiMai = new ChouTuanWaiMai();

        Barbecuefood store1 = new Barbecuefood();
        waiMai.enterCommand("烤肉拌饭", new BarbecuefoodCommand(store1), new BarbecuefoodCancleCommand(store1));
        waiMai.onOrderWasPushed("烤肉拌饭");
        System.out.println("\n");

        OldQDChickenRolls store2 = new OldQDChickenRolls();
        waiMai.enterCommand("鸡肉卷", new OldQDChickenRollsCommand(store2), new OldQDChickenRollsCancleCommand(store2));
        waiMai.onOrderWasPushed("鸡肉卷");
        waiMai.onCancleWasPushed("鸡肉卷");
        System.out.println("\n");

        waiMai.onOrderWasPushed("胖人吉米");
    }

}