package com.algorithm.beginner;

public class BeginnerProblem50 {

    public static void main(String[] args) {

        System.out.println(solution("I love you", 3,6));
    }
    /*

    문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
    my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을
    return 하도록 solution 함수를 완성해보세요.
    제한사항
    1 < my_string의 길이 < 100
    0 ≤ num1, num2 < my_string의 길이
    my_string은 소문자로 이루어져 있습니다.
    num1 ≠ num2
     */
    public static String solution(String my_string, int num1, int num2){
        String answer = "";
        Character temp1 = null;
        Character temp2 = null;
        int index = 0;
        char[] array = my_string.toCharArray();

        for(int i =0 ; i<array.length; i++){

            if(num1==i){
                temp1=array[i];
                index = num1;
            }else if(num2==i){
                temp2 = array[i];
                array[index]=temp2;
                array[i]=temp1;

            }

        }

        for(char chr : array){
            answer += chr;
        }

        return answer;

    }
}
