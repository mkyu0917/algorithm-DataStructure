package com.algorithm.beginner;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BeginnerProblem42 {

    public static void main(String[] args) {
        int[] arr = {2, 100, 120, 600, 12, 12};
        solution(3,arr);

        for(int num: solution(12, arr)){
            System.out.println(num);
        }
    }
      /*
          정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
          mlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록
          solution 함수를 완성해주세요.

          1 ≤ n ≤ 10,000
          1 ≤ numlist의 크기 ≤ 100
          1 ≤ numlist의 원소 ≤ 100,000
nu     */
    public static int[] solution(int n, int[] numList) {
        int cnt = 0;
//       IntStream intStream = Arrays.stream(numList);
//
//       answer=intStream.filter(x ->x%3 == 0).toArray();

        for(int num : numList){

            if(num%n==0){
                cnt++;
            }

        }
        int[] answer = new int[cnt];
        int i=0;
        for(int num : numList){
            if(num%n==0){
                answer[i]=num;
                i++;
            }

        }



        return answer;
    };
}
