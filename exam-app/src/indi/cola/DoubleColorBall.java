package indi.cola;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class DoubleColorBall {
    public static void main(String[] args) {
           int [] luckNumber = getNumber();
           int [] userNumber = inputNumber();
           compare(luckNumber,userNumber);
    }
    public static void compare(int[] arr1, int[] arr2){
        int redHitNumbers = 0;
        int blueHitNumbers = 0;

        for (int i = 0; i < arr2.length-1; i++) {
            for (int j = 0; j < arr1.length-1; j++) {
                if(arr2[i] == arr1[i]){
                    redHitNumbers ++;
                    break;
                }
            }
        }
        System.out.println("本期中奖号码为:");
        print(arr1);
        System.out.println("您的号码是:");
        print(arr2);
        System.out.println("您命中的红球数量是:" + redHitNumbers);
        System.out.println("您是否命中篮球" + (blueHitNumbers == 1 ? "是" : "否"));


        blueHitNumbers = arr1[6] == arr2[6] ? 1 : 0;
        if(blueHitNumbers == 1 && redHitNumbers < 3){
            System.out.println("恭喜您，中了5元小奖!");
        }
        else if(blueHitNumbers == 1 && redHitNumbers ==3
        || blueHitNumbers == 0 && redHitNumbers == 4){
            System.out.println("恭喜您，中了10元小奖!");
        }
        else if(blueHitNumbers == 1 && redHitNumbers ==4
                || blueHitNumbers == 0 && redHitNumbers == 5){
            System.out.println("恭喜您，中了200元!");
        }
        else if(blueHitNumbers == 1 && redHitNumbers ==5){
            System.out.println("恭喜您，中了3000元!");
        }
        else if(blueHitNumbers == 0 && redHitNumbers ==6){
            System.out.println("恭喜您，中了500万元!");
        }
        else if(blueHitNumbers == 1 && redHitNumbers ==6){
            System.out.println("恭喜您，中了1000万元头奖!");
        }
        else {
            System.out.println("感谢您为彩票事业做出的贡献!!");
        }
    }
    public static void print(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static int[] inputNumber(){
        Scanner sc = new Scanner(System.in);
        int [] number = new int[7];

        for (int i = 0; i < number.length-1; i++) {
            System.out.println("请输入您的第" + (i + 1) + "个红球号码");
            number[i] = sc.nextInt();
        }
        System.out.println("请输入蓝球号码:");
        number[number.length-1] = sc.nextInt();
        return number;
    }

    public static int[] getNumber(){
        Random r = new Random();
        int [] number = new int[7];
        for (int i = 0; i < number.length-1; i++) {
            while (true){
                int data = r.nextInt(33)+1;

                boolean flag =true;//表示数据没有重复
                for (int j = 0; j < i; j++) {
                    if(number[j] == data){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    number[i] = data;
                    break;
                }
            }
        }
        number[number.length-1] = r.nextInt(16)+1;
        return number;
    }
}
