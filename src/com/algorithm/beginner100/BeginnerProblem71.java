package com.algorithm.beginner100;

public class BeginnerProblem71 {
/*
* 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
* 정수 배열 emergency가 매개변수로 주어질 때
* 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록
* solution 함수를 완성해주세요.
* */
    public static void main(String[] agrs){
        //int[] arr={7,77,17};
        int[] arr={10,29};
        //int numArr[] = {2,2,1};
        solution(arr);
    }

    public static int solution(int[] arr) {

        int answer=0;
        String word = "";

        for(int data : arr){

            word+=String.valueOf(data);

        }

        String[] strings=word.split("");

        for(String num:strings){
            if("7".equals(num)){
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }
}