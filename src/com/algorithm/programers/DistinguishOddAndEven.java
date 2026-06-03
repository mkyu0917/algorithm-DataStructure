package com.algorithm.programers;

public class DistinguishOddAndEven {

    public void oddAndEvenNumberJugde(int num){

        String answer = "";

        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }



    }

    public void oddAndEvenNumberJugde2(int num){


        System.out.println(num%2==0? "Even" : "Odd");
    }



    public static void main(String[] args) {

        int num = 1923948;
        int num2 = 123;

        DistinguishOddAndEven distinguishOddAndEven = new DistinguishOddAndEven();

        distinguishOddAndEven.oddAndEvenNumberJugde(num);
        distinguishOddAndEven.oddAndEvenNumberJugde2(num2);

    }
}
