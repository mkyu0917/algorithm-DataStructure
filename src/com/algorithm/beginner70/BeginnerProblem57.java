package com.algorithm.beginner70;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BeginnerProblem57 {

    public static void main(String[] args) {
        System.out.println(solution(123456,2));
        //solution(123456,2);
    }
    /*
    * 정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는
    * 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
     *0 < num < 1,000,000
        0 ≤ k < 10
        num에 k가 여러 개 있으면 가장 처음 나타나는 자리를 return 합니다.

    * */
    public static int solution(int num, int k){

        int answer =0;

        char[] value = String.valueOf(num).toCharArray();

        int i=1;
        for(char ch : value){
            String num1=String.valueOf(ch);
            String num2=String.valueOf(k);
            if(num1.equals(num2)){
                answer = i;
                break;
            }else{
                answer = -1;
            }
            i++;
        }

        return answer;
    }

}
