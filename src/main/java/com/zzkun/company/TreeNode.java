package com.zzkun.company;


import java.util.Iterator;
import java.util.List;

/**
 * Created by kun on 2016/4/13.
 */
public abstract class TreeNode {

    /**
     * 在当前节点添加子节点
     * @param node 子节点
     */
    public TreeNode add(TreeNode node) {
        throw new UnsupportedOperationException();
    }

    /**
     * 删除当前节点的子节点
     * @param node 子节点
     */
    public TreeNode remove(TreeNode node) {
        throw new UnsupportedOperationException();
    }

    /**
     * 得到第i个位置的子节点
     * @param i 位置
     * @return 第i个位置的子节点
     */
    public TreeNode getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public List<TreeNode> getChilds() {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取当前节点的名称
     * @return 当前节点的名称
     */
    public String getName() {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取当前节点的描述
     * @return 当前节点的描述
     */
    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取员工排名
     * @return 员工排名
     */
    public int getRank() {
        throw new UnsupportedOperationException();
    }

    /**
     * 递归打印当前节点及子节点
     */
    public void show() {
        throw new UnsupportedOperationException();
    }

    public void __show(int dent) {
        throw new UnsupportedOperationException();
    }

    public Iterator<TreeNode> createIterator() {
        throw new UnsupportedOperationException();
    }

}
