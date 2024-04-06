package com.algorithm.beginner70;

import com.sun.org.apache.xerces.internal.impl.io.ASCIIReader;

import java.util.LinkedHashMap;
import java.util.Map;

public class BeginnerProblem63 {

    public static void main(String[] args){

        solution(".--. -.-- - .... --- -.");
    }

    public static String solution(String letter) {

        String answer = "";

        Map<String, Character> map = new LinkedHashMap<String , Character>();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-."
                ,"---",".--.","--.-",".-.","...","-","..-"
                ,"...-",".--","-..-","-.--","--.."};

        for(int i =0; i < morse.length; i++){
            int asc= 97+i;
            char alphabet = (char)asc;
            map.put(morse[i],alphabet);
        }

        String[] splitLetter=letter.split(" ");

        for(String data: splitLetter){

            answer+=map.get(data);
        }
        System.out.println(answer);
        return answer;
    }
}
