package com.algorithm.baekjoon.resolve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class resolve_2920 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int second =Integer.parseInt(st.nextToken());

        boolean isAscending = (first<second);

        for(int i=0; i<6; i++){

        first=second;
        second=Integer.parseInt(st.nextToken());

        if((first<second)!=isAscending){
            System.out.print("mixed");
            isAscending = (first<second);
            return;
        }

        }
        if(isAscending){
            System.out.print("ascending");
        }else{
            System.out.print("descending");
        }
    }




}
