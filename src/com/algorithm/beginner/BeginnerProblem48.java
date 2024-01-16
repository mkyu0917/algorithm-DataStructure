package com.algorithm.beginner;

import java.util.Arrays;
import java.util.function.Consumer;

public class BeginnerProblem48
{
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        for(int num :solution(arr)){
            System.out.println(num);
        }
    }
    /*
    정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
    제한사항
    1 ≤ array의 길이 ≤ 100
    0 ≤ array 원소 ≤ 1,000
    array에 중복된 숫자는 없습니다.
     */

    public static int[] solution(int[] array){

        int[] answer = new int[2];
        int max =0;

        for(int i=0; i<array.length ; i++){

            if(max<array[i]){
                max = array[i];
                answer[0]=max;
                answer[1]=i;
            }


        }




        return answer;


    };
}
