package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekJun_7568 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int [][] bigGuy = new int[input][input];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<input; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            bigGuy[i][0]=Integer.parseInt(st.nextToken());
            bigGuy[i][1]=Integer.parseInt(st.nextToken());
        }


        for(int i=0; i<input; i++){
            int rank=1;
            for(int j=0; j<input; j++){
                if(i==j) continue;

                if(bigGuy[i][0]<bigGuy[j][0] & bigGuy[i][1]<bigGuy[j][1]){
                    rank++;
                }

            }
            sb.append(rank+" ");
        }
        System.out.print(sb);
    }
}
