package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekJun_2675 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loopCnt=Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<loopCnt; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());

            int repeatCnt=Integer.parseInt(str.nextToken());
            String repeatWord=str.nextToken();

            for(int j=0; j<repeatWord.length(); j++){

                for(int k=0; k<repeatCnt; k++){

                    sb.append(repeatWord.charAt(j));

                }


            }
            sb.append("\n");
            System.out.print(sb);
        }


    }
}
