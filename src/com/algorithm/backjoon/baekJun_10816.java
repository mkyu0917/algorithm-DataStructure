package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekJun_10816 {

    static int upper(int[] numbers, int target ){
        int lower =0;
        int upper =numbers.length;

        while(lower<upper){
            int mid = (lower + upper)/2;
            if(target<numbers[mid]){
                upper = mid;
            } else {
                lower = mid + 1;
            }
        }
        return lower;
    }

    static int lower(int[] numbers, int target ){
        int lower =0;
        int upper =numbers.length;

        while(lower<upper){
            int mid = (lower + upper)/2;
            if(target<=numbers[mid]){
                upper = mid;
            } else {
                lower = mid + 1;
            }
        }
        return lower;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] myCard = new int[inputNum];

        for(int i=0; i<inputNum; i++){
            myCard[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(myCard);

        int inputNum2=Integer.parseInt(br.readLine());
        int[] checkCard = new int[inputNum2];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<inputNum2; i++){
            int target=Integer.parseInt(st2.nextToken());
            int lowerIdx = lower(myCard,target);
            int upperIdx = upper(myCard,target);
            int ans = upperIdx - lowerIdx;
            sb.append(ans+" ");

        }

        System.out.println(sb);

    }
}
