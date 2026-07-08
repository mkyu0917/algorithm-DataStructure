package com.algorithm.programers;

public class Base3 {
    public static void main(String[] args) {

        int n = 1000000000;
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while (n >= 1) {

            sb.append(n % 3);

            n = n / 3;

        }

        String[] a = sb.toString().split("");


        for (int i = 0; i < a.length; i++) {
            int cnt = 1;
            long exp = 1;
            while ((a.length - 1) - i >= cnt) {
                exp *= 3;
                cnt++;
            }

            answer += exp * Integer.valueOf(a[i]);
        }

        System.out.println(answer);
    }
}

