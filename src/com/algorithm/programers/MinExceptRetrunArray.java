package com.algorithm.programers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinExceptRetrunArray {

    static class ExceptArray {
        public int findMin(int[] arr) {

            int min = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            System.out.println(min);
            return min;
        };

        public int[] exceptMinValue(int min, int[] arr){

            if(arr.length==1) return new int[]{-1};

            int[] answer = new int[arr.length-1];
            int idx=0;
            for(int num : arr){
                if(min<num){
                    answer[idx]=num;
                    idx++;
                }
            }
            return answer;
        }

        public int[] useStreams(int[] arr){
            int min = Arrays.stream(arr).min().getAsInt();
            if(arr.length==1) return new int[]{-1};
            int[] answer=Arrays.stream(arr).filter(n-> min<n).toArray();
            return answer;
        };


    }

    public static void main(String[] args) {

        //int[] arr = new int[]{2,3,4,9,5,7,6,8,1};
        int[] arr = new int[]{9};
        ExceptArray exceptArray = new ExceptArray();
        int min=exceptArray.findMin(arr);
        int[] answer = exceptArray.exceptMinValue(min,arr);
        System.out.println(Arrays.toString(exceptArray.useStreams(arr)));

    }
}
