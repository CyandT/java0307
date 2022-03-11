package com.itheima.random;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int data = r.nextInt(100)+1;
        while(true){
            System.out.println("开始游戏");
            System.out.println("请输入数字");
            int number = sc.nextInt();
            if(number>data){
                System.out.println("猜测错误，数字过大");
            }
            else if(number<data){
                System.out.println("猜测错误，数字过小");
            }
            else if(number==data){
                System.out.println("恭喜你~~猜中了!");
                break;
            }
        }
    }
}
