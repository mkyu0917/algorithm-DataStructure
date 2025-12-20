package com.algorithm.baekjoon.resolve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class resolve_15829 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCnt = Integer.parseInt(br.readLine());
        String inputString = br.readLine().toString();
        int m = 1234567891;
        int r = 31;
        int askIndex =0;
        long pow =1;
        long hashSum =0;

        for(int i=0; i<inputCnt; i++){

            askIndex=inputString.charAt(i)-'a'+1;

            pow=(pow*r)%m;
            if(i==0){
                pow = 1;
            }

            hashSum=(hashSum+(askIndex*pow))%m;

        }

        System.out.println(hashSum);
    }

}
