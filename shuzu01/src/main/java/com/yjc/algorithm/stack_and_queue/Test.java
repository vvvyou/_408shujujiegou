package com.yjc.algorithm.stack_and_queue;

import sun.misc.Queue;

import java.util.ArrayDeque;

/**
 * @author yjc
 * @create 2021-12-12-20:09
 */
public class Test {
    public static void main(String[] args) {
        int[] arr1=new int[5];
        for(int i=1;i<4;i++){
            arr1[i]=i;
        }
        for (int i : arr1) {
            System.out.println(i);
        }
    }
}
