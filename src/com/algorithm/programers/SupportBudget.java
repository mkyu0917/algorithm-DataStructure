package com.algorithm.programers;

import java.util.Arrays;

public class SupportBudget {

    //https://school.programmers.co.kr/learn/courses/30/lessons/12982
    public static void main(String[] args) {
        int answer = 0;
        int budget = 10;
        //int[] d = new int[]{1,3,2,5,4};
        int[] d = new int[]{2,2,3,3};
        Arrays.sort(d);

        for(int i=0; i<d.length; i++){

            if(d[i]<=budget){
                budget-=d[i];
                answer++;
            }else{
                break;
            }

        }

        System.out.println(answer);

    }

}
