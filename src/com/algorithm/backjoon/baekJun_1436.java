package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekJun_1436 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum=Integer.parseInt(br.readLine());
        int count=0;
        int num=666;
        String numStr =null;
        while(true){

            numStr = String.valueOf(num);
            if(numStr.contains("666")){
                count++;
            }

            if(count==inputNum){
                break;
            }

            num++;
        }

        System.out.println(num);
   }
}
