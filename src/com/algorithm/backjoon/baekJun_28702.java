package com.algorithm.backjoon;

import java.io.IOException;
import java.util.Scanner;

public class baekJun_28702 {

    public static void main(String[] args) throws IOException {

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);
        String[] inputArr = new String[3];
        int tempIndex =0;
        int ans = 0;

        for(int i=0; i<3; i++){
            inputArr[i]=sc.nextLine();
        }

        for(int j=0; j<inputArr.length; j++){

            if(!"Fizz".equals(inputArr[j])||!"Buzz".equals(inputArr[j])||!"FizzBuzz".equals(inputArr[j])){
                tempIndex=j;
            }

            if(j==inputArr.length-1){

                if(tempIndex==0){
                    ans=Integer.parseInt(inputArr[tempIndex])+3;
                }else if(tempIndex==1){
                    ans=Integer.parseInt(inputArr[tempIndex])+2;
                }else{
                    ans=Integer.parseInt(inputArr[tempIndex])+1;
                }
            }
        }

        if(ans%3==0&ans%5==0){
            System.out.println("FizzBuzz");
        }
        if(ans%3==0&ans%5!=0){
            System.out.println("Fizz");
        }
        if(ans%3!=0&ans%5==0){
            System.out.println("Buzz");
        }
        if(ans%3!=0&ans%5!=0){
            System.out.println(ans);
        }
    }
}
