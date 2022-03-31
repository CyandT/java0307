package com.itheima;

public class ArrayDemoSum {
    public static void main(String[] args){
        int [] sell = {16, 26, 36, 6, 100};
        int sum =0;
        for (int i = 0; i < sell.length; i++) {

            sum+=sell[i];
        }
        System.out.println(sum);
    }
}
