package com.stream;

import java.util.function.*;

public class Lambda1 {

    @FunctionalInterface
    public interface MyFunction {
        int calculate(int a, int b);
    }





    public static void main(String[] args) {

        //판별자 -> boolean 타입으로 판별함
        Predicate<Integer> answer = a -> a%2==0;
        BiPredicate<String,String> answer2 = String::equals;
        Predicate<String> answer3 = a -> a.equals("test");
        System.out.println("answer.test(9) = " + answer.test(9));
        System.out.println("answer2 = " + answer2.test("test1","test2"));
        System.out.println("answer3.test(\"test1\") = " + answer3.test("test1"));
        //소비자 -> 출력, 저장등 부수효과만 사용함
        Consumer<String> printer = s-> System.out.println(s);
        printer.accept("consumer야 입력만 있어, 반환값은 없지");

        //공급자 -> 인자를 받지않고, 소비만 하고 끝냄
        Supplier<String> stringSupplier = () -> "value";
        System.out.println("stringSupplier.get() = " + stringSupplier.get());

        //binary 입력 두개 필요할때 , 두개 받고서 끝내기
        BiFunction<String,String,String> binary= (str1, str2) -> str1+str2;
        System.out.println(binary.apply("공부","하자"));


    }
}
