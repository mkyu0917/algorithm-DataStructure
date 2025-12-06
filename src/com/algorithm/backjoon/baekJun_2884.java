package com.algorithm.backjoon;

import java.util.Scanner;

public class baekJun_2884 {

    public static void main(String[] args) {

        int h, m =0;

        Scanner sc = new Scanner(System.in);

        h=sc.nextInt();
        m=sc.nextInt();

        if(h==0 & m!=45){
            h=24;
        };

        int totalMinute = (h * 60) + h;
        h=(totalMinute - 45)/60;
        if(h==24){
            h=0;
        };

        m=(totalMinute-45)%60;

        System.out.println(h + " " + m);
    }

}
