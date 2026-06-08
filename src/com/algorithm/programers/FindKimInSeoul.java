package com.algorithm.programers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindKimInSeoul {

    static void useStream(String[] seoul){

        String answer = IntStream.range(0, seoul.length)
                .filter(n -> seoul[n].equals("Kim"))
                .mapToObj(n-> "김서방은 "+n+"에 있다")
                .findFirst()
                .get();
        System.out.println("stream = " + answer);
    }

    static void useOnlyJava(String[] seoul){
        int index = Arrays.asList(seoul).indexOf("Kim");
        String answer = "김서방은 "+index+"에 있다";
        System.out.println("string = " + answer);
    }

    public static void main(String[] args) {
        String[] str = new String[]{"Jane", "Kim"};
        useStream(str);
        useOnlyJava(str);
    }

}
