package com.itheima;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的心跳:");
        int heartbeat = sc.nextInt();
        if(heartbeat>60 & heartbeat<80)
            System.out.println("你的心跳是正常的");
        else
            System.out.println("你应该进一步检查");
    }
}
