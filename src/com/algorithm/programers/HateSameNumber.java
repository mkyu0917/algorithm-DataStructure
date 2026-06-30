package com.algorithm.programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HateSameNumber {

    public static void main(String[] args) {

        //https://school.programmers.co.kr/learn/courses/30/lessons/12906

            int[] arr = {1,1,3,3,0,1,1};

        List<Integer> ar = new ArrayList();
            ar.add(arr[0]);
            int temp = arr[0];
            for(int i=1; i<arr.length; i++){
                if(temp != arr[i]){
                    ar.add(arr[i]);
                    temp = arr[i];
                }

            }

            int[] answer = new int[ar.size()];
            for(int i=0; i<ar.size(); i++){
                answer[i]=ar.get(i);
            }

        System.out.println(Arrays.toString(answer));


    }
}
