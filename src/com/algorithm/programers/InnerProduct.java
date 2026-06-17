            package com.algorithm.programers;

            import java.util.stream.IntStream;



            public class InnerProduct {

              static  class innerProduct{

                    public int num(int[] a, int[] b){

                        int answer = IntStream.range(0, a.length)
                                .map(idx -> a[idx] * b[idx])
                                .sum();


                        return answer;
                    }

                }


                public static void main(String[] args) {

                    int[] num1 = new int[]{1,2,3,4};
                    int[] num2 = new int[]{-3,-1,0,2};
                    innerProduct innerProduct = new innerProduct();
                    innerProduct.num(num1, num2);
                    System.out.println("InnerProduct.num: " + innerProduct.num(num1, num2));

                }

            }
