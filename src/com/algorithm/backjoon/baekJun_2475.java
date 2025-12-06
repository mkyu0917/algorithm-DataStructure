package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekJun_2475 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] numStrArr=br.readLine().split(" ");
        int sumNum =0;
        int squareNum=0;


        for(int i=0; i<numStrArr.length; i++){

            int integerNum=Integer.parseInt(numStrArr[i]);
            squareNum+=(integerNum*integerNum);

        }
        System.out.println(squareNum%10);


    }
}
