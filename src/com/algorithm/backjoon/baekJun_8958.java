package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekJun_8958 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop =Integer.parseInt(br.readLine());

        int score=0;
        int stack=0;
        for(int j=0; j<loop; j++){
            char[] ansArr = br.readLine().toCharArray();

            for(int i=0; i<ansArr.length; i++){
                if(ansArr[i]=='O'){
                    stack=stack+1;
                    score+=stack;
                }else{
                    stack=0;
                }
            }
            System.out.println(score);
            stack=0;
            score=0;
        }

    }
}
