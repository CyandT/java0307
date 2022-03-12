package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class ArrayDemoPerson {
    public static void main(String[] args) {
        int [] cards = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入5名员工的工号");

        for (int i = 0; i < cards.length; i++) {
            cards[i] = sc.nextInt();
        }

        Random r = new Random();
        for (int i = 0; i < cards.length; i++) {
            int index = r.nextInt(cards.length); //定义随机一个索引
            //交换 *
            int temp = cards[index];  //将第二个数据存放到第三个
            cards[index] = cards[i];  //将第一个数据存放到第二个
            cards[i] = temp;          //把第三个数据放到第一个 ---->完成交换
        }

        for (int i = 0; i < cards.length; i++) {
            System.out.print(cards[i] + " ");
        }
    }
}
