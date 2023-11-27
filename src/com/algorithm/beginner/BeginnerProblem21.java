package com.algorithm.beginner;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BeginnerProblem21 {

    public static void main(String[] args) {
        String myString="abcdefg";
        System.out.println(solution(myString));
    }

    public static String solution(String my_string){

        String answer ="";

        char[] array = my_string.toCharArray();

        for(int i=array.length-1; i<array.length;i--){

            answer+=array[i];
            if(i==0){
                break;
            }
        }


        return answer;
    }
}
