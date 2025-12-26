package com.algorithm.backjoon;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
public class baekJun_2609{

    static void gcdAndLcm(int dividend, int divisor){

        StringBuilder sb = new StringBuilder();

        int gcd = 0;
        int mutipleNum = dividend * divisor;
        int lcm =0;
        int remain =0;
        if(dividend<divisor){
            int temp = dividend;
            dividend=divisor;
            divisor=temp;
        }



        while(remain%divisor==0){
            remain = dividend%divisor;
            if(remain ==0){
                gcd=divisor;
                break;
            }
            dividend = divisor;
            divisor = remain;
        }

        lcm = mutipleNum/gcd;

        sb.append(gcd+"\n");
        sb.append(lcm);
        System.out.println(sb);

    }


    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int firstNum = Integer.parseInt(st.nextToken());
        int secondNum =  Integer.parseInt(st.nextToken());
        gcdAndLcm(firstNum, secondNum);

    }

}