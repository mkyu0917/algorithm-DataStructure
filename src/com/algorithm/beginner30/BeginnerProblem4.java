package com.algorithm.beginner30;

public class BeginnerProblem4 {

    //정수 num1, num2가 매개변수로 주어질 때,
    // num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.

    public static void main(String[] args) {

        System.out.println(solution(23,14));
    }

    public static int solution(int num1 , int num2){

        int answer = 0;

        answer = num1/num2;

        return answer;


    }
}
