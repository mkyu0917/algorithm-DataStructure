package com.algorithm.beginner70;

import java.util.regex.Pattern;

public class BeginnerProblem65 {

//    문자열 my_string이 매개변수로 주어집니다.
//    my_string은 소문자, 대문자, 자연수로만 구성되어있습니다.
//    my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
    public static void main(String[] args){

        solution("1a2b3c4d123Z");

    }

    public static int solution(String my_string) {
        int answer = 0;

        String[] num = my_string.replaceAll("\\D","#").split("#");


        for(String data : num){

            System.out.println(data);

            if(Pattern.matches("",data)){
                continue;
            }else{
                answer +=Long.valueOf(data);
            }
        }

        System.out.println(answer);
        return answer;
    }

}
