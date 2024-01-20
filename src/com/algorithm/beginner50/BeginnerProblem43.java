package com.algorithm.beginner50;

public class BeginnerProblem43 {

    public static void main(String[] args) {

        System.out.println(solution(1000));
    }
    /*
        장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다.
        예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만,
        장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다.
        냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 return하도록 solution 함수를 완성해주세요.
     */
    public static int solution(int hp){

        int answer = 0;
        int reminder =0;
        //장군개미 5
        //병정개미 3
        //일반개미 1

        if(hp%5>=0){
            reminder= hp%5;
            answer+=hp/5;
        }else{
            return answer;
        }

        if(reminder%3>=0){
            answer+=reminder/3;
            if(reminder%3==0) {
                reminder =0;
            }else{
                reminder =reminder%3;
            }
        }

        if(reminder>0){
            answer+=reminder/1;
        }

        return answer;
    };
}
