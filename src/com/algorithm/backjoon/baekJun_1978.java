package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekJun_1978 {

    public static boolean isPrime(int num){

        if(num==1){
            return false;
        }

        int limit = num*num;
        for(int i=2; i*i <limit; i++){

            if(limit % i==0){
                return false;
            }

        }
        return true;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputCnt = Integer.parseInt(br.readLine());
        String[] pnStrArr = br.readLine().split(" ");
        int count =0;

        for(int i=0; i<inputCnt; i++){

            int primeNumber = Integer.parseInt(pnStrArr[i]); //입력받은 값을 가져옴


            if(isPrime(primeNumber)){
                count++;
            }


        }
        System.out.println(count);

    }
}
