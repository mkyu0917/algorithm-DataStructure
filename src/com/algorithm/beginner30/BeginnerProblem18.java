package com.algorithm.beginner30;

import java.util.Arrays;

public class BeginnerProblem18 {

    public static void main(String[] args) {

        String[] str1 = {"a", "b", "c"};
        String[] str2 = {"com", "b", "d", "p", "c"};

        //String[] str1 = {"n", "omg"};
        //String[] str2 = {"m", "dot"};
        System.out.println(solution(str1, str2));



    }
        //두 배열이 얼마나 유사한지 확인해보려고 합니다.
        // 문자열 배열 s1과 s2가 주어질 때
        // 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
        /*s1	s2	result
        ["a", "b", "c"]	["com", "b", "d", "p", "c"]	2
        ["n", "omg"]	["m", "dot"]	0    */
    public static int solution(String[] s1, String[] s2){

        int answer = 0;

        for(int i=0; i<s1.length ;i++){
            for(int j=0; j<s2.length; j++){

                if(s1[i].equals(s2[j])){
                    answer+=1;
                    System.out.println("answer 값" + answer);
                }


            }
        }

        return answer;

    }

}
