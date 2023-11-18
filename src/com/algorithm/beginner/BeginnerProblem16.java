package com.algorithm.beginner;

public class BeginnerProblem16 {

    public static void main(String[] args) {

        int[] num_list = {1, 2, 3, 4, 5, 6};


    }

    //정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
    // num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.

    public static int[] solution(int[] num_list) {
        int listSize = num_list.length;
        int[] answer = new int[listSize];
        int j = 0;
        //num_list = {1,2,3,4,5,6};

        for (int i = num_list.length - 1; i <= num_list.length; i--) {


            answer[j] = num_list[i];
            System.out.println(answer[j]);
            j++;

            if (i == 0) {
                break;
            }
        }
        return answer;
    }
}
