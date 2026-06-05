package com.algorithm.programers;

public class BetweenNumbersSum {


    public static void main(String[] args) {

        BetweenNumbersSum betweenNumbersSum = new BetweenNumbersSum();
        System.out.println("betweenNumbersSum = " + betweenNumbersSum.BetweenNumbers(4,7));

    }

    private long BetweenNumbers(int x, int y){
        long answer =0;
        answer= (long) (x+y) * (Math.abs(x - y)+1)/2;

        return answer;
    }
}
