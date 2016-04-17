package com.zzkun.company;

import java.util.Iterator;

/**
 * Created by kun on 2016/4/13.
 */
public class Client {

    public static void main(String[] args) {
        TreeNode root = new Department("北京NBSoft有限公司", "一个大型软件公司");

        root.add(new Staff("董事长", "我是董事长，欧耶", 1)).add(new Staff("总经理", "我是总经理，欧耶", 2));
        Department caiwu = new Department("财务部", "负责本机构的财务管理");
        Department shichang = new Department("市场部", "负责拉近产品与消费者的心理距离");
        Department fengongsi = new Department("分公司", "总公司的附属机构");
        root.add(caiwu).add(shichang).add(fengongsi);

        caiwu.add(new Staff("财务部经理", "我是财务部经理，总负责本机构的财务管理", 3));
        Department kuaijichu = new Department("会计处", "反应和监督我公司的经济管理");
        Department shenjichu = new Department("审计处", "负责全公司的审计工作");
        caiwu.add(kuaijichu).add(shenjichu);
        kuaijichu.add(new Staff("会计1", "会计员1", 5)).add(new Staff("会计2", "会计员2", 5));
        shenjichu.add(new Staff("审计员1", "审计人员1", 5)).add(new Staff("审计员1", "审计人员1", 5));

        fengongsi.add(new Department("上海分公司", "NBSoft有限公司上海分公司"));
        fengongsi.add(new Department("杭州分公司", "NBSoft有限公司杭州分公司"));
        Department sdfengongsi = new Department("山东分公司", "NBSoft有限公司山东分公司");
        fengongsi.add(sdfengongsi);
        sdfengongsi.add(new Staff("山东分公司经理", "负责山东分公司的整体工作", 3));
        sdfengongsi.add(new Department("山东分公司市场部", "负责拉近产品与山东地区消费者的心理距离"));
        sdfengongsi.add(new Department("山东分公司人力资源部", "对山东分公司中各类人员形成的资源进行管理"));

        root.show();

        System.out.println();
        System.out.println("迭代器遍历所有员工：");
        Iterator<TreeNode> iterator = root.createIterator();
        while(iterator.hasNext()) {
            TreeNode node = iterator.next();
            if(node != null) node.show();
        }

        System.out.println();
        System.out.println("迭代器遍历所有分公司员工：");
        iterator = fengongsi.createIterator();
        while(iterator.hasNext()) {
            TreeNode node = iterator.next();
            if(node != null) node.show();
        }

        System.out.println();
        System.out.println("迭代器遍历所有等级高于3的员工：");
        iterator = root.createIterator();
        while(iterator.hasNext()) {
            TreeNode node = iterator.next();
            if(node != null && node.getRank() <= 3) node.show();
        }
    }

}
