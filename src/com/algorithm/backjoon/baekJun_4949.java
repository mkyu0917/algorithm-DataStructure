package com.algorithm.backjoon;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


public class baekJun_4949 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stk= new Stack<>();

        while(true) {

            String text=br.readLine();
            boolean isError = false;
            if(".".equals(text)){
                break;
            }

            for (int i = 0; i < text.length(); i++) {
                String chars = String.valueOf(text.charAt(i));
                if ("(".equals(chars)) {
                    stk.push(chars);
                }
                if (")".equals(chars)) {
                    if(stk.isEmpty()|| !"(".equals(stk.peek())){
                        isError=true;
                        break;
                    }else{
                        stk.pop();
                    }
                }

                if ("[".equals(chars)) {
                    stk.push(chars);
                }
                if ("]".equals(chars)) {
                    if(stk.isEmpty()||!"[".equals(stk.peek())){
                        isError=true;
                        break;
                    }else{
                        stk.pop();
                    }
                }

            }

            if (!isError && stk.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");

            }
            stk.clear();
        }
    }
}
