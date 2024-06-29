package com.algorithm.beginner70;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BeginnerProblem70 {
/*
* 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
* 정수 배열 emergency가 매개변수로 주어질 때
* 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록
* solution 함수를 완성해주세요.
* */
    public static void main(String[] agrs){
        int[] emergency={3, 76, 24};
        //int numArr[] = {2,2,1};
        solution(emergency);
    }

    public static int[] solution(int[] emergency) {

        int[] answer= new int[emergency.length];
        int firstData =emergency[0];


        //오름차순으로 정렬
        for(int i=0; i < emergency.length; i++){
            int priority = 1;
            for(int j=0; j<emergency.length; j++){

                if(emergency[i]<emergency[j]){
                    priority++;
                }



            }
            answer[i]=priority;
            System.out.println(answer[i]);
        }

        return answer;
    }
}