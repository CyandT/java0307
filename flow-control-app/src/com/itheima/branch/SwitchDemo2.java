package com.itheima.branch;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = sc.nextInt();
        switch (month){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("该月份天数是:31天"); //switch 的穿透性
                break;
            case 2 :
                System.out.println("该月闰年为28天，非闰年为29天");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("该月天数为30天");
                break;
            default:
                System.out.println("输入错误!");
        }
    }
}
