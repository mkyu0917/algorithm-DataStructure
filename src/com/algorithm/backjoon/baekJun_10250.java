package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekJun_10250 {

    public static void main(String[] args) throws IOException {
        // 모둘려 공식을 써야됨
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());

        for(int i=0; i<cnt; i++){

            String[] input = br.readLine().split(" ");

            int high = Integer.parseInt(input[0]);
            //int width = Integer.parseInt(input[1]);
            int people = Integer.parseInt(input[2]);

            // 층수 구하기
            int floor = people%high;

            if(floor==0){
                floor = high;
            }

            // 호실 구하기
            int roomNum =  people/high;

            if(people%high>0){
                roomNum=roomNum+1;
            }


            System.out.println(floor * 100 + roomNum);


        }




    }
}
