package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekJun_11651 {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int inputNum=Integer.parseInt(br.readLine());

            int[][] num = new int[inputNum][2];
            StringBuilder sb = new StringBuilder();

            for(int i=0; i<inputNum; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                num[i][0]= Integer.parseInt(st.nextToken());
                num[i][1]= Integer.parseInt(st.nextToken());
            }

            Arrays.sort(num, (num1, num2)->{
                if(num1[1]==num2[1]){
                    return num1[0]-num2[0];
                }else{
                    return num1[1]-num2[1];
                }
            });

            for(int j=0; j<inputNum; j++){
                sb.append(num[j][0]+" "+num[j][1]+"\n");
            }
            System.out.print(sb);
        }

}

