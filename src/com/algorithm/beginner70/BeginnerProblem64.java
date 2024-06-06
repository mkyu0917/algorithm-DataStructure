package com.algorithm.beginner70;

public class BeginnerProblem64 {

//    i! ≤ n
//    i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다. 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다.
//    정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
//    0 < n ≤ 3,628,800

    public static void main(String[] args){

        solution(3628800);

    }

    public static int solution(int n) {
        int answer = 1;

        for (int i = 1; i <=10 ; i++) {

            answer *= i;
            if(answer == n){
                answer = i;
                break;
            }else if (answer > n){
                answer = i-1;
                break;
            }

        }
        System.out.println(answer);

        return answer;
    }

}
