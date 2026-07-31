package com.algorithm.programers;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HallOfFame_138477 {


        //https://school.programmers.co.kr/learn/courses/30/lessons/138477;

        public int[] solution1(int k, int[] score) {
            int[] answer = new int[score.length];
            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for(int i=0; i<score.length; i++){

                if(pq.size() < k){
                    pq.offer(score[i]);
                }else if(pq.size()>=k && pq.peek()<score[i]){
                    pq.poll();
                    pq.offer(score[i]);
                }

                answer[i]=pq.peek();
            }



            return answer;
        }

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] hall = new int[k];
        int count =0;

        for(int i=0; i<score.length; i++){

            if(count<k){
                hall[count]=score[i];
                count++;
            }else{
                int minValue=hall[0];
                int minIndex=0;

                for(int j=0; j<hall.length; j++){

                    if(minValue>hall[j]){
                        minIndex=j;
                        minValue=hall[j];
                    }

                }
                if(score[i]>minValue){
                    hall[minIndex]=score[i];
                }
            }

            int minValue=hall[0];
            for(int j=0; j<count; j++){

                if(minValue>hall[j]){
                    minValue=hall[j];

                }
                answer[i]=minValue;
            }


        }

        return answer;
    }


    public static void main(String[] args) {
    
        HallOfFame_138477 hof = new HallOfFame_138477();
        int k=3;
        int[] score = new int[] {10, 100, 20, 150, 1, 100, 200};

        System.out.println("HallOfFame.solution"+ Arrays.toString(hof.solution(k,score)));
        System.out.println("HallOfFame.solution1"+ Arrays.toString(hof.solution1(k,score)));




    }
}
