package com.algorithm.method.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBuilderReverseWord {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String word=br.readLine().toString();

        sb.append(word).reverse();
        System.out.println(sb);

    }
}
