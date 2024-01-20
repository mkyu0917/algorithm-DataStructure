package com.algorithm.beginner50;

public class BeginnerProblem33 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        int[] array = solutions(arr,0,2);

        for(int num: array){
            System.out.println(num);
        }
    }
   /*
   * 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
   *  numbers의 num1번 째 인덱스부터 num2번째
   *  인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
   * 2 ≤ numbers의 길이 ≤ 30
     0 ≤ numbers의 원소 ≤ 1,000
     0 ≤num1 < num2 < numbers의 길이
   * */



    public static int[] solutions(int[] numbers, int num1, int num2){


        int[] answer = new int[num2-num1+1]; //배열의 크기
        int cnt = 0;
        for(int i = num1; num1<=num2; i++){

            if(i>num2){
                break;
            }
            answer[cnt]=numbers[i];
            cnt++;
        }

        return answer;
    }
}
