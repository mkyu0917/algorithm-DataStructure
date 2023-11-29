package com.algorithm.beginner;

public class BeginnerProblem26 {

    public static void main(String[] args) {

        int[] sides={3, 6, 2};

        System.out.println(solution(sides));


    }
    /*선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
        가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
        삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
        세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
        -- 이 문제는 이등변 삼각형일 경우도 생각해야함 Ex) 3,3,2--
        */
    public static int solution(int[] sides){


        int answer = 0;
        int maxSide =0;
        int sumSide =0;

        int sum2Side = 0;


        for(int num: sides){
            if(maxSide<num){
                maxSide=num;
            }
            sumSide +=num;
        }

        sum2Side = sumSide - maxSide;


        if(sum2Side>maxSide){
            answer = 1;
        }else{
            answer = 2;
        }


        return answer;
    }
}
