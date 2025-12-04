package com.algorithm.backjoon;

import java.io.*;

public class baekJun_31043 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numArr = new String[3];
        int intNumSum=0;
        String strNumSum="";
        int strNumSumToInt=0;

        for(int i=0; i<3; i++){

            numArr[i]=br.readLine();

        }

        for(int j=0; j<numArr.length; j++){

            if(j<2){
                intNumSum+=Integer.parseInt(numArr[j]);
                strNumSum+=numArr[j];
            }
            if(j==2){
                int minusNum = Integer.parseInt(numArr[j]);
                strNumSumToInt=Integer.parseInt(strNumSum)-minusNum;
                intNumSum=intNumSum-minusNum;
            }

        }
        System.out.println(intNumSum);
        System.out.println(strNumSumToInt);

    }
}
