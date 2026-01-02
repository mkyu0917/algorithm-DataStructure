package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekJun_10989 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());
        int[] inputArr = new int[10001];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<inputNum; i++){

            inputArr[Integer.parseInt(br.readLine())]++;

        }


        for(int j=0; j<inputArr.length; j++){
            while(inputArr[j]>0){
                sb.append(j).append("\n");
                inputArr[j]--;
            }
        }
        System.out.println(sb);
        sb.setLength(0);

        for(int k=0; k<inputArr.length; k++){
            while(inputArr[k]>0){
                sb.append(k).append("\n");
                inputArr[k]--;
            }
        }
    }
}
