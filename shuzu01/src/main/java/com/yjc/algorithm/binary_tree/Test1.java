package com.yjc.algorithm.binary_tree;

/**
 * @author yjc
 * @create 2021-12-15-15:13
 */
public class Test1 {
        public boolean isValidBST(TreeNode root) {
            return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }

        public boolean isValidBST(TreeNode node, long lower, long upper) {
            if (node == null) {
                return true;
            }
            if (node.val <= lower || node.val >= upper) {
                return false;
            }
            return isValidBST(node.left, lower, node.val) && isValidBST(node.right, node.val, upper);
        }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(6);
        TreeNode node5 = new TreeNode(8);

        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;

        Test1 test1 = new Test1();

        System.out.println(test1.isValidBST(node1));
    }
}
