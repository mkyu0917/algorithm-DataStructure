package com.algorithm.programers;

import java.util.stream.IntStream;

public class YinYangSum {

    static void javaYinYangSum(int[] num, boolean[] yinYang){

        int answer = 0;
        for(int i=0; i<num.length; i++){

            answer+= yinYang[i] ? num[i] : -num[i];

        }
        System.out.println("javaYinYangSum = " + answer);
    }

    static void streamYingYangSum(int[] num, boolean[] yinYang){

        int answer = 0;
        answer = IntStream.range(0,num.length)
                .map(n -> yinYang[n] ? num[n] : -num[n] )
                .sum();


        System.out.println("streamYingYangSum = " + answer);
    }

    public static void main(String[] args) {

        int[] num = {4, 7, 12};
        boolean[] yingYang = {true,false,false};

        javaYinYangSum(num, yingYang);
        streamYingYangSum(num, yingYang);

    }

}
