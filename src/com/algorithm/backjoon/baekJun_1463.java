package com.algorithm.backjoon;

import java.io.IOException;
import java.util.Scanner;

public class baekJun_1463 {
    public static void main(String[] args) throws IOException {
        //동적계획법으로 풀어보기

        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        int[] memo = new int[inputNum+1];
        int[] before = new int[inputNum+1];

        memo[0]=0; //0은 쓸일ㅇ이 없음
        memo[1]=0; //1은 계산과정이 없으니 계산횟수 0

        before[0]=1;
        for(int i=2; i<=inputNum; i++){

            memo[i]=memo[i-1]+1; // 1을 빼주는 연산(이전단계 값을 구함)
            before[i]=i-1; // -1했을 경우 현재노드에서 다음으로 이동할 노드가 들어감
            if(i%2==0){

                if(memo[i]<=memo[i/2]+1){
                    memo[i]=memo[i];
                    //2=1,4=2,6=2,7=3, 8=3, 10=3
                    //이전단계에 1을뺀 값과, 이전단계를 2로 나눈값의 연산횟수비교
                }else{
                    memo[i]=memo[i/2]+1;
                    //2=1,4=2,6=2, 7=3, 8=3
                }
                before[i]=i/2;

            }else if(i%3==0){
                if(memo[i]<=memo[i/3]+1){
                    memo[i]=memo[i];
                    //3=1,5=3, 6=2, 7=3, 9=2 10=3
                    //이전단계에 1을뺀 값과, 이전단계를 2로 나눈값의 연산횟수비교
                }else{
                    memo[i]=memo[i/3]+1;
                    //3=1,5=3,6=2, 7=3, 9=2, 10=3
                }

            }

        }
        int current = inputNum;

        while(true){
            System.out.print(current + " ");
            if (current == 1) break;
            current = before[current];
        }


    }
}