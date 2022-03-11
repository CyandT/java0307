package com.itheima.random;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int data = r.nextInt(10);
        System.out.println(data);
        //如果想输出4~19,   4~19---> -4 --->0~15(16)   减加法;
        System.out.println("--------------------------");
        int num = r.nextInt(16) + 4;
        System.out.println(num);


        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入1开始抽签");
            int i = sc.nextInt();
            if(i==1){
                int n1 = r.nextInt(100) + 1;
                System.out.println(n1);
            }
        }
    }
}
