package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekJun_15829 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCnt = Integer.valueOf(br.readLine()); // 5
        String charCnt = String.valueOf(br.readLine()); // abcde
        long hashSum=0;
        long hashValue=0;
        long sqrt =1;
        for(int i=0; i<inputCnt; i++){

            int hashIndex=charCnt.charAt(i)-'a'+1;
            sqrt=1;
            for(int j=0; j<i; j++){
                sqrt*=31;
            };

            hashSum+=sqrt*hashIndex;


        }
        hashValue=hashSum%1234567891;
        System.out.println(hashValue);
    }
}
