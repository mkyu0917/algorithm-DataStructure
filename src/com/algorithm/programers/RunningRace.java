package com.algorithm.programers;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class RunningRace {

    public static void main(String[] args) {

        String[] players={"mumu", "soe", "poe", "kai", "mine"};
        String[] callings={"kai", "kai", "mine", "mine"};
        solution(players, callings);
    }



    static String[] solution(String[] players, String[] callings) {
        String[] answer = {};

        Map<String,Integer> playerMap = new HashMap<>();

        for(int i=0; i<players.length; i++){

            playerMap.put(players[i],i);

        }

        for(int i=0; i<callings.length; i++){
            if(playerMap.containsKey(callings[i])){
                int index=playerMap.get(callings[i]);

                if(index>0){

                    playerMap.put(players[index],index-1);
                    playerMap.put(players[index-1],index);

                    String temp=players[index];
                    players[index]=players[index-1];
                    players[index-1]=temp;


                }
            }
        }


        answer = players;
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
