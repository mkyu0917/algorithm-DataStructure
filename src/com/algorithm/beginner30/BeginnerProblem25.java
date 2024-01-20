package com.algorithm.beginner30;

import java.sql.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BeginnerProblem25 {

    public static void main(String[] args) {
        String[] strlist ={"We", "are", "the", "world!"};
        int[] answer=solution(strlist);

        for(int str : answer){
            System.out.println(str);
        }

    }

    //문자열 배열 strlist가 매개변수로 주어집니다.
    // strlist 각 원소의 길이를 담은 배열을 retrun하도록
    // solution 함수를 완성해주세요.

    /*strlist	result
["We", "are", "the", "world!"]	[2, 3, 3, 6]
["I", "Love", "Programmers."]	[1, 4, 12]*/

    public static int[] solution(String[] strlist){
        int[] answer = new int[strlist.length];
        int length = 0;
        for(int i =0; i< strlist.length; i++){
            length=strlist[i].length();
            answer[i]=length;
        }


        return answer;
    }

}
