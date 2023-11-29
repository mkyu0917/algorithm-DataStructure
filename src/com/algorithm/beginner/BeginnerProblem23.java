package com.algorithm.beginner;

import java.util.Arrays;
import java.util.Iterator;

public class BeginnerProblem23 {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        int[] retNumbers =solution(numbers);

        for(int value :retNumbers){
            System.out.println(value);
        }


    }

    //정수 배열 numbers가 매개변수로 주어집니다.
    // numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록
    // solution 함수를 완성해주세요.



    public static int[] solution(int[] numbers){

        int num =0;


        for(int i =0; i<numbers.length; i++){
            num=numbers[i] * 2;
            numbers[i]=num;

        }


        return numbers;
    }
}
