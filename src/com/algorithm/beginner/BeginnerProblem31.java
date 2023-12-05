package com.algorithm.beginner;

public class BeginnerProblem31 {

    public static void main(String[] args) {
        String[] arr = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(solution(arr));
    }

    public static int solution(String[] babbling){
        int answer=0;
        int i=0;
        for(String word:babbling){

            for(i=i; i< babbling.length ; i++){
                String sumWord=babbling[0]+babbling[i];
                if(word == sumWord){
                    answer++;
                }
            }
            i++;

        }


        return answer;
    }
}
