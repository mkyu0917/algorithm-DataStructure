package com.algorithm.beginner30;

public class BeginnerProblem3 {
    //정수 num1과 num2가 매개변수로 주어집니다.
    // 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
    public static void main(String[] args) {
        System.out.println(solution(23,23));
    }

    public static int solution(int num1, int num2){

        int answer = 0;

        if(num1==num2){
            answer = 1;
            return answer;
        }else{
            answer = -1;
            return answer;
        }


    }
}
