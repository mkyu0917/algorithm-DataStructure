package com.algorithm.beginner70;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BeginnerProblem59 {


    public static void main(String[] args) {

        System.out.println(solution("Python"));
    }
    /*
    * 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
    * my_string을 모두 소문자로 바꾸고
    * 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
    *
    * */

    public static String solution(String my_String){

        String answer ="";
        char[] chars = my_String.toLowerCase().toCharArray();

        int[] sortList = new int[chars.length];
        int i=0;
        for(char ch: chars){
            sortList[i]=Integer.valueOf(ch);
            i++;
        }

        sortList=Arrays.stream(sortList).sorted().toArray();

        for(int chs : sortList){
            answer+=String.valueOf(Character.toChars(chs));
        }


        return answer;

    }

}
