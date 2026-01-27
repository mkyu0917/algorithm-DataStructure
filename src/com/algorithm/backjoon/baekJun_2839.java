package com.algorithm.backjoon;

import java.util.Scanner;

public class baekJun_2839 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int sugar =sc.nextInt();
        int answer=0;
        while(true){

            if(sugar % 5 !=0){
                sugar=sugar-3;
                answer++;
                if(sugar==0){
                    break;
                }
                if(sugar<0){
                    answer=-1;
                    break;
                }
            }else{
                answer+=sugar/5;
                break;
            }




        }
        System.out.print(answer);
    }
}
