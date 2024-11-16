package com.algorithm.beginner100;

import java.math.BigInteger;

public class BeginnerProblem79 {

    /*문자열 계산하기
     *PROGRAMMERS-962 행성에 불시착한 우주비행사 머쓱이는 외계행성의 언어를 공부하려고 합니다.
     *  알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어집니다.
     *  spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1,
     *  존재하지 않는다면 2를 return하도록 solution 함수를 완성해주세요.
     * */

    /*제한사항
        spell과 dic의 원소는 알파벳 소문자로만 이루어져있습니다.
        2 ≤ spell의 크기 ≤ 10
        spell의 원소의 길이는 1입니다.
        1 ≤ dic의 크기 ≤ 10
        1 ≤ dic의 원소의 길이 ≤ 10
        spell의 원소를 모두 사용해 단어를 만들어야 합니다.
        spell의 원소를 모두 사용해 만들 수 있는 단어는 dic에 두 개 이상 존재하지 않습니다.
        dic과 spell 모두 중복된 원소를 갖지 않습니다.
     * */
    public static void main(String[] args) {

        //String[] spell={"p", "o", "s"};
        String[] spell = {"z", "d", "x"};
        //String[] spell={"s", "o", "m", "d"};
        //String[] spell={"a", "b", "c", "d"};
        //String[] dic={"sod", "eocd", "qixm", "adio", "soo"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};
        //String[] dic={"moos", "dzx", "smm", "sunmmo", "som"};
        System.out.println(solution(spell, dic));
    }

    public static long solution(String[] spell, String[] dic) {
        int answer = 0;
        int length = 0;
        int temp = 0;

        for (int i = 0; i < dic.length; i++) {

            for (int j = 0; j < spell.length; j++) {

                if (dic[i].contains(spell[j])) {
                    temp++;
                    System.out.println(dic[i]);
                    System.out.println(temp);
                }



            }
            if (temp == spell.length) {
             return  answer = 1;
            }
            temp = 0;
        }

        return answer=2;
    }
}
