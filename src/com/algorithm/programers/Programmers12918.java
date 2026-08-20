package com.algorithm.programers;

public class Programmers12918 {

    //https://school.programmers.co.kr/learn/courses/30/lessons/12918
    private boolean solution(String s) {

        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i);
            if (num < 48 || num > 57) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Programmers12918 p = new Programmers12918();

        System.out.println(p.solution("1234"));
        System.out.println(p.solution("a234"))

    }

}
