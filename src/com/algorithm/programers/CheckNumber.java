package com.algorithm.programers;

public class CheckNumber {

    private boolean chkNumber(String s){

        if(s.length()!=4 && s.length()!=6){
            return false;
        }

        for(int i=0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {

        //문제
        //https://school.programmers.co.kr/learn/courses/30/lessons/12918

        CheckNumber cn = new CheckNumber();


        System.out.println(cn.chkNumber("1214"));

    }

}
