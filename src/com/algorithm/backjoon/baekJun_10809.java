package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekJun_10809 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word= br.readLine().toCharArray();
        int[] apb = new int[26];
        int ascA = (int)'a';
        Arrays.fill(apb,-1);


        for(int i=0; i<word.length; i++){

            int asc=word[i]-ascA;

            if( apb[asc]==-1) {
                apb[asc]=i;
            }
        }

        for(int j=0; j<apb.length; j++){
            System.out.print(apb[j]+" ");
        }

    }

}
