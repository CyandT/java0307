package indi.cola;

import java.util.Scanner;

public class PlaneTktChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入飞机票的原价:");
        double oldM = sc.nextDouble();
        System.out.println("请输入您选择的月份(1-12):");
        int month = sc.nextInt();
        System.out.println("请输入您选择的舱位:");
        String CanGWei = sc.next();

        double newTkt = caLuTkt(oldM,month,CanGWei);
        System.out.println("优惠后的飞机票价格是:"+newTkt);
    }
    public static double caLuTkt(double oldM,int month,String CanGWei){
        if(month>=5 && month<=10){
            switch (CanGWei){
                case "头等舱":
                    oldM*=0.9;
                    break;
                case "经济舱":
                    oldM*=0.85;
                    break;
                default:
                    System.out.println("您输入的舱位有误");
                    oldM = -1;
            }
    }
        else if(month==11 || month==12 || month>=1 && month<=4){
            switch (CanGWei){
                case "头等舱":
                    oldM*=0.7;
                    break;
                case "经济舱":
                    oldM*=0.65;
                    break;
                default:
                    System.out.println("您输入的舱位有误");
                    oldM = -1;
            }
        }
        else{
            System.out.println("您输入的月份有误!");
            oldM = -1;
        }
        return oldM;
    }
}
