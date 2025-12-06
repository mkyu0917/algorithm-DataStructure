package com.algorithm.backjoon;

import java.util.Scanner;

public class baekJun_2480 {

    public static void main(String[] args) {
        int A,B,C,total=0,mode = 0;
        int cnt=0;
        Scanner sc = new Scanner(System.in);

        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();

        int[] arr= new int[3];
        arr[0]=A;
        arr[1]=B;
        arr[2]=C;

        for(int i=0; i<arr.length; i++){
            cnt=0;
            for(int j=0; j<arr.length; j++){

                if(arr[i]==arr[j]){
                    cnt++;
                    mode=arr[i];
                }

            }
            if(cnt>1) {
                break;
            }

        }

        if(cnt==1){
            if(arr[0]>arr[1]){
                mode=arr[0];
                if(arr[0]>arr[2]){
                    mode=arr[0];
                }else{
                    mode=arr[2];
                }
            }else{
                mode=arr[1];
                if(arr[1]>arr[2]){
                    mode=arr[1];
                }else{
                    mode=arr[2];
                }
            }
            total=mode*100;
            System.out.println(total);
        }else if(cnt==2){
            total=1000+mode*100;
            System.out.println(total);
        }else if(cnt==3){
            total=10000+mode*1000;
            System.out.println(total);
        }
    }
}

