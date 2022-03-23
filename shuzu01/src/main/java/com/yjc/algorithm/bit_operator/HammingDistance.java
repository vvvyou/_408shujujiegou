package com.yjc.algorithm.bit_operator;

public class HammingDistance {
    // 方法一：异或，调库统计1的个数
    public int hammingDistance1(int x, int y){
        return Integer.bitCount(x ^ y);
    }

    // 方法二：自定义实现统计1的个数，逐位右移
    public int hammingDistance2(int x, int y){
        int xor = x ^ y;    // 得到异或结果
        int count = 0;    // 保存当前1的个数

        // 逐位右移，直到结果为0
        while (xor != 0){
            // 如果最后一位为1，count++
            if ((xor & 1) == 1) count++;
            xor >>= 1;    // 右移一位
        }

        return count;
    }

    // 方法三：快速位移
    public int hammingDistance(int x, int y){
        int xor = x ^ y;    // 得到异或结果
        int count = 0;    // 保存当前1的个数

        // 快速位移，每次寻找当前最右面的一个1，直接消去
        while (xor != 0){
            xor &= xor - 1;
            count ++;
        }

        return count;
    }

    //myself
    public int hammingDistance6(int x, int y) {
        int result=0;
        int x1=0;
        int y1=0;
        for(int i=0;i<31;i++){
            x1=(x>>i)&1;
            y1=(y>>i)&1;
            result+=x1^y1;
        }
        return result;
    }

    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        System.out.println(hammingDistance.hammingDistance6(3, 4));
        System.out.println(4>>2);
    }
}
