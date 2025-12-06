package com.algorithm.backjoon;
import java.util.Scanner;

public class baekJun_2885 {

    public static void main(String[] args) {


        int a, b, c = 0;
        String strb = "";
        int timeToMinute = 0;
        int totalMinute = 0;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        timeToMinute = (a*60) + b +c ;

        int hour = timeToMinute/60;
        if(hour>=24){
            hour = hour%24;

        }

        int min = timeToMinute%60;

        System.out.println(hour + " " +min);
    }
}
