package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekJun_10828 {
    public static void main(String[] args) throws IOException {

        int[] stk = new int[10001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int number = Integer.parseInt(br.readLine());
        int size = stk.length;
        int ioCnt = 0;

        for (int i = 0; i < number; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();


            if ("push".equals(cmd)) {
                size -= 1;
                stk[size] = Integer.parseInt(st.nextToken());
                ioCnt++;
            } else if ("pop".equals(cmd)) {


                if (size < 10001) {
                    System.out.println(stk[size]);
                    size += 1;
                } else if (size >= 10001) {
                    System.out.println(-1);
                }

                if (ioCnt > 0) {
                    ioCnt--;
                }
            } else if ("size".equals(cmd)) {
                if (ioCnt > 0) {
                    System.out.println(ioCnt);
                } else {
                    System.out.println(ioCnt);
                }
            } else if ("empty".equals(cmd)) {
                if (ioCnt > 0) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
            } else if ("top".equals(cmd)) {
                if (size < 10001) {
                    System.out.println(stk[size]);
                } else if(size>=10001){
                    System.out.println(-1);
                }
            }
        }
    }
}
