package com.algorithm.beginner;

public class BeginnerProblem36 {

    public static void main(String[] args) {

        System.out.println(solution(304050));
    }

    public static int solution(int price){
        int answer = 0;
        double temp=0d;

        if(price>500000){

            temp=price*0.8;
            answer=(int)Math.floor(temp);
            System.out.println(temp);

        }else if(price>=300000){
            temp=price*0.9;
            answer=(int)Math.floor(temp);
            System.out.println(temp);

        }else if(price>100000){
            temp=price*0.95;
            answer=(int)Math.floor(temp);
            System.out.println(temp);
        }else{
            answer=price;
        }

        return answer;
    }

}
