package com.algorithm.beginner;

public class BeginnerProblem12 {

    public static void main(String[] args) {

        System.out.println(solution(30,3));

    }

    //머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
    // 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
    // 정수 n과 k가 매개변수로 주어졌을 때,
    // 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지
    // return 하도록 solution 함수를 완성해보세요.
    public static int solution(int n , int k){

        int answer = 0;

        int yangGGochi= n*12000;
        int beverage = k*2000;

        if(n>=10){

            int cnt=n/10;
            beverage -= cnt*2000;

        }



        answer = yangGGochi + beverage;


        return answer;
    }

}
