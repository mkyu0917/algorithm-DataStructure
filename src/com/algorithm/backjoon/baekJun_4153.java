package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekJun_4153 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean start = true;
        StringBuilder sb = new StringBuilder();
        while(start){

            StringTokenizer str = new StringTokenizer(br.readLine());

            int[] numArr = new int[3];

            int first = Integer.parseInt(str.nextToken());
            int second = Integer.parseInt(str.nextToken());
            int third = Integer.parseInt(str.nextToken());

            numArr[0]=first;
            numArr[1]=second;
            numArr[2]=third;
            Arrays.sort(numArr);

            if(numArr[0]==0 && numArr[1]==0 && numArr[2]==0 ){
                break;
            }


            int aPow = first * first;
            int bPow = second * second;
            int cPow = third * third;

            if( (aPow+bPow)==cPow){
                sb.append("right");
                sb.append("\n");
            }else{
                sb.append("wrong");
                sb.append("\n");
            }

        }
        System.out.println(sb);
    }
}
