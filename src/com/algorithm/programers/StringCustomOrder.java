package com.algorithm.programers;

import java.util.Arrays;

public class StringCustomOrder {

    //https://school.programmers.co.kr/learn/courses/30/lessons/12915
    public static void main(String[] args) {

        String[] strings = {"car", "bed", "sun"};
        int n = 1;

        Arrays.sort(strings, (o1, o2) ->{
            int first = o1.charAt(n);
            int second = o2.charAt(n);

            if(first-second==0){
                return o1.compareTo(o2);
            }

            return first-second;

        } );

        System.out.println(Arrays.toString(strings));
    }
}
