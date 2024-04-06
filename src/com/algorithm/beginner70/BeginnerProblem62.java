package com.algorithm.beginner70;

import java.sql.Array;

public class BeginnerProblem62 {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8};

        int n = 2;

        solution(arr,2);



    }

    // num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가
    // 8이고 n이 2이므로 num_list를 2 * 4 배열로 다음과 같이 변경합니다.
    // 2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.

    public static int[][] solution(int[] num_list, int n) {

        //받은 배열의 길이를 n으로 나눈다.
        int height= num_list.length/n;
        //n개 사이즈의 배열을 생성
        int width = n;
        int cnt =0;
        int[][] innerArr = new int[height][width];


        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                innerArr[i][j]=num_list[cnt];
                System.out.print("배열"+i+j+"="+innerArr[i][j]);
                cnt++;

            }

        }



        return innerArr;
    }


}
