package com.algorithm.programers;

public class DivideRemainderOne {

    public long remainderIsOne(int divisor){
        long answer =1;
        int dividend =0;
        while(divisor-1>=answer){

            if(divisor%answer==1){

                break;
            }
            answer++;
        }

        return answer;
    }



    public static void main(String[] args) {

        DivideRemainderOne divideRemainderOne = new DivideRemainderOne();
        System.out.println(divideRemainderOne.remainderIsOne(10));



    }




}
