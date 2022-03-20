package indi.cola;

import java.util.Scanner;

public class PlaneTkt {
    public static void main(String[] args) {
        planeMoney();
    }
    public static void planeMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价，仓位，还有月份，随后计算优惠价格:");
        double oldM = sc.nextDouble();
        String CanGWei = sc.next();
        int month = sc.nextInt();
        double fina = 0;
        if(month>=5 && month<=10){
            switch (CanGWei){
                case "头等舱":
                    fina = oldM*0.9;
                    System.out.println(fina);
                    break;
                case "经济舱":
                    fina = oldM*0.85;
                    System.out.println(fina);
                    break;
                default:
                    System.out.println("舱位信息输入错误~");
            }
        }
        else if(month >=11 && month<=12 || month>=1 && month<=4){
            switch (CanGWei){
                case "头等舱":
                    fina = oldM*0.7;
                    System.out.println(fina);
                    break;
                case "经济舱":
                    fina = oldM*0.65;
                    System.out.println(fina);
                    break;
                default:
                    System.out.println("舱位信息输入错误~");
            }
        }
    }
}
