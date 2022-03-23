package com.yjc.algorithm.practise;

/**
 * @author yjc
 * @create 2022-03-21-20:33
 */
public class Solution_One {

        /**
         * Note: 类名、方法名、参数名已经指定，请勿修改
         *
         *
         *
         * @param k int整型
         * @param i int整型
         * @param j int整型
         * @return int整型
         */
        public int execute(int k, int i, int j) {
            int sum=0;
            // 写一个杨辉三角
            //第一个为1，
            //第二个为上一行第一个加上一行第二个dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
            int[][] dp=new int[k][k];
            for(int i1=0;i1<k;i1++){
                for(int j1=0;j1<=i1;j1++){
                    if(j1==0||i1==j1)    dp[i1][j1]=1;
                    else              dp[i1][j1]=dp[i1-1][j1]+dp[i1-1][j1-1];
                }
                if(i1+1==k){
                    for(int x=0;x<k;x++){
                        if(x+1>=i&&x+1<=j)      sum+=dp[i1][x];
                    }
                }
            }
            return sum;
        }

    public static void main(String[] args) {
        System.out.println(15/2);
    }

}
