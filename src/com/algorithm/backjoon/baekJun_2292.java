package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekJun_2292 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputRoomNumber=Integer.parseInt(br.readLine());

        int maxRoomNumber=1;
        int route=1;
        int increaseNum = 6;

        while(inputRoomNumber>maxRoomNumber){

            maxRoomNumber +=increaseNum;
            increaseNum+=6;
            route++;

        }


        System.out.println(route);

    }

}
