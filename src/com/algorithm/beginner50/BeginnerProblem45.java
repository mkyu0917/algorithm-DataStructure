package com.algorithm.beginner50;

import groovyjarjarantlr4.runtime.CharStream;

import java.util.Arrays;
import java.util.stream.Stream;

public class BeginnerProblem45 {

    public static void main(String[] args) {
        System.out.println(solution("eifjEAFXxdfwQQ"));
    }
    /*문자열 my_string이 매개변수로 주어질 때,
     대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록
      solution 함수를 완성해주세요.
    * */
    public static String solution(String my_string){

        String answer = "";

        char[] arr = my_string.toCharArray();

        for(char str : arr) {

            if (Character.isUpperCase(str)) {
                answer += Character.toLowerCase(str);
            } else if (Character.isLowerCase(str))
                answer += Character.toUpperCase(str);
        }


        return answer;
    }
}
