package com.algorithm.beginner;

import java.util.Arrays;

public class BeginnerProblem52 {

    public static void main(String[] args) {

        solution("hi12392");

        for(int num : solution("hi12392")){
            System.out.println(num);
        }
    }
    /**
     * 문제 설명
     * 문자열 my_string이 매개변수로 주어질 때,
     * my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
     *
     * 제한사항
     * 1 ≤ my_string의 길이 ≤ 100
     * my_string에는 숫자가 한 개 이상 포함되어 있습니다.
     * my_string은 영어 소문자 또는 0부터 9까지의 숫자로 이루어져 있습니다. - - -
     */
    public static int[] solution(String my_string){

        int[] answer ={};

        String[] str=my_string.split("");

        answer=Arrays.stream(str).sorted().filter(s->s.matches("\\d")).mapToInt(Integer::valueOf).toArray();

        return answer;


    }



}
