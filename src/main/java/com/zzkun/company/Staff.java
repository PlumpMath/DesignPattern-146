package com.zzkun.company;

/**
 * Created by kun on 2016/4/13.
 */
public class Staff extends TreeNode {

    String name;
    String description;
    int rank;

    public Staff(String name, String description, int rank) {
        this.name = name;
        this.description = description;
        this.rank = rank;
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
    public int getRank() {
        return rank;
    }

    @Override
    public void show() {
        __show(0);
    }

    @Override
    public void __show(int dent) {
        String pre = "";
        for(int i = 0; i < dent; ++i) pre += "    ";
        System.out.println(pre + getName() + "(Rank" + getRank() + "): " + getDescription());
    }
}
