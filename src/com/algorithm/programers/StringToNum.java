package com.algorithm.programers;


// 프로그래머스 문자열을 정수로 바꾸기


public class StringToNum {


    public static String word(){

        return "-1234";

    }


    public static void main(String[] args) {

        int answer = 0;
        boolean negative = false;
        String s=word();

        if(s.contains("-")){
            s=s.replace("-","");
            negative=true;
        }else{
            s=s.replace("+","");
        }
        for(int i=0; i<s.length(); i++){

            answer = answer * 10 + (s.charAt(i)-'0');

        }

        if(negative){
            answer*=-1;
        }

        System.out.print(answer);
    }

}
