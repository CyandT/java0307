package com.itheima.branch;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你选择哪一天");
        String weekday = sc.next();
        switch(weekday){    //1.switch ---'s'要小写!
            case "周一" :    // 2. case 后为:
                System.out.println("埋头苦干，解决bug");
                break;      // 3.break不能忘了写!
            case "周二" :
                System.out.println("请求大牛程序员帮忙");
                break;
            case "周三" :
                System.out.println("今晚啤酒，龙虾，小烧烤");
                break;
            case "周四" :
                System.out.println("主动帮新来的女程序员解决bug");
                break;
            case "周五" :
                System.out.println("今晚吃鸡");
                break;
            case "周六" :
                System.out.println("与王婆介绍的小芳相亲");
                break;
            case "周日" :
                System.out.println("郁郁寡欢，准备上班");
                break;
            default    :
                System.out.println("输入天数错误!!!");
        }
    }
}
