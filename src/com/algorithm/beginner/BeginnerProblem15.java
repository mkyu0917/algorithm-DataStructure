package com.algorithm.beginner;

public class BeginnerProblem15 {


    public static void main(String[] args) {

        //int[] numbers = {0, 31, 24, 10, 1, 9};
        int[] numbers = {1,1,1,1};

        System.out.println(solution(numbers));

    }

    //정수 배열 numbers가 매개변수로 주어집니다.
    //numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
    /*입출력 예 #1

    두 수의 곱중 최댓값은 4 * 5 = 20 입니다.
    입출력 예 #1

    두 수의 곱중 최댓값은 31 * 24 = 744 입니다.

    테스트케이스에서 똑같은 값이 있을 수 있음 ex) 1,1,1,1

    */



    public static int solution(int[] number){

        int answer=0;
        int firstMax =0;
        int secontMax =0;
        int max =0;

        for(int i=0; i< number.length; i++){
            if(max<=number[i]){
                max = number[i];
                firstMax=max;
            }

        }

        max=0;

        for(int j = 0; j<number.length; j++){
            if(max<number[j]&&number[j]<firstMax){
                max =  number[j];
                if(max<firstMax) {
                    secontMax = max;
                }
            }else if(firstMax==1){
                    secontMax = 1;
            }

        }

        answer = firstMax * secontMax;


        return answer;
    }

}
