package com.algorithm.programers;

public class Progrmmers_81301 {

    //https://school.programmers.co.kr/learn/courses/30/lessons/81301
    public static void main(String[] args) {

        String s = "one4seveneight";
        String[] word = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};


        for(int i=0; i<word.length; i++){
            s=s.replace(word[i],String.valueOf(i));
        }


        System.out.println(s);
    }
}
