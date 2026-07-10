package com.algorithm.programers;

import java.util.Arrays;

public class NearestNumber {
    //https://school.programmers.co.kr/learn/courses/30/lessons/142086
    public static void main(String[] args) {

        String word = "banana";
        int[] answer = new int[word.length()];
        int[] pos = new int[26];
        Arrays.fill(pos,-1);

        for(int i=0; i<word.length(); i++){

            int idx=word.charAt(i)-'a';

            if(pos[idx]==-1){
                answer[i]=-1;
            }else{
                answer[i]=i-pos[idx];
            }
            pos[idx]=i;
        }

        System.out.println(Arrays.toString(answer));



    }
}
