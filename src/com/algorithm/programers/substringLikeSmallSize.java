package com.algorithm.programers;

public class substringLikeSmallSize {

    static int substrCnt(String t, String p) {

        int answer = 0;
        int startIdx=0;
        int endIdx=p.length();
        long longP= Long.valueOf(p);

        for(int i=p.length(); i<=t.length();i++){


            if(endIdx<=t.length()){
                long num=Long.valueOf(t.substring(startIdx,endIdx));
                System.out.println(num);
                if(num<=longP){
                    answer++;
                }
            }
            startIdx++;
            endIdx++;
        }

        return answer;
    }

    public static void main(String[] args) {

        String t="3141592";
        String p="271";
        System.out.println("substrCnt() = " + substrCnt(t,p));

    }


}
