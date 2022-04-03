package indi;

import java.util.Scanner;

//需求:加密手机号码
public class StringExam3 {
    public static void main(String[] args) {
        //1.输入手机号码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号码:");
        String tel = sc.next();

        //2.使用api截取手机号码的前三位和后四位  173 8975 7961
        String before = tel.substring(0,3);
        String after = tel.substring(7);
        System.out.println(before + "****" + after);
    }
}
