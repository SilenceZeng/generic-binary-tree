package com.github.hcsp.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    // 你看，上面三种"二叉树节点"结构相似，内容重复，请将其泛型化，以节省代码
    static class BinaryTreeNode<T> {
        T value;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;
    }

    // 泛型化之后，请再编写一个算法，对二叉树进行中序遍历，返回中序遍历的结果
    public static <T> List<T> inorderTraversal(BinaryTreeNode<T> root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<T> resultList = new ArrayList<>(inorderTraversal(root.left));
        resultList.add(root.value);
        resultList.addAll(inorderTraversal(root.right));
        return resultList;
    }
}
