package com.algorithm.beginner70;

public class BeginnerProblem60 {

    public static void main(String[] args) {
        System.out.println(solution(15));

    }
    /*
    *약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
    * 자연수 n이 매개변수로 주어질 때
    * n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
    * */
    public static int solution(int n){

        int answer =0;

        for(int i=1; i <=n ;i ++){
            int cnt =0;
            for(int j=1; j<=i; j++){

                System.out.println("i: " + i);
                System.out.println("j: " + j);
                if(i%j==0){
                   cnt++;
                    System.out.println("cnt: " + cnt);
                }


                if(cnt>=3&&j==j){
                    answer++;
                    System.out.println("answer: "+answer);
                    break;
                }
            }
        }

        return answer;


    }

}
