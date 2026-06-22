package com.algorithm.programers;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class CharacterDesc {

    private void normalVersion(String s){

        Character[] charArr = new Character[s.length()];
        for(int i=0; i< charArr.length; i++){
            charArr[i]=s.charAt(i);
        }

        Arrays.sort(charArr,Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(char chr :charArr){
            sb.append(String.valueOf(chr));
        }

        System.out.println(sb.toString());
    };

    private void useStream(String s){

        System.out.println( s.chars()
                .mapToObj(ascii -> String.valueOf((char)ascii))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining()));


    };

    public static void main(String[] args) {

        String s = "Fabcdeg";

        CharacterDesc cd = new CharacterDesc();
        cd.normalVersion(s);
        cd.useStream(s);


    }

}
