package com.algorithm.beginner70;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.util.ArrayList;

public class BeginnerProblem67 {
    /*
     1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
     정수 i, j, k가 매개변수로 주어질 때,
     i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
     */
    public static void main(String[] agrs){
        solution(1,13,1);
    }

    public static int solution(int i , int j, int k){
        int answer = 0;
        int radix=10; // 10진수
        int value_int = k;
        char match = Character.forDigit(k,10);// 10숫자 char 변환

        System.out.println(match);

        // ArrayList<String> arr = new ArrayList();

        for(int a=i;a<=j;a++){

            //arr.add(String.valueOf(a));
            char[] num = String.valueOf(a).toCharArray();
            for(char numbers : num){
                //System.out.println(numbers);
                int matchNumb1=Character.getNumericValue(numbers);
                int matchNumb2=Character.getNumericValue(match);

                if(matchNumb1==matchNumb2){
                    answer++;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }

}
