package com.algorithm.programers;

public class GcdAndLcm {

    //https://school.programmers.co.kr/learn/courses/30/lessons/12940

        public static int gcd(int n, int m){


            int gcdNum=n;

            while(m%n!=0){

                int remainder=m%n;
                m=n;
                n=remainder;
                gcdNum = remainder;

            }

            return gcdNum;
        }

        public static int lcm(int n, int m, int gcdNum){

            long multiply = (long) m * n;

            int lcmNum=(int)(multiply/gcdNum);

            return lcmNum;
        }

    public static void main(String[] args) {
        int m = 12;
        int n = 3;

        int gcdNum=gcd(n,m);
        int lcmNum=lcm(n,m,gcdNum);

        System.out.println(lcmNum);

    }
}
