package com.algorithm.programers;

public class BusinessCardWallet {
    //https://school.programmers.co.kr/learn/courses/30/lessons/86491
    public static void main(String[] args) {

        int[][] sizes= {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
            //명함 지갑을 만듬, 명함크기는 w, h 1~1000사이
            //명함수는 1~ 10000

       /* for(int i=0; i<sizes.length; i++){

            int temp =0;

            if(sizes[i][0]>sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=temp;
            }

        }

        int maxW=sizes[0][0];
        int maxH=sizes[0][1];

       for(int i=1; i<sizes.length; i++){

            if(maxW<sizes[i][0]){
                maxW=sizes[i][0];
            }

            if(maxH<sizes[i][1]){
                maxH=sizes[i][1];
            }

        }*/

            for(int[] size : sizes){

                int small = Math.min(size[0],size[1]);
                int max = Math.max(size[0],size[1]);

                size[0]=small;
                size[1]=max;
            }

            int maxNumberAmongSmall = sizes[0][0];
            int maxNumberAmongMax = sizes[0][1];
            for(int i=1; i<sizes.length; i++){

                maxNumberAmongSmall = Math.max(maxNumberAmongSmall,sizes[i][0]);
                maxNumberAmongMax = Math.max(maxNumberAmongMax,sizes[i][1]);

            }

        System.out.println(maxNumberAmongMax * maxNumberAmongSmall);

        }
}
