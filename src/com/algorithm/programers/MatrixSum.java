package com.algorithm.programers;

import java.util.Arrays;

public class MatrixSum {

    public static void main(String[] args) {
        //https://school.programmers.co.kr/learn/courses/30/lessons/12950#


        int[][] arr1 = new int[][]{{1,2},{2,3}};
        int[][] arr2 = new int[][]{{3,4},{5,6}};

        int[][] answer= new int[arr1.length][arr1[0].length];

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                answer[i][j]=arr1[i][j]+arr2[i][j];

            }


        }

        System.out.println( Arrays.deepToString(answer));
    }

}
