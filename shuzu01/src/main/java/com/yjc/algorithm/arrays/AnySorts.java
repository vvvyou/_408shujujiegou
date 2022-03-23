package com.yjc.algorithm.arrays;

/**
 * @author yjc
 * @create 2022-03-07-13:20
 */
public class AnySorts {
    public static void main(String[] args) {
        AnySorts anySorts = new AnySorts();
        String uefkm = anySorts.reorganizeString("vvvjo");
        System.out.print(uefkm);
    }
    public String reorganizeString(String s) {
        //首先，要计算这个字符串里面的字母，每一个到底有几个
        //然后找到最多数量的字母
        //先判断是否符合重构->（count*2-1>length）
        //如果大于，说明不符合
        //否则就符合，那么就要进行重构
        //先偶数位置插入最大的，然后如果偶数插完还没s.length()
        //就要继续往后面拼接，如果大于s.length()
        //那么就奇数式的插入。

        char[] chars = s.toCharArray();
        int[] count=new int[26];
        for(char i:chars){
            count[i-'a']++;
        }


        //然后找到最多数量的字母,count[maxCount]==3
        int maxCount=0;
        for(int i=0;i<count.length;i++){
            if(count[i]>count[maxCount]){
                maxCount=i;
            }
        }

        if(count[maxCount]*2-1>s.length()) return "";

        //先偶数位置插入最大的，
        char[] result=new char[s.length()];
        int i=0;
        while(count[maxCount]-->0){//这里为什么要用count[maxCount]--呢，为什么不用maxCount？
            //因为你需要count数组里面最大值字母减到0，否则下面的代码插入其他字母就会重复插入
            result[i]=(char)('a'+maxCount);
            i+=2;
        }
        //再插入其他字母
        for(int j=0;j<count.length;j++){
            while(count[j]-->0){
                if(i>=s.length()){
                    i=1;
                }
                result[i]= (char) ('a'+j);
                i+=2;
            }

        }

        return String.valueOf(result);
    }
}
