package com.algorithm.beginner70;

import java.util.*;

public class BeginnerProblem61 {

    public static void main(String[] args) {

        solution("We are the world");
        solution("people");

    }
    /*
    문자열 my_string이 매개변수로 주어집니다.
    my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을
    return하도록 solution 함수를 완성해주세요.

    대문자 소문자 구분, 공백도 하나의 문자, 중복된 문자중 가장 앞에 있는 문자를 남김
    * */
    public static String solution(String my_string){

        String answer ="";

        char[] arr=my_string.toCharArray();
        char[] dupl = {};
        Set<Character> sets = new LinkedHashSet<>();

        for(char data:arr) {
            sets.add(data);
        }

        for(char data:sets) {

            answer+=data;

        }

        System.out.println(answer);



        return answer;
    }
}
