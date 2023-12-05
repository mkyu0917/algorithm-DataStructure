package com.algorithm.beginner;

public class BeginnerProblem28 {

    public static void main(String[] args) {
        System.out.println(solution("apple"));
    }

    /*
    영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
    문자열 my_string이 매개변수로 주어질 때
    모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
     */

    public static String solution(String str){

        String answer = "";

        char[]  alphabet=str.toCharArray();

        for (int i = 0; i < alphabet.length; i++) {

                if (alphabet[i] == 'i') {
                    continue;
                } else if (alphabet[i] == 'e') {
                    continue;
                } else if (alphabet[i] == 'a') {
                    continue;
                } else if (alphabet[i] == 'o') {
                    continue;
                } else if (alphabet[i] == 'u') {
                    continue;
                } else {
                    answer += alphabet[i];
                }
            }

        return answer;
    }
}
