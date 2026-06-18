package com.algorithm.programers;

public class FindMidWord {

    public String middleWord(String s){
        String answer = "";

        int idx = (s.length()-1)/2;

        if(s.length()%2==0){

            answer = s.substring(idx,idx+2);
        }else{
            answer = s.substring(idx,idx+1);
        }
        return answer;
    }

    public static void main(String[] args) {

        FindMidWord fmw = new FindMidWord();
        String word = "asdfq";
        System.out.println("fmw = " + fmw.middleWord(word));
    }

}
