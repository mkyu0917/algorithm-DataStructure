package com.algorithm.backjoon;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class baekJun_2164 {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int card=sc.nextInt();

        Deque<Integer> q = new ArrayDeque<>();

        for(int i=1; i<=card; i++){
            q.addLast(i);
            //System.out.println(q.element().intValue());
        }

        for(int index=0; index<card; index++){

            if(q.size()>1){

                q.removeFirst();
                q.addLast(q.getFirst());
                q.removeFirst();
                System.out.println(Arrays.toString(q.stream().toArray()));

            }


        }
       System.out.print(q.getFirst());

    }
}
