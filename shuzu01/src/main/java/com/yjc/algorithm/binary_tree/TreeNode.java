package com.yjc.algorithm.binary_tree;

// 二叉树的节点类
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int x){
        val = x;
    }

    public TreeNode(TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
    }
}
