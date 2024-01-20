package com.algorithm.beginner50;


public class BeginnerProblem40 {

    public static void main(String[] args) {

        int[]arr = solution(10);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    /*
    정수 n이 매개변수로 주어질 때,
     n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록
      solution 함수를 완성해주세요.
    * */
    public static int[] solution(int n) {
        int len =1;
        if(n%2==0&&n!=1){
            len = n/2;

        }else if(n%2==1&&n!=1){
            len = ((n-1)/2)+1;
        }

        System.out.println(len);
        int[] answer = new int[len];

        int cnt = 0;
        for(int i=1; i<=n; i++){
            if(i%2==1) {
                answer[cnt]=i;
                cnt++;
            }

        }
            return answer;
    }
}
