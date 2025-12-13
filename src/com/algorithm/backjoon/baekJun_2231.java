package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekJun_2231 {


    public static int decompositionSum(int num) {

        int remainSum = 0;
        int dividend = num;
        //각 자리수 더하기
        while (dividend>0) {

            //1의 자리수
            remainSum += dividend % 10;
            dividend /= 10;

        }

        // System.out.println(remainSum);

        return remainSum;



    }


    public static void main(String[] args)  throws IOException{

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int constructor =  Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i=0; i<constructor; i++) {
            int num=decompositionSum(i);

            if(num+i==constructor){
                ans =i;
                break;
            }
        }
        System.out.println(ans);
    }
}
