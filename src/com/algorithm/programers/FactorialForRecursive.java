package com.algorithm.programers;

public class FactorialForRecursive {

    static int factorial (int n){

                if(n==0){
                    return 1;
                }else if(n<0){
                    throw new IllegalArgumentException("잘못된 인수");
                }

        return n * factorial(n-1);
    }

    public static void main(String[] args) {

        // System.out.println(factorial(5));
        System.out.println(factorial(-1));

    }

}
