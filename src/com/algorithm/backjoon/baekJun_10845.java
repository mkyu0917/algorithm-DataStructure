package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekJun_10845 {

    public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int inputNum = Integer.parseInt(br.readLine());
            StringTokenizer st = null;
            StringBuilder sb = new StringBuilder();
            int[] numArr = new int[10001];

            int front = 0;
            int rear = 0;

            for (int i = 0; i < inputNum; i++) {
                st = new StringTokenizer(br.readLine());
                String cmd = st.nextToken();

                if ("push".equals(cmd)) {
                    numArr[rear++] = Integer.parseInt(st.nextToken()); //1 2 3(rear) index 0 1 2(rear)
                } else if ("pop".equals(cmd)) {
                    if (front == rear) {
                        sb.append("-1" + "\n");
                    }else if(front!=rear){
                        sb.append(String.valueOf(numArr[front])+"\n");
                        front++;
                    }

                } else if ("size".equals(cmd)) {
                    sb.append(String.valueOf(rear-front) + "\n");
                } else if ("empty".equals(cmd)) {
                    if (front == rear) {
                        sb.append("1" + "\n");
                    } else {
                        sb.append("0" + "\n");
                    }
                } else if ("front".equals(cmd)) {
                    if (front == rear) {
                        sb.append("-1" + "\n");
                    }else if(front!=rear) {
                        sb.append(String.valueOf(numArr[front]) + "\n");
                    }
                } else if ("back".equals(cmd)) {
                    if (front == rear) {
                        sb.append("-1" + "\n");
                    }else if(front!=rear) {
                        sb.append(String.valueOf(numArr[rear-1]) + "\n");
                    }
                }


            }

            System.out.println(sb);

        }
    }

