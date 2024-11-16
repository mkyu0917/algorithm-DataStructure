package com.algorithm.beginner100;

import java.math.BigInteger;

public class BeginnerProblem78 {

    /*문자열 계산하기
    *머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다.
    *  머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수
    *  share이 매개변수로 주어질 때,
    *  balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를
    * return 하는 solution 함수를 완성해주세요.
    * */

    /*제한사항
    1 ≤ balls ≤ 30
    1 ≤ share ≤ 30
    구슬을 고르는 순서는 고려하지 않습니다.
    share ≤ balls
     * */
    public static void main(String[] args) {

        int balls=5;
        int share=2;
        solution(balls,share);
    }

    public static long solution(int balls, int share) {
        int answer = 0;
        BigInteger temp = new BigInteger("1");

        temp=factorial(balls).divide(factorial(share).multiply(factorial(balls-share)));


        answer=temp.intValue();
        System.out.println(answer);
        return answer;
    }

    public static BigInteger factorial(int num) {

        BigInteger answer = new BigInteger("0");
        BigInteger temp1 = null;

        if(num==0) {
            return answer = new BigInteger("1");
        }

        for(int i=1; i<=num; i++) {
            temp1 = new BigInteger(String.valueOf(i));
            if(i==1) {
                answer=answer.add(temp1);
            }else {
                answer=answer.multiply(temp1);
            }

        }
        return answer;

    }
}
