package com.algorithm.beginner70;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class BeginnerProblem66 {

// 문자열 before와 after가 매개변수로 주어질 때,
// before의 순서를 바꾸어 after를 만들 수 있으면 1을,
// 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.

    public static void main(String[] args){

        solution("apple","apple");

    }

    public static int solution(String before, String after) {
        //int answer = 0;
        Map<String,Integer> map1 = new LinkedHashMap<>();
        Map<String,Integer> map2 = new LinkedHashMap<>();
        String[] spelingBefore=before.split("");
        String[] spelingAfter=after.split("");
        int count=0;
        for(int i=0; i<spelingBefore.length; i++){

            for(int j=0; j<spelingBefore.length; j++){

                if(spelingBefore[i].equals(spelingBefore[j])){
                        count++;
                }

            }
            map1.put(spelingBefore[i],count);
            count=0;
        }

        for(int i=0; i<spelingAfter.length; i++){

            for(int j=0; j<spelingAfter.length; j++){

                if(spelingAfter[i].equals(spelingAfter[j])){
                    count++;
                }

            }
            map2.put(spelingAfter[i],count);
            count=0;
        }

        boolean test = map1.equals(map2);
        int answer = test==true? 1 : 0;
        return answer;
    }

}
