package com.algorithm.programers;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MakeWord {

    public void solution(int n) {

        StringBuilder sb = new StringBuilder();


         while(sb.length() < n){
             if(sb.length()%2==0){
                 sb.append("수");
             }else{
                 sb.append("박");
             }

         }
        System.out.println(sb.toString());

    }

    public String useStream(int n){
        return IntStream.range(0,n)
                .mapToObj(i -> i % 2==0 ? "수" : "박")
                .peek(System.out::print)
                .collect(Collectors.joining());

    }

    public static void main(String[] args) {

        MakeWord makeWord= new MakeWord();
        makeWord.solution(4);
        makeWord.useStream(3);
    }
}
