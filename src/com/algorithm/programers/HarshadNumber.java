package com.algorithm.programers;

public class HarshadNumber {

    public void harshadCalculate(int num){


        String strNum=String.valueOf(num);
        char[] charArray=strNum.toCharArray();
        int sumChar = 0;
        for(char ch : charArray){

            sumChar+=ch - '0';

        }

        System.out.println(num%sumChar==0);
    }

    public static void main(String[] args) {

        HarshadNumber harshadNumber = new HarshadNumber();

        harshadNumber.harshadCalculate(15);
    }

}
