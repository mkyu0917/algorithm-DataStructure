package com.algorithm.beginner70;

import java.util.Arrays;

public class BeginnerProblem69 {
/*
* 문자열 s가 매개변수로 주어집니다.
* s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
* 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
* */
    public static void main(String[] agrs){
        String s = "qqqqwwweeefdajjjthtffgxgt";
        //int numArr[] = {2,2,1};
        solution(s);
    }

    public static String solution(String s) {

        String answer = "";
        int count=0;

        String[] data =s.split("");
        String[] data2 = s.split("");
        Arrays.sort(data);

        for(int i=0; i<data.length; i++){
            count=0;
            for(int j=0; j<data2.length; j++){

                if(data[i].equals(data2[j])){
                    count++;
                }

            }
            if(count<2){
                answer+=data[i];
            }
        }

        System.out.println(answer);
        return answer;
    }

}