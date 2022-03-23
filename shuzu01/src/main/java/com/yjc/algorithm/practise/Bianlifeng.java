package com.yjc.algorithm.practise;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yjc
 * @create 2022-03-17-19:17
 */
public class Bianlifeng {
    //第一行两个正整数n和Y，分别表示可供购买的商品数量和优惠券的最低使用总价。
    // 接下来一行n个整数，第i个整数表示第i种商品的价格。[每个数之间用空格隔开]

    ////可够买3种商品，优惠券最低100元试用
    ////20,80,120
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            String[] s=sc.nextLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int Y=Integer.parseInt(s[1]);

        String[] prices = sc.nextLine().split(" ");
        int[] nums=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            //第i个整数表示第i种商品的价
            nums[i]=Integer.parseInt(prices[i]);
        }
        Bianlifeng bianlifeng=new Bianlifeng();
        int money = bianlifeng.getMoney(n, Y, nums);
        System.out.println(money);
    }
    //共一行，1 个数，表示要使用这张满 Y 元减20 元的优惠券最少需要购买多少元的商品,保证有解。
    public int getMoney(int n,int Y,int[] nums){
        int count=0;
        int i=0;
        //让商品的价格从小到大排序
        Arrays.sort(nums);
        //商品的总数量
        int result=nums.length;
        if(nums[result-1]==100) return 100;
        int[] two=new int[result];
        //有序数组，选出和大于Y的最小值。(0,100] 限制最多用n个
        for(int j=0;j<result;j++){
            for(int z=j+1;z<result;z++){
                if(nums[j]+nums[z]>Y)
                    two[i++]=nums[j]+nums[z];
            }
        }
        Arrays.sort(two);
        for(int j=0;j<two.length;j++){
            if(two[j]<Y)    j++;
        }
        return count;
    }
}
