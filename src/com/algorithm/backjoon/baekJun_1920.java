package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class baekJun_1920 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int intNum1=Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>(intNum1);

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0; i<intNum1; i++){
            set.add(Integer.parseInt(st1.nextToken()));
        }

        int intNum2=Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());


        int[] m = new int[intNum2];

        for(int i=0; i<intNum2; i++){
            m[i] = Integer.parseInt(st2.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<m.length; i++){
            if(set.contains(m[i])){
                sb.append("1"+"\n");
            }else{
                sb.append("0"+"\n");
            }

        }
        System.out.print(sb);
    }
}
