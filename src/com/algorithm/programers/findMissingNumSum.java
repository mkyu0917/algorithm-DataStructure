package com.algorithm.programers;

import java.util.stream.IntStream;

public class findMissingNumSum {

    public static void main(String[] args) {

                int[] numbers = {0,1,2,3,5,6,8,9};

                int answer = 0;
                int sumNum = 45;

                /*for(int num : numbers){
                    answer+=num;
                }*/

                /*
                answer = Arrays.stream(numbers)
                         .sum();
                */

                answer = IntStream.of(numbers).sum();
                System.out.println(45-answer);

    }
}
