package com.algorithm.beginner100;

import java.util.ArrayList;

public class BeginnerProblem73 {
/*
* 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.
* 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
* 따라서 12의 소인수는 2와 3입니다.
* 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
*
* 제한사항
return 값은 이진수를 의미하는 문자열입니다.
1 ≤ bin1, bin2의 길이 ≤ 10
bin1과 bin2는 0과 1로만 이루어져 있습니다.
bin1과 bin2는 "0"을 제외하고 0으로 시작하지 않습니다.
* */
    public static void main(String[] agrs){
        String bin1 ="10";
        String bin2 ="11";

        solution(bin1, bin2);
    }

    public static String solution(String bin1, String bin2) {

        //2진수를 10진수로 변환
        int bin_1=Integer.parseInt(bin1,2);
        int bin_2=Integer.parseInt(bin2,2);

        System.out.println(bin_1);
        System.out.println(bin_2);


        //10지수를 2진수ㅗ
        String answer = Integer.toBinaryString(bin_1+bin_2);

        System.out.println(answer);

        return answer;
    }
}