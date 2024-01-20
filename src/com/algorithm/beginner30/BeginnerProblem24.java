package com.algorithm.beginner30;

public class BeginnerProblem24 {

    public static void main(String[] args) {

        System.out.println(solution(36));

    }
    //어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
    // 정수 n이 매개변수로 주어질 때,
    // n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
    public static int solution(int n){
        int answer=0;
        int num=0;
        for(int i=1; i<1000000; i++){

            num=i * i;
            if(num==n){
                answer =1;
                break;
            }else if(num>n){
                answer =2;
                break;
            }
        }


        return answer;
    };

}
