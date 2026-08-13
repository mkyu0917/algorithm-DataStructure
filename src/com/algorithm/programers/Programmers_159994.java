package com.algorithm.programers;

public class Programmers_159994 {

    //https://school.programmers.co.kr/learn/courses/30/lessons/159994

    public static String solution(String[] cards1, String[] cards2, String[] goal ){


        int i=0;
        int j=0;

        while(goal.length>i+j){

            if(cards1.length>i && goal[i+j].equals(cards1[i])){
                i++;
            }else if(cards2.length>j && goal[i+j].equals(cards2[j])){
                j++;
            }else{
                return "No";
            }

        }

        return "Yes";



    }


    public static void main(String[] args) {

        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        System.out.println(solution(cards1,cards2,goal));

    }
}
