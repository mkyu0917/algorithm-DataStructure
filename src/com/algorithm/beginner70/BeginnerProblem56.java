package com.algorithm.beginner70;

public class BeginnerProblem56 {

    public static void main(String[] args) {
        solution(2);
    }
    /**
     * 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
     * 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면
     * 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
     * 유클리드 호제법을 써야함 GCD(Greatest Common  Diviser)최대공배수 & LCM(Least Common Multiple)
     */

    public static int GCD(int num1, int num2){
        //두수의 최대공약수구하기
        // num1%num2==0 아니면 num1/num2 나머지 r 구함
        // num2/r==0이 나올때까지 반복

        return num1%num2==0?num2:GCD(num2,num1%num2);
    }

    public static int LCM(int num1, int num2){
        //두수의 최소공약수구하기
        // num1%num2==0 아니면 num1/num2 나머지 r 구함
        // num2/r==0이 나올때까지 반복

        return num1*num2/GCD(num1,num2);
    }



    public static int solution(int n) {

        //피자 한판이 6조각
        //n은 인원수

        //내가 푼방식.. 잘못됨
        /*int answer =0;

        for(int i=1; i<=n; i++) {

            if((i*6)%n==0){
                answer = i;
                System.out.println(i);
                break;
            }

        }*/
        int answer = LCM(n, 6)/6;
        System.out.println(answer);
        return answer;

    }

}
