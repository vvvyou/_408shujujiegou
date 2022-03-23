package com.yjc.algorithm.arrays;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.Arrays;

/**
 * @author yjc
 * @create 2021-11-25-16:26
 */
public class NextPermutation {
    // 思路：从后向前找到升序子序列，然后确定调整后子序列的最高位，剩余部分升序排列
    public void nextPermutation1(int[] nums){
        int n = nums.length;

        // 1. 从后向前找到升序子序列，找到第一次下降的数，位置记为k
        int k = n - 2;
        while ( k >= 0 && nums[k] >= nums[k+1] )
            k --;

        // 找到k，就是需要调整部分的最高位

        // 2. 如果k = -1，说明所有数降序排列，改成升序排列
        if ( k == -1 ){
            Arrays.sort(nums);
            return;
        }

        // 3. 一般情况，k >= 0
        // 3.1 在1中我们已经找到要替换的数字索引为k，然后去遍历k后面的数(后面的数一定是降序)，找到<=k
        // 的值跳出循环
        int i = k + 1;
        while ( i < n && nums[i] > nums[k] )
            i ++;

        // 当前的i，就是后面部分第一个比nums[k]小的数，i-1就是要替换的那个数

        // 3.2 交换i-1和k位置上的数
        int temp = nums[k];
        nums[k] = nums[i-1];
        nums[i-1] = temp;

        // 3.3 k之后的剩余部分变成升序排列，直接前后调换
        int start = k + 1;
        int end = n - 1;
        while ( start < end ){
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start ++;
            end --;
        }
    }


    //上面时间复杂度是nlogn，arrays.sort是基于快排o(nlogn)，而其他的循环复杂度是o(n)
    //所以要优化。如下
    public void nextPermutation2(int[] nums){
        int n = nums.length;

        // 1. 从后向前找到升序子序列，找到第一次下降的数，位置记为k
        int k = n - 2;
        while ( k >= 0 && nums[k] >= nums[k+1] )
            k --;

        // 找到k，就是需要调整部分的最高位

        // 2. 如果k = -1，说明所有数降序排列，改成升序排列
        if ( k == -1 ){
            reverse(nums,0,n-1);

            return;
        }

        // 3. 一般情况，k >= 0
        // 3.1 在1中我们已经找到要替换的数字索引为k，然后去遍历k后面的数(后面的数一定是降序)，找到<=k
        // 的值跳出循环
        int i = k + 1;
        while ( i < n && nums[i] > nums[k] )
            i ++;

        // 当前的i，就是后面部分第一个比nums[k]小的数，i-1就是要替换的那个数

        // 3.2 交换i-1和k位置上的数
        swap(nums,k,i-1);

        // 3.3 k之后的剩余部分变成升序排列，直接前后调换
        int start = k + 1;
        int end = n - 1;
        while ( start < end ){
            swap(nums,start,end);
            start ++;
            end --;
        }
    }

    private void swap(int[] nums,int start,int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    private void reverse(int[] nums,int i,int j){
        while(i<j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {9,8,6,4,3,1};

        NextPermutation permutation = new NextPermutation();

        permutation.nextPermutation2(nums);

        for ( int num: nums )
            System.out.print(num + "\t");
    }
}
