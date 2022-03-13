package com.itheima;

import java.util.Random;
import java.util.Scanner;
                                      //猜数字游戏
public class ArrayDemoNumGuess {
    public static void main(String[] args) {
        Random r =new Random();
        int [] num =new int[5];   //创建数组来存放5个数

        for (int i = 0; i < num.length; i++) {
            num[i]= r.nextInt(20)+1;
        }
        // 从20个数中随机抽出5个放到数组里，一次抽一个
        Scanner sc = new Scanner(System.in);
        OUT:
        while (true){
            System.out.println("请输入您猜测的数据~~");
            int guessNum = sc.nextInt();

            for (int i = 0; i < num.length; i++) {
                if(guessNum == num[i]){
                    System.out.println("运气不错，猜中了~~");
                    System.out.println("该数字的索引位置是:"+i);
                    break OUT;  // 输入的数依次跟数组中存放的数比较，猜中则跳出循环
                }
            }
            System.out.println("您的猜测是错误的，请重新猜测!");
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" "); //最后输出抽到的5个数
        }
    }
}

