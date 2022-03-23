package com.yjc.algorithm.practise;

import java.util.Scanner;

/**
 * @author yjc
 * @create 2022-03-13-19:25
 */
public class Dpdiffrent {
    /*
    你驾驶船只在海上航行至给定一个 M*N 的海域，海上只有 K 个位置是有礁石的，其他格子都是正常海域。

你作为船长驾驶船只位于地图的左上角，宝藏位于该海域的右下角，每一次航行你只能选择向右或向下移动一格，并且不能移动到有礁石的海域。求你从该海域左上角航行到右下角获取宝藏，一共有多少种路线。

输入格式

第一行包含三个整数 M N K

接下来 K 行，每行包含两个整数 x，y 描述一块礁石位于x行y列。

数据保证左上角和右下角的海域是没有礁石的。
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] line1 = sc.nextLine().split(" ");
        int M = Integer.parseInt(line1[0]);
        int N = Integer.parseInt(line1[1]);
        int K = Integer.parseInt(line1[2]);

        for(int i=0;i<K;i++) {
            String[] line2 = sc.nextLine().split(" ");
            int i1 = Integer.parseInt(line2[0]);
            int i2 = Integer.parseInt(line2[1]);
        }

    }

    public int getResult(int[][] square,int[][] stone){
        int x=square.length;
        int y=square[0].length;
        int[][] dp=new int[x][y];
        //初始化，
        for(int i=0;i<x&&square[i][0]==0;i++){
            dp[x][0]=1;
        }
        for(int j=0;j<y&&square[0][j]==0;j++){
            dp[0][j]=1;
        }
        //递推条件
        for(int i=1;i<x;i++){
            for(int j=1;j<y;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[x-1][y-1];

    }
}
