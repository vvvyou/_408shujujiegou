package com.yjc.algorithm.sort;

/**
 * @author yjc
 * @create 2022-03-06-14:17
 */
public class maopao {
    public static void main(String[] args) {
        int[] nums=new int[]{1,3,6,8,2,4,9,7,5};
        maopao maopao = new maopao();
        int[] ints = maopao.maoPaoSort(nums);
        for(int s:ints){
            System.out.print(s+" ");

        }

    }

    public int[] maoPaoSort(int[] nums){
        int len=nums.length;

        for(int i=0;i<len-1;i++){
            for(int j=1;j<len-i;j++){
                if(nums[j-1]>nums[j]){
                    swap(nums,j-1,j);
                }

            }
        }

        return nums;
    }
    public static void swap(int[] nums,int i,int j){
        int tmp=nums[j];
        nums[j]=nums[i];
        nums[i]=tmp;
    }
}
