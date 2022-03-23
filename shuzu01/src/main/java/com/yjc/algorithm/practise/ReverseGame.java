package com.yjc.algorithm.practise;

import java.util.Scanner;

/**
 * @author yjc
 * @create 2022-03-13-19:48
 */
public class ReverseGame {
    /*
    新一年开工，薯队长为你准备了一个数字游戏。

现在有由N个整数组成的数组，其中每一个整数只可以是0或者1。你可以选择一个区间范围[i, j]，其中i<=j，对其中所有数字进行翻转。对整数a进行翻转会得到1-a。

你只有一次翻转的机会，薯队长希望知道经过一次翻转后，新的数组中1的个数最多是多少，聪明的你可以帮助薯队长解决这个问题吗？如果数组长度为0，直接返回-1。

例如 [1, 0, 0, 1, 0]，可以翻转为 [1, 1, 1, 0, 1] 或 [1, 1, 1, 1, 0]，所以结果为4。


输出描述
整数，表示经过一次翻转后，新的数组中1出现的最大次数
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //整数，表示整数数组中整数的个数
        int i = sc.nextInt();
        String[] s = sc.nextLine().split(" ");
        //依次是数组中每一个整数，以单空格间隔
        int[] nums=new int[s.length];
        for(int j=0;j<s.length;j++) {
            nums[i] = Integer.parseInt(s[i]);
        }

    }
}
