package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekJun_10814 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());
        String[][] member = new String[inputNum][2];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<inputNum; i++){
            String[] info = br.readLine().split(" ");
            member[i][0]=info[0];
            member[i][1]=info[1];
        }

        Arrays.sort(member, (m1, m2)->{
           int age1=Integer.parseInt(m1[0]);
           int age2=Integer.parseInt(m2[0]);

           return age1-age2;

        });

        for(int i=0; i<inputNum; i++){
            sb.append(member[i][0] +" "+member[i][1]+"\n");


        }

        System.out.println(sb);

    }

}



