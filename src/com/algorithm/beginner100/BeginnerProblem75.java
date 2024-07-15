package com.algorithm.beginner100;

import java.util.Arrays;

public class BeginnerProblem75 {

/*

*  문자열 my_str과 n이 매개변수로 주어질 때,
*  my_str을 길이 n씩 잘라서 저장한 배열을
*   return하도록 solution 함수를 완성해주세요.
*
*
    제한사항
    1 ≤ my_str의 길이 ≤ 100
    1 ≤ n ≤ my_str의 길이
    my_str은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.
 */
    public static void main(String[] agrs){
        //String str ="10 20 30 40";
        String str ="abc1Addfggg4556b";
        solution(str, 6);
    }

    public static String[] solution(String my_str, int n) {

        int size = (my_str.length()%n)!=0?(my_str.length()/n)+1:my_str.length()/n;
        //System.out.println(size);

        String[] answer = new String[size];
        String[] word= my_str.split("");


        for(int i=0; i < size; i++){
            String answers ="";
            for(int j=n*i;j<word.length;j++){
                if(j<n){
                    answers+=word[j];
                    answer[i]=answers;
                }else if(j<n*(i+1)){
                    answers+=word[j];
                    answer[i]=answers;
                }

            }
            System.out.println(answer[i]);
        }

        return answer;
    }
}
