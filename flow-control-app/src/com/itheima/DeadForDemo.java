package com.itheima;

import java.util.Scanner;

public class DeadForDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你的密码:");
            int password = sc.nextInt();
            if(password==520){
                System.out.println("欢迎进入系统");
                break;
            }
            else
                System.out.println("密码错误");
        }

    }
}


