package com.algorithm.programers;

public class CaesarCipher {

    //https://school.programmers.co.kr/learn/courses/30/lessons/12926
    public static void main(String[] args) {

        String s = "a B z";
        int n = 4;
        char chr = ' ';
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            int nowIdx= 0;
            int nextIdx = 0;
            boolean isCapital=false;

            if(s.charAt(i)==' '){
                sb.append(' ');
                continue;
            }

            if( s.charAt(i)>=65 && s.charAt(i)<=90){
                nowIdx=s.charAt(i)-'A';
                isCapital=true;
            }else if(s.charAt(i)>=97 && s.charAt(i)<=122){
                nowIdx=s.charAt(i)-'a';
            }

            nextIdx = (nowIdx + n) % 26;

            if(isCapital){
                chr = (char)('A'+nextIdx);
            }else{
                chr = (char)('a'+nextIdx);
            }

            sb.append(chr);

        }

        System.out.println(sb.toString());

    }

}
