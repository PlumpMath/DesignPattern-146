package com.zzkun.choutuan;

import com.zzkun.choutuan.command.Command;

import java.util.HashMap;
import java.util.Map;

/**
 * 丑团外卖实现类
 * Created by kun on 2016/3/30.
 */
public class ChouTuanWaiMai {

    private Map<String, Command> orderCommandMap;
    private Map<String, Command> cancleCommandMap;

    public ChouTuanWaiMai() {
        orderCommandMap = new HashMap<>();
        cancleCommandMap = new HashMap<>();
    }

    /**
     * 丑团商家入驻方法
     * @param name 商家名
     * @param order 用户下订单命令
     * @param cancle 用户取消订单命令
     */
    public void enterCommand(String name, Command order, Command cancle) {
        orderCommandMap.put(name, order);
        cancleCommandMap.put(name, cancle);
        System.out.println(name + " 入驻丑团外卖成功~");
    }


    /**
     * 丑团外卖用户下单
     * @param name 外卖商家名称
     */
    public void onOrderWasPushed(String name) {
        if(!orderCommandMap.containsKey(name)) {
            System.out.printf("下单错误,没有商家:%s！\n", name);
            return;
        }
        orderCommandMap.get(name).execute();
    }

    /**
     * 丑团外卖用户取消订单
     * @param name 外卖商家名称
     */
    public void onCancleWasPushed(String name) {
        if(!cancleCommandMap.containsKey(name)) {
            System.out.printf("下单错误！没有商家:%s！\n", name);
            return;
        }
        cancleCommandMap.get(name).execute();
    }

    @Override
    public String toString() {
        return "丑团外卖{" +
                "orderCommandMap=" + orderCommandMap +
                ", cancleCommandMap=" + cancleCommandMap +
                '}';
    }
}
