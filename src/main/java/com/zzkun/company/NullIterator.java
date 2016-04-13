package com.zzkun.company;

import java.util.Iterator;

/**
 * Created by kun on 2016/4/13.
 */
public class NullIterator implements Iterator<TreeNode> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public TreeNode next() {
        return null;
    }
}
