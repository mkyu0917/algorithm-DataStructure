package com.algorithm.programers;

import java.util.Arrays;

public class DivideArraysElementsAsc {

    private void useStream(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr)
                .filter(n -> n % divisor == 0)
                .sorted()
                .toArray();

        if (answer.length == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        System.out.println(Arrays.toString(answer));
    }

    private void onlyJava(int[] arr, int divisor) {
        int arrLeng = 0;
        int cnt =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                arrLeng++;
            }
        }

        int [] answer = new int [arrLeng];
        if(answer.length==0){
            answer = new int[]{-1};
        }

        for(int num : arr){
            if(num%divisor==0){
                answer[cnt]=num;
                cnt++;
            }
        }

        Arrays.sort(answer);


        System.out.println(Arrays.toString(answer));
    }

    public static void main(String[] args) {
        DivideArraysElementsAsc dae = new DivideArraysElementsAsc();
        int[] arr = new int[]{2 ,56 ,29 ,30, 40, 50};
        int divisor = 10;
        dae.useStream(arr,divisor);
        dae.onlyJava(arr,divisor);
    }
}
