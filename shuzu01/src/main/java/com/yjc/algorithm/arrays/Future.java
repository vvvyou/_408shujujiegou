package com.yjc.algorithm.arrays;

import java.util.Scanner;

/**
 * @author yjc
 * @create 2022-03-07-9:30
 */
public class Future {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Future future = new Future();
        int length = future.zuraLength(sc.nextLine());
        System.out.println(length);
    }

    //只要有一个zura，count++；
    public int zuraLength(String s){
        //排除特殊条件
        if(s.length()==0)
            return 0;
        int count=0;
        String zura = s.replace("zura", "!");
        for(int i=0;i<zura.length();i++){
            char c = zura.charAt(i);
            if(c=='!'){
                count++;
            }
        }
        return count;
    }
}
