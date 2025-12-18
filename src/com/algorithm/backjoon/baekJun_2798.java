package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekJun_2798 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 카드 개수랑, 카드의 합을 입력받음
        StringTokenizer inputCardNumber = new StringTokenizer(br.readLine());
        int cardSelectNum = Integer.parseInt(inputCardNumber.nextToken());
        int standardNum = Integer.parseInt(inputCardNumber.nextToken());

        int cardSum =0;
        int temp =0;
        int answer =0;

        String[] cardArr = br.readLine().split(" ");

        //5입력시 처음 카드를 뽑을때 index 0,1,2 까지만 접근 가능
        for(int i=0; i<cardArr.length-2;i++){

            //두번째 카드를 뽑을때 index 1 2 3 앞에 선택된 카드는 선택을 못하기때문에 +1;
            for(int j=i+1; j<cardArr.length-1;j++){

                //세번째 카드를 뽑을때 index 2 3 4앞에 선택된 2개 카드는 선택을 모하기 때문에 +2
                for(int k=j+1; k<cardArr.length;k++){

                    cardSum =Integer.parseInt(cardArr[i])+Integer.parseInt(cardArr[j])+Integer.parseInt(cardArr[k]);

                    if(cardSum<=standardNum){
                        if(answer<cardSum){
                            answer = cardSum;
                        }

                    }

                }


            }

        }

        System.out.print(answer);

    }

}
