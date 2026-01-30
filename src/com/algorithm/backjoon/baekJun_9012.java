package com.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekJun_9012 {
    public static void main(String[] args) throws IOException {


            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int inputCnt=Integer.parseInt(br.readLine());
            Stack<String> st = new Stack<>();
            int cnt=0;
            while(inputCnt>cnt){

                String pt=br.readLine();
                boolean isError = false;
                for(int i=0; i<pt.length(); i++){
                    if(pt.charAt(i)=='('){
                        st.push(String.valueOf(pt.charAt(i)));
                    }

                    if(!st.isEmpty() & pt.charAt(i)==')'){
                        if(st.peek().equals("(")){
                            st.pop();
                        }
                    }else if(st.isEmpty() & pt.charAt(i)==')'){
                        isError=true;
                    }
                }

                if(isError || !st.isEmpty()){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
                st.clear();
                cnt++;
            }
        }
}
