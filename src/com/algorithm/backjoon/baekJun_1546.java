package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekJun_1546 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputCnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        double[] scoreArr = new double[inputCnt];
        double max = 0;
        double sumScore = 0;

        for (int i = 0; i < inputCnt; i++) {

            double examScore = Double.parseDouble(st.nextToken());
            scoreArr[i] = examScore;
            if (examScore > max) {
                max = examScore;
            }
        }

        for (int j = 0; j < scoreArr.length; j++) {
            double score = scoreArr[j] / max;
            sumScore += score * 100;

        }

        System.out.println(sumScore / inputCnt);

    }

    /*ㄱㅐ선된 버전*/
    /*
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 과목 수 입력
        int inputCnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        double max = 0;
        double sum = 0;

        // 2. 입력과 동시에 최댓값과 총합 구하기 (배열 없이 처리)
        for (int i = 0; i < inputCnt; i++) {
            double score = Double.parseDouble(st.nextToken());
            sum += score;
            if (score > max) {
                max = score;
            }
     */
}