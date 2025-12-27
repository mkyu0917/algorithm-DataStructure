package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class baekJun_2775 {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        int inputCnt = sc.nextInt();
        int[][] apt = new int[15][15];
        int peopleCnt = 0;

        for (int i = 1; i < 15; i++) {

            apt[0][i] = i; //0층의 모든호실에 사람수
            apt[i][1] = 1; //14층까지 모든층의 1호실

        }

        for (int i = 1; i < 15; i++) { //층수
            for (int j = 2; j < 15; j++) { //호수

                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];

            }
        }


        for (int j = 0; j < inputCnt; j++) {

            int floor = sc.nextInt();
            int room = sc.nextInt();

            peopleCnt = apt[floor][room];
            System.out.println(peopleCnt);
        }
    }
}