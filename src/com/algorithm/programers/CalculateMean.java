package com.algorithm.programers;

public class CalculateMean {

        public void sumNumber(int arr[]){
            double answer = 0;

            for(double num : arr){
                answer +=num;
            }

            System.out.println(answer/arr.length);
        }

    public static void main(String[] args) {

        CalculateMean calculateMean = new CalculateMean();
        int[] num = {1,2,3,4,6,7,9,10};
        calculateMean.sumNumber(num);

    }

}
