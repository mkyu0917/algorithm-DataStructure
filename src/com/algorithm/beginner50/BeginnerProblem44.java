package com.algorithm.beginner50;

public class BeginnerProblem44 {

    public static void main(String[] args) {

        System.out.println(solution("205"));
    }




    public static String solution(String rsp){
        String answer = "";

        char[] rspArr = rsp.toCharArray();

        for(char chr : rspArr)

        if("2".equals(Character.toString( chr ))){
            answer +="0";
        }else if("0".equals(Character.toString( chr ))){
            answer +="5";
        }else{
            answer +="2";
        }


        return answer;

    };
}
