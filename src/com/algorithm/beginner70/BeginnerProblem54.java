package com.algorithm.beginner70;

public class BeginnerProblem54 {

    public static void main(String[] args) {
           // int[] arr = {1,2,3};
            int[] arr = {4, 455, 6, 4, -1, 45, 6};
            solution(arr,"right");
    }
    /*
    * 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
    * 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록
    * solution 함수를 완성해주세요.
    * 3 ≤ numbers의 길이 ≤ 20 direction은 "left" 와 "right" 둘 중 하나입니다
    * */
    public static int[] solution(int [] numbers, String direction){
        int[] answer = {};
        int[] copyArray = numbers.clone();

        int temp2 =0;
        int lastIndex=copyArray.length;;
        int firstIndex=0;

        if("right".equals(direction)) {
            for (int i = 1; i <= numbers.length; i++) {

                if (lastIndex - (i * 1 + 1) >= 0) {
                    temp2 = copyArray[lastIndex - (i * 1 + 1)];
                    numbers[lastIndex - i] = temp2;
                } else {
                    numbers[0] = copyArray[lastIndex-1];
                }
            }
        }else {
            for (int i = 1; i <= numbers.length; i++) {

                if (lastIndex -(1*i+1) >= 0) {
                    temp2 = copyArray[lastIndex-(1*i)];
                    //System.out.println(temp2);
                    numbers[lastIndex-(i*1+1)] = temp2;
                } else {
                    System.out.println(copyArray[0]);
                    numbers[lastIndex-1] = copyArray[0];
                    //numbers[lastIndex-1] = 1;

                }
            }
        }

        return answer;
    }
}
