package com.algorithm.programers;

import java.util.Arrays;

public class NumberOrderDesc {

    static void solution1(long n) {
        long answer = 0;
        String sumNum = "";
        String strNum = String.valueOf(n);
        String[] strNumArr = strNum.split("");
        Integer[] arrNum = new Integer[strNumArr.length];

        for(int i = 0; i < strNumArr.length; i++){
            arrNum[i] = Integer.valueOf(strNumArr[i]);
        }

        Arrays.sort(arrNum, (o1, o2) -> o2 - o1);

        for(int factor : arrNum){
            sumNum += String.valueOf(factor);
        }

        System.out.println("solution1: " + sumNum);
    }

    static void solutionReFactoring(long n) {
        String strNum = String.valueOf(n);
        Integer[] arrNum = new Integer[strNum.length()];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < strNum.length(); i++){
            arrNum[i] = strNum.charAt(i) - '0';
        }

        Arrays.sort(arrNum, (o1, o2) -> o2 - o1);

        for(int factor : arrNum){
            sb.append(factor);
        }

        System.out.println("solutionReFactoring = " + sb.toString());
    }

    public static void main(String[] args) {

        solution1(1928384);
        solutionReFactoring(1928384);
    }
}
