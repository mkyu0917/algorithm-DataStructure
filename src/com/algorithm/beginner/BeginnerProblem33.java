package com.algorithm.beginner;

public class BeginnerProblem33 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] array = solutions(arr,2,3);

        for(int num: array){
            System.out.println(num);
        }
    }
   /*
   * 배열자르기 다시풀기
   * */

    public static int[] solutions(int[] numbers, int num1, int num2){

        int num1dis = num1;
        int num2dis = num2;
        int length = 0;
        if(num1==0){
            num1dis=num1;
            num2dis=num2+1;
            length=num1+num2;
        }else{
            num1dis = num1+1;
            num2dis = num2+1;
           length= (num2dis-num1dis)+1;
        }


        int[] answer = new int[length];



        int cnt =0;
        for(int i=num1; i< numbers.length; i++) {

            if (i <= num2) {
                answer[cnt] = numbers[i];
                cnt++;
            }

            if (cnt == num2) {
                break;
            }

        }

        return answer;
    }
}
