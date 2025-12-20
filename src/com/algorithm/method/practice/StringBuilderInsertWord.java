package com.algorithm.method.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBuilderInsertWord {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word=br.readLine().toString();
        StringBuilder sb = new StringBuilder();

        sb.append(word);
        sb.insert(3,",");
        System.out.println(sb);

    }

}
