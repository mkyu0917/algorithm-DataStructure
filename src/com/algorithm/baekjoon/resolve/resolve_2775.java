package com.algorithm.baekjoon.resolve;

import java.util.Scanner;

public class resolve_2775 {

    public static void main(String[] args) {
        //동적계획법 부녀회장이 될꺼야
        //아파트는 0층부터 14층까지 존재하고, 호수는 1호부터 14호까지 존재한다.
        //0층 i호수에 i명의 사람이 살고 있다.
        //각층에 호수에는 , 아래층에 현재 호수까지 더한 사람수만큼 살아야한다.
        //ex) 1층에 3호실이면 0층에 1,2,3호실의 사람수를 합한수만큼이 1층 3호실에 살아야한다.

        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        int[][] apartment = new int[15][15];

        //ㅇㅏ파트의 0 ~ 14층까지 1호실에는 1명만살수있음, 0층 1~14호실에는 호실 숫자만큼 사람이 살고있음
        for(int i=1; i<15; i++){

            apartment[i][1] =1;
            apartment[0][i] =i;

        }

        for(int i=1; i<15; i++){
            for(int j=2; j<15; j++){

                apartment[i][j]=apartment[i][j-1] + apartment[i-1][j];

            }
        }

        for(int i=0; i<inputNum; i++){
            int floor=sc.nextInt();
            int room = sc.nextInt();

            System.out.println(apartment[floor][room]);

        }

        sc.close();
    }


}
