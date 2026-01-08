package com.algorithm.backjoon;

import java.util.Arrays;
import java.util.Comparator;

public class baekJun_1181 {

    public static void main(String[] args) {


        int[] arr = {2,3, 6,1,9};

        int[] sortedArr = Arrays.stream(arr).boxed().sorted((a,b)->b - a).mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(sortedArr));


    }


}
