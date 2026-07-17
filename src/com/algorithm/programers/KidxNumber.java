package com.algorithm.programers;

import java.util.Arrays;

public class KidxNumber {

    public void findKindex(int[] array, int[][] commands){
        int[] answer = new int[commands.length];

        int start = 0;
        int end = 0;
        int target = 0;
        int answerCnt = 0;

        for (int i = 0; i < commands.length; i++) {

            start = commands[i][0] - 1;
            end = commands[i][1] - 1;
            target = commands[i][2] - 1;
            int cnt = 0;

            int[] tempArr = new int[(end - start + 1)];

            System.out.println(tempArr.length);

            for (int j = start; j <= end; j++) {
                tempArr[cnt] = array[j];
                cnt++;
            }

            Arrays.sort(tempArr);

            for (int k = 0; k < tempArr.length; k++) {
                if (k == target) {
                    answer[answerCnt] = tempArr[k];
                    answerCnt++;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
    }

    public void reFactoringFindKindex(int[] array, int[][] commands){
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int target = commands[i][2] - 1;

            int[] temp = Arrays.copyOfRange(array, start, end);
            Arrays.sort(temp);

            answer[i] = temp[target];
        }
        System.out.println(Arrays.toString(answer));
    }


    public static void main(String[] args) {

        KidxNumber solution = new KidxNumber();
        int[] array =  {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        solution.findKindex(array, commands);
        solution.reFactoringFindKindex(array, commands);
    }
}
