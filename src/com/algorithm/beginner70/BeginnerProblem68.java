package com.algorithm.beginner70;

import java.util.ArrayList;
import java.util.Arrays;

public class BeginnerProblem68 {
    /*
     정수 배열 array와 정수 n이 매개변수로 주어질 때,
     array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
     1 ≤ array의 길이 ≤ 100
     1 ≤ array의 원소 ≤ 100
     1 ≤ n ≤ 100
     가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.
     */
    public static void main(String[] agrs){
        int numArr[] = {2,2,1};
        //int numArr[] = {2,2,1};
        solution(numArr, 2);
    }



    public static int solution(int[] array, int n) {


        int answer = 0;
        Arrays.sort(array); // 오름차순 정렬


        for (int i = 1; i < array.length; i++) {

            if(Math.abs(array[0]-n) > Math.abs(n-array[i])){
                    array[0]=array[i];
            }
        }
        answer = array[0];
        System.out.println(answer);
            return answer;
        }

    }
