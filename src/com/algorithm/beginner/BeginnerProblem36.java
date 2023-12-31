package com.algorithm.beginner;

public class BeginnerProblem36 {

    public static void main(String[] args) {

        System.out.println(solution(304050));
    }
    /*
    * 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
    * */
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
