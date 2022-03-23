package com.yjc.algorithm.linked_list;

public class ListNode {
    public int val;    // 当前节点保存的数据值
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
