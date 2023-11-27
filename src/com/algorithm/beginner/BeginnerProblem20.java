package com.algorithm.beginner;

import java.util.Arrays;

public class BeginnerProblem20 {

    public static void main(String[] args) {

        int[] num_list={1,2,3,4,5,6,8,9,10};

        //System.out.println(Arrays.stream(solution(num_list)).iterator);
        int[] answer=solution(num_list);
        for(int i=0; i<answer.length;i++){
            System.out.println(answer[i]);
        }


    }
    //정수가 담긴 리스트 num_list가 주어질 때,
    // num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록
    // solution 함수를 완성해보세요.
    public static int[] solution(int[] num_list){

        int[] answer = new int[2];

        int oddCnt=0;
        int evenCnt=0;
        for(int i =0 ; i< num_list.length; i++){

            if((num_list[i]%2)==0){
                evenCnt+=1;
            }else{
                oddCnt+=1;
            }


        }
        answer[0]=evenCnt;
        answer[1]=oddCnt;
        return answer;
    };

}
