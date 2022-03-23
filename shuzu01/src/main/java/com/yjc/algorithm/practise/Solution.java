package com.yjc.algorithm.practise;

import com.yjc.algorithm.linked_list.ListNode;

/**
 * @author yjc
 * @create 2022-03-21-20:11
 */
public class Solution {
    /**
     * Note: 类名、方法名、参数名已经指定，请勿修改
     *
     *
     *
     * @param listNode1 ListNode类
     * @param listNode2 ListNode类
     * @param startIndex int整型
     * @param endIndex int整型
     * @return int整型
     */
    public int execute(ListNode listNode1, ListNode listNode2, int startIndex, int endIndex) {
        //哨兵节点
        ListNode sentinal=new ListNode(-1);
        ListNode curr=sentinal;

        //进行判断
        while(listNode1!=null&&listNode2!=null){
            if(listNode1.val>listNode2.val){
                curr.next=listNode2;
                curr=listNode2;
                listNode2=listNode2.next;
            }else{
                curr.next=listNode1;
                curr=listNode1;
                listNode1=listNode1.next;
            }
        }
        //拼接剩下的
        curr.next=(listNode2==null)?listNode1:listNode2;
        //截取链表的区间
        int len=getLength(sentinal.next);
        int num=0;
        ListNode result=sentinal.next;
        for(int i=1;i<len+1;i++){
            if(i>=startIndex&&i<=endIndex){
                num+=result.val;
            }
            result=result.next;
        }
        return num;

    }

    //获取链表的长度
    public int getLength(ListNode head){
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
}
