package com.algorithm.baekjoon.resolve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class resolve_2292 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNumber=Integer.parseInt(br.readLine());
        int totalRoom =1;
        int increaseRoom = 6;
        int count=1;

        while(totalRoom<inputNumber){

            if(increaseRoom<inputNumber){
                totalRoom += increaseRoom;
                increaseRoom+=6;
            }
            count++;

        }
        System.out.print(count);

    }

}
