package com.algorithm.beginner;

public class BeginnerProblem13 {


    public static void main(String[] args) {

        int[] num = {5,-3};

        System.out.println(solution(num));

    }


    //x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다.
    // 좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중
    // 하나를 return 하도록 solution 함수를 완성해주세요.

    public static int solution(int[] dot){
        int answer =0;
        String x="";
        String y="";
        for(int data : dot) {

            if (data >= 0 & data==dot[0]) {
                x = "po";
            } else if(data <= 0 & data==dot[0]) {
                x = "ne";
            }

            if (data <0 & data==dot[1]) {
                y = "ne";
            } else if(data >= 0 & data==dot[1]) {
                y = "po";
            }
        }
         if("po".equals(x)){

             if("po".equals(y)){
                 answer = 1;
             }else{
                 answer = 4;
             }


         }else{

             if("ne".equals(y)){
                 answer = 3;
             }else{
                 answer = 2;
             }
         }

        return answer;
    }
}
