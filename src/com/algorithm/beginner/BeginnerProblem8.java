package com.algorithm.beginner;

public class BeginnerProblem8 {
    //정수 num1과 num2가 매개변수로 주어질 때,
    // num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
    public static void main(String[] args) {
        System.out.println(solution(1,16));
    }

    public static int solution(int num1, int num2){

        //문제를 잘 이해해보면, 매개변수는 int임, 근데 계산했을때 결과값은 double로 나와야함
        //그럼 계산전에 두 값중에 하나를 double로 변환해야함

        int answer = 0;
        double temp =0.0d;

        double param1 = num1;
        //double param2 = num2;

        temp = (param1/num2)*1000;
        System.out.println(temp);

        answer=(int)temp;


        /*temp = (double)num1/num2;
        System.out.println("temp: "+temp);
        answer = (int)(temp*1000);
        System.out.println("answer: "+answer);*/
        return answer;
    }

}
