package com.algorithm.baekjoon.resolve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class resolve_10809 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strings = br.readLine();
        char[] strToCharArr = strings.toCharArray();
        int[] charArr = new int[26];
        Arrays.fill(charArr,-1);




        for(int i=0; i<strToCharArr.length; i++){
            int index=strToCharArr[i]-'a';

            if(charArr[index]==-1){
                charArr[index]=i;
            }
        }


        System.out.println(Arrays.toString(charArr));

    }

}
