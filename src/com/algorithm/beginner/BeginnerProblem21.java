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
    //정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
    // num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
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
