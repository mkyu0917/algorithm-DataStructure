package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class baekJun_1676 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input=Integer.parseInt(br.readLine());
        BigInteger factorial=BigInteger.ONE;

        for(int i=1; i<=input; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        String inputStr = factorial.toString();
        char[] charArr = inputStr.toCharArray();
        int cnt =0;


        for(int i=charArr.length-1; i>=0; i--){

            if(charArr[i]=='0'){
                cnt++;
            }else{
                break;
            }

        }

        System.out.println(cnt);
    }
}
