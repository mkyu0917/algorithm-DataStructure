package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekJun_14626 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numArr = br.readLine().split("");

        int sum=0;
        int m=0;
        int weight =0;


            for (int j = 0; j < numArr.length; j++) {

                if ((j + 1) % 2 != 0 &  !"*".equals(numArr[j])) {
                    sum += Integer.parseInt(numArr[j]) * 1;
                } else if((j + 1) % 2 == 0 &  !"*".equals(numArr[j])){
                    sum += Integer.parseInt(numArr[j]) * 3;
                }

                if("*".equals(numArr[j])){
                    if((j + 1) % 2 != 0){
                        weight=1;
                    }else{
                        weight=3;
                    }
                }

          }

        for (int i = 0; i < 10; i++) {

            if(((i*weight)+sum)%10==0){
                m=i;
                break;
            };

        }

        System.out.println(m);

    }
}
