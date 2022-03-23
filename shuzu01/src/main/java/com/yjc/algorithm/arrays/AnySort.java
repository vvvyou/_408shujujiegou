package com.yjc.algorithm.arrays;

import java.util.HashMap;
import java.util.Scanner;

/**leedcode767
 * @author yjc
 * @create 2022-03-07-9:48
 */
public class AnySort {
    public static void main(String[] args) {
        //随便输入一个整数代表字符串长度，在随便输入一行字符串
        Scanner sc=new Scanner(System.in);
        String n = sc.nextLine();
        int num = Integer.parseInt(n);
        String s = sc.nextLine();
        AnySort anySort = new AnySort();
        String result = anySort.getResult(num, s);
        System.out.println(result);
    }

    public String getResult(int num,String s){
        int count=0;
        //字母只要不超过一半就行了，重复的
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<num;i++){
            //如果发现相同的字母，就把value+1，
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
                continue;
            }
            map.put(s.charAt(i),1);
        }
        //找出每个字母的value不符合限定的
        for(int i=0;i<map.size();i++){
            if(map.get(s.charAt(i))*2-1>num){
                return "no";
            }
            else{

            }
        }


        return "yes";
    }

}
