package com.algorithm.beginner70;

import java.util.Arrays;
import java.util.stream.Stream;

public class BeginnerProblem53 {

    public static void main(String[] args) {

        for(int num:solution(24)){
            System.out.println(num);
        }
    }
    /*
    * 문제 설명
    * 정수 n이 매개변수로 주어질 때,
    * n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
    * 제한사항
    * 1 ≤ n ≤ 10,000
    *
    * */
    public static int[] solution(int n){

        int cnt = 0;
        int number =0;

        for(int i=1; i<=n ; i++){

            if((n%i)==0){
                cnt++;
            }
        }

        int[] answer = new int[cnt];

        for(int i=1; i<=n ; i++){
            if(n%i==0){
                answer[number]=i;
                number++;
            }
        }


        return answer;

    }
}
