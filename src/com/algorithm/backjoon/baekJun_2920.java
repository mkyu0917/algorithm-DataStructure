package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekJun_2920 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int current  = Integer.parseInt(st.nextToken());
        int next = Integer.parseInt(st.nextToken());

        boolean isAscending = (current<next);

        for(int i=0; i<6; i++){

            current = next;
            next = Integer.parseInt(st.nextToken());

            if((current<next) != isAscending){
                System.out.println("mix");
                break;
            }

        }

        if(isAscending){
            System.out.print("ascending");
        }else{
            System.out.print("decending");
        }
    }
}
