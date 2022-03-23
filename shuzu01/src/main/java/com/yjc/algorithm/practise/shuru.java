package com.yjc.algorithm.practise;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;



/**
 * @author yjc
 * @create 2022-03-10-11:01
 */
import java.util.Scanner;

public class shuru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组元素个数：");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("请输入数组元素：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.print(arr[i] + "}");
            else
                System.out.print(arr[i] + ",");
        }
        System.out.println();
        QuickSort(arr, 0, arr.length - 1);
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str = str + arr[i];
        }
        System.out.println("最小数为:" + str);

    }

    //快速排序
    public static void QuickSort(int arr[],int _left,int _right){
        int right=_right;
        int left=_left;
        int temp=0;
        if(left<=right){
                temp=arr[left];
            while(left!=right){
                while(right>left&&Compare(arr[right],temp))
                    right--;
                arr[left]=arr[right];
                while(left<right&&Compare(temp,arr[left]))
                    left++;
                arr[right]=arr[left];
            }
            arr[right]=temp;
            QuickSort(arr,_left,left-1);
            QuickSort(arr,right+1,_right);
        }
    }
    //按新的排序规则重写比较方法
    public static boolean Compare(int a,int b){
        String s1=""+a;
        String s2=""+b;
        String s3=s1+s2;
        int k1=Integer.parseInt(s3);
        String s4=s2+s1;
        int k2=Integer.parseInt(s4);
        if(k1>=k2)
            return true;
        else
            return false;
    }

}
