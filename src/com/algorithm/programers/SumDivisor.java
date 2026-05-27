package com.algorithm.programers;



public class SumDivisor {

    static int divisorCal(int num){

        int answer = 0;
        int count=0;
        for(int i=1; i<=Math.sqrt(num); i++) {
            if (num % i == 0) {//i가 num의 약수인지 확인
                if (i != (num / i)) {
                    //두약수중에 하나는 어떤수의 제곱근보다 작아야한다 ex) 루트12 3.46
                    //n = 12
                    //1 × 12
                    //2 × 6
                    //3 × 4
                    //4 x 4는 16 수를 넘어가버림
                    answer += i + (num / i);
                    System.out.println("answer = " + answer);
                } else if (i == (num / i)) {
                    //완전 제곱수일때 3x3이면 약수가 3이 두개가 더해져서 1개만 더하도록함
                    answer += i;

                }
            }
        }
        return answer;
    }



    public static void main(String[] args) {

        int num = 12;

        System.out.println(divisorCal(num));
    }




}
