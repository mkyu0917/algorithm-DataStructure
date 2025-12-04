package com.algorithm.backjoon;

import java.io.*;
import java.util.HashSet;

public class baekJun_3052 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] dividendArr = new int[10];

        final int divisor =42;
        int dividendNum=0;
        int answer=0;
        for(int i=0; i<dividendArr.length; i++){

            dividendNum=Integer.parseInt(br.readLine());
            answer=dividendNum%divisor;
            dividendArr[i]=answer;

        }


        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<dividendArr.length;i++){
            hs.add(dividendArr[i]);
        }
        System.out.println(hs.size());


    }
}
