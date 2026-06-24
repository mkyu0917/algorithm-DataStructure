package com.algorithm.programers;

public class InsufficientMoney {

    //https://school.programmers.co.kr/learn/courses/30/lessons/82612

    int price =0;
    int money =0;
    int count =0;

    public InsufficientMoney(int price, int money, int count) {
        this.price = price;
        this.money = money;
        this.count = count;
    }

    public void calculateMoney(){


        long totalprice=0;

        for(int i=1; i<=count; i++){
            totalprice += price*i;
        }

        System.out.println(totalprice - money > 0 ? totalprice - money : 0);
    }

    public static void main(String[] args) {
        InsufficientMoney is = new InsufficientMoney(3, 20, 4);
        is.calculateMoney();;
    }
}
