package com.zzkun.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

/**
 * Created by kun on 2016/4/13.
 */
public class DepartmentIterator implements Iterator<TreeNode> {

    Stack<Iterator<TreeNode>> stack = new Stack<>();

    public DepartmentIterator(Iterator<TreeNode> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()) {
            return false;
        }
        Iterator<TreeNode> iterator = stack.peek();
        if(!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        }
        return true;
    }

    @Override
    public TreeNode next() {
        if(!hasNext()) {
            return null;
        }
        Iterator<TreeNode> iterator = stack.peek();
        TreeNode node = iterator.next();
        if(node instanceof Department) {
            stack.push(node.getChilds().iterator());
            return next();
        }
        return node;
    }
}
