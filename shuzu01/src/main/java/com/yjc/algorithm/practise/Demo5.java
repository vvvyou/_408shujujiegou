package com.yjc.algorithm.practise;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @author yjc
 * @create 2022-03-10-22:05
 */
public class Demo5 {
    public static void main(String[] args) {

        String s="abcdefgh";
        Demo5 demo5 = new Demo5();
        demo5.uniquePathsWithObstacles(s,s.length(),4);
        int a=8&20;
        int b=8|20;
        System.out.println(a+"   "+b);

    }

    public String uniquePathsWithObstacles(String s,int a,int p) {
       StringBuffer sb=new StringBuffer();
       for(int i=p+1;i<a;i++){
           sb.append(s.charAt(i));
       }
       for(int i=0;i<p;i++){
           sb.append(s.charAt(i));
       }
       String s1=new String(sb);
        System.out.println(s1);
       return s1;
    }
}
