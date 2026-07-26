package com.algorithm.programers;

public class ColaProblem_132267 {

    //https://school.programmers.co.kr/learn/courses/30/lessons/132267#

    public int colaChange(int a, int b, int n){

        int answer = 0;
        int cola = n;

        while(cola>=a){

            n = cola/a * b + cola%a;
            answer +=cola/a * b;
            cola=n;

        }

        return answer;

    }

    public static void main(String[] args) {

        ColaProblem_132267 cola   = new ColaProblem_132267();
        System.out.println(cola.colaChange(2, 1, 20));

    }

}
