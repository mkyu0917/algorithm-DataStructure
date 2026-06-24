package com.algorithm.programers;

public class DivisorSum {

    int left=0;
    int right=0;

    public DivisorSum(int left, int right ) {
        this.left = left;
        this.right= right;
    }

    public void divisorSum(){

        int answer =0;

        for(int i=left; i<=right; i++){
            int cnt=0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    cnt++;
                }

            }
            if(cnt%2==0){
                answer+=i;
            }else{
                answer-=i;
            }
        }

        System.out.println(answer);
    }

    public void divisorSumVer2(){
        int answer =0;

        for (int i = left; i <= right; i++) {
            int cnt = 1;
            while (cnt * cnt <= i) {
                if (cnt * cnt == i) {
                    answer -= i;
                    break;
                }
                cnt++;
            }
            if (cnt * cnt != i) {
                answer += i;
            }
        }
        System.out.println("answer = " + answer);
    }


    public static void main(String[] args) {

        DivisorSum ds = new DivisorSum(13,17);
        ds.divisorSum();
        ds.divisorSumVer2();


    }

}
