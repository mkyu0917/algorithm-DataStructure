package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class baekJun_1259 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNumber = Integer.parseInt(br.readLine());
        String[] inputStrArr = new String[inputNumber];

        for(int i=0; i<inputNumber; i++){
            String inputStr = br.readLine();
            inputStrArr[i]=inputStr;

        }

        Arrays.sort(inputStrArr, (s1, s2)->{
            if(s1.length() == s2.length()){
                return s1.compareTo(s2);
            }else{
                return s1.length()-s2.length();
            }

        });

        StringBuilder sb = new StringBuilder();

        if(inputStrArr[0]!=null){
            sb.append(inputStrArr[0]+"\n");
        }

        for(int j=1; j<inputStrArr.length;j++){

            if(!inputStrArr[j].equals(inputStrArr[j-1])){
                sb.append(inputStrArr[j]+"\n");
            }
        }
        System.out.print(sb);

    }
}
