package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekJun_30802 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalPeople = Integer.parseInt(br.readLine());
        int[] teeUser = new int[6];
        int[] packages = new int[2];

        //배열에 값 넣기
        for (int i = 0; i < 2; i++) {

            if (i == 0) {
                StringTokenizer tee = new StringTokenizer(br.readLine());
                for (int j = 0; j < 6; j++) {
                    teeUser[j] = Integer.parseInt(tee.nextToken());
                }
            } else if (i == 1) {
                StringTokenizer pac = new StringTokenizer(br.readLine());
                for (int j = 0; j < 2; j++) {
                    packages[j] = Integer.parseInt(pac.nextToken());
                }

            }
        }

        int totalTeePack=0;
        int totalPenPack=0;
        int remainPen=0;

        //티셔츠 최소의 묶음수 계산
        for(int i=0; i<teeUser.length; i++){

            if((teeUser[i]%packages[0])==0) {
                totalTeePack += teeUser[i] / packages[0];
            }else{
                totalTeePack += teeUser[i] / packages[0] +1;
            }

        }

        totalPenPack=totalPeople/packages[1];
        remainPen = totalPeople%packages[1];


        System.out.println(totalTeePack);
        System.out.println(totalPenPack+" "+remainPen);

    }
}
