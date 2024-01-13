package com.algorithm.beginner;

import java.util.Arrays;

public class BeginnerProblem47 {

    /*
    * 정수 배열 numbers가 매개변수로 주어집니다.
    * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을
    * return하도록 solution 함수를 완성해주세요.
    *제한사항
        -10,000 ≤ numbers의 원소 ≤ 10,000
        2 ≤ numbers 의 길이 ≤ 100
    * */
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,3,1,2,6};
        solution(arr);
    }


    public static int solution(int[] numbers){

//        int answer = 0;
//        int max =10000*-10000;
//        for(int i=0; i<numbers.length; i++){
//
//            for(int j=0; j<numbers.length ;j ++){
//
//                if(numbers[i]==numbers[j]&&i==j){
//                    continue;
//                }
//                int temp = numbers[i]* numbers[j];
//                System.out.println("max: " +max + "tmep: "+temp);
//
//                if(temp>max){
//                    max = temp;
//
//                }
//                answer = max;
//            }
//
//        }
//        return answer;
        int leng = numbers.length;
        Arrays.sort(numbers);
        for(int num : numbers){
            System.out.println(num);
        }
        return Math.max(numbers[0] * numbers[1], numbers[leng-2] * numbers[leng-1]);
    }
}
