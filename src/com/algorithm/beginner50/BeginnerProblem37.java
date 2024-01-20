package com.algorithm.beginner50;

import java.lang.reflect.Array;

public class BeginnerProblem37 {

    public static void main(String[] args) {
        System.out.println(solution(930211));

    }
    /*정수 n이 매개변수로 주어질 때 n의
    각 자리 숫자의 합을 return하도록
    solution 함수를 완성해주세요
    * */
    public static int solution(int n){
        int answer =0;

        char[] arr = String.valueOf(n).toCharArray();

        for(char num : arr){
            answer +=Character.getNumericValue(num);
        }


        return answer;
    }
}
