package com.algorithm.programers;

public class sumDigitNumber {

    public static int sumDigitNumberByString(int num){

        int answer =0;
        String strNum=String.valueOf(num);

        String[] splitNum=strNum.split("");

        for(int i=0; i<splitNum.length; i++){
            answer += Integer.valueOf(splitNum[i]);
        }

        return answer;
    }

    public static int sumDigitNumberByAscii(int num){

        int answer =0;
        String strNum=String.valueOf(num);
        for(char c : strNum.toCharArray()){
            answer += c - '0';
        };
        return answer;
    }

    public static int sumDigitNumberByDivide(int num){

        int answer =0;

        while(num>0){
            answer +=num%10; //123%10=3
            num = num/10; //123/10=12
        }
        return answer;
    }

    public static void main(String[] args) {
        int num = 123;
        System.out.println(sumDigitNumberByString(num));
        System.out.println(sumDigitNumberByDivide(num));
        System.out.println(sumDigitNumberByAscii(num));
    }

}
