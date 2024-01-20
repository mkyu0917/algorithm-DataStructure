package com.algorithm.beginner50;

import java.sql.Array;

public class BeginnerProblem32 {

    public static void main(String[] args) {

        //int[] arr = {1,2,7,10,11};
        int[] arr = {9,-1,0};
        System.out.println(solution(arr));

    }

   /*
   * 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
   *  예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
   *  정수 배열 array가 매개변수로 주어질 때,
   *  중앙값을 return 하도록 solution 함수를 완성해보세요.*/

    public static int solution(int [] array){
        int answer=0;
        //중앙값,

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                if(array[i]>=array[j]){
                    int temp =0;

                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;

                }else if(array[i]<array[j]){
                     continue;

                }

            }

            if(array.length-1 == i){
                answer = array[i/2];
            }

        }

        return answer;
    }

}
