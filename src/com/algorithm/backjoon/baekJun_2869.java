package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekJun_2869 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st   = new StringTokenizer(br.readLine());

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int high = Integer.parseInt(st.nextToken());

        int oneDayDistance = up-down;
        int lastDistance = high-up;

        //System.out.println(oneDayDistance);
        //System.out.println(lastDistance);

        int cnt =lastDistance/oneDayDistance;


        if(lastDistance%oneDayDistance>cnt){
            cnt++;
        }

        System.out.println(cnt);


    }
}
