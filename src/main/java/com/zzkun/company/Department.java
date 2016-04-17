package com.zzkun.company;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kun on 2016/4/13.
 */
public class Department extends TreeNode {

    List<TreeNode> list = new ArrayList<>();
    String name;
    String description;

    public Department(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public TreeNode add(TreeNode node) {
        list.add(node);
        return this;
    }

    @Override
    public TreeNode getChild(int i) {
        return list.get(i);
    }

    @Override
    public List<TreeNode> getChilds() {
        return list;
    }

    @Override
    public TreeNode remove(TreeNode node) {
        list.remove(node);
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void show() {
        __show(0);
    }

    @Override
    public void __show(int dent) {
        System.out.println();
        String pre = "";
        for(int i = 0; i < dent; ++i) pre += "    ";
        System.out.println(pre + "-------" + getName() + "-------");
        System.out.println(pre + "描述：" + getDescription());
        for(TreeNode node : list) {
            node.__show(dent + 1);
        }
    }

    @Override
    public Iterator<TreeNode> createIterator() {
        return new DepartmentIterator(list.iterator());
    }

    @Override
    public String toString() {
        return "Department{" +
                "list=" + list +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
