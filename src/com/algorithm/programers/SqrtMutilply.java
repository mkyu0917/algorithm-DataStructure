package com.algorithm.programers;

public class SqrtMutilply {

    static void sqrtMultiply(long num){

        long answer =0;

        double sqrtNum=Math.sqrt(num);
        if(sqrtNum%1==0){
            double number=Math.pow(sqrtNum+1,2);
            answer = Math.round(number);

        } else {
            answer=-1;
        }

        System.out.println(answer);
    }

    static void sqrtMultiply2(long num){

        long answer = 0;

        int sqrtNum = (int)Math.sqrt(num);

        if((sqrtNum * sqrtNum) == num){
            sqrtNum=sqrtNum+1;
            answer = sqrtNum * sqrtNum;
        }else{
            answer = -1;
        }


        System.out.println(answer);
    }


    public static void main(String[] args) {

        sqrtMultiply(121);
        sqrtMultiply2(121);
    }
}
