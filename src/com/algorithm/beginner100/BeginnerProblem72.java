package com.algorithm.beginner100;

import java.util.ArrayList;

public class BeginnerProblem72 {
/*
* 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.
* 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
* 따라서 12의 소인수는 2와 3입니다.
* 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
* */
    public static void main(String[] agrs){
        int n = 10000;

        solution(n);
    }

    public static int[] solution(int n) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        int divide =2;
        int value=0;

        while(n>=2){

            if(n%divide==0){
                n=n/divide;

                if(!arr.contains(divide)) {
                    arr.add(divide);
                }
                //System.out.println(divide);
            }else if(n%divide!=0){
                divide++;
            }
        }

        int[] answer = new int[arr.size()];
        int count=0;
        for(int t : arr){
            System.out.println(t);
            answer[count]=t;
            count++;
        }

        //System.out.println(answer[3]);

        return answer;
    }
}