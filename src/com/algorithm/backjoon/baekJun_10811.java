package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekJun_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int basketCnt = Integer.parseInt(st.nextToken());
        int changeCnt = Integer.parseInt(st.nextToken());
        int startNum=0;
        int endNum=0;

        int[] arr = new int[basketCnt];
        for(int i=0; i<arr.length; i++){
            arr[i]=i+1;
        }

        for(int j=0; j<changeCnt; j++){
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken())-1;
            int last = Integer.parseInt(st.nextToken())-1;
            //first =0;
            //last =3;
            int temp =0;
            while(first<=last){
                temp=arr[last];
                arr[last]=arr[first];
                arr[first]=temp;

                first++;
                last--;

            }

        }
        String answer ="";
        for(int num : arr){
            answer += String.valueOf(num)+" ";
        }
        System.out.print(answer);
    }
}
