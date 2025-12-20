package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class baekJun_1259 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean loop=true;

        //12321
        while(loop){
            String number=br.readLine().toString();
            int cnt = 0;
            if("0".equals(number)){
                return;
            }
            int lastIndex=number.length()-1; //4

            for(int i=0; i<number.length();i++){

                if(number.charAt(i)!=number.charAt(lastIndex-i)){
                    System.out.println("no");
                    break;
                }else{
                    cnt++;
                }

            }
            if(cnt==number.length()){
                System.out.println("yes");
            }
        }
    }
}
