package com.algorithm.programers;

import java.util.Arrays;

public class ArithmeticSequence {

    public void arithmeticSequence(int num, int length){

        int[] answer = new int[length];
        int sum =0;
        for(int i=0; i<length; i++){
            sum +=num;
            answer[i]=sum;
        }

        System.out.println(Arrays.toString(answer));

    }

    public static void main(String[] args) {


        ArithmeticSequence arithmeticSequence = new ArithmeticSequence();
        arithmeticSequence.arithmeticSequence(2, 5);

    }
}
