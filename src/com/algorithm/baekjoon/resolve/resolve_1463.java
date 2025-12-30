package com.algorithm.baekjoon.resolve;

import java.util.Scanner;

public class resolve_1463 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        int[] numbers = new int[inputNum+1];

        //1이 되기위한 연산 값value, index는 숫자
        numbers[0]=0;
        numbers[1]=0;
        //numbers[10]=0;

        for(int i=2; i<numbers.length; i++){

            numbers[i]=numbers[i-1]+1;
            //System.out.println(numbers[i]);
           //System.out.println("number(i): "+ " i: "+i + " arr: " + numbers[i]);
            if(i%2==0){
                if(numbers[i]>numbers[i/2]+1){
                    numbers[i]=numbers[i/2]+1;
                    //System.out.println("i: "+i+" "+numbers[i]);
                }
            }

            if(i%3==0){
                if(numbers[i]>numbers[i/3]+1){
                    numbers[i]=numbers[i/3]+1;
                    //System.out.println("i: "+i+" "+numbers[i]);
                }
            }

        }

        System.out.println(numbers[inputNum]);



    }



}
