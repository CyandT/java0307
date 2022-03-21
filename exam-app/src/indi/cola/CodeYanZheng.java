package indi.cola;

import java.util.Random;
//  思路:先大循环共有几位，然后将三种条件（大写，小写，数字)分为0,1,2开始随机数选择。随机到哪一个就开始对应的条件再随机选择，然后累加到字符串中。重复n位。
public class CodeYanZheng {
    public static void main(String[] args) {
        String code =codeYZ(5);
        System.out.println("随机的验证码是:"+code);
    }
    public static String codeYZ(int n){
        String code = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
             // 0 1 2 3 4
            int type = r.nextInt(3); //大写、小写、数字(0、1、2)
            switch (type){
                case 0:
                    char ch = (char) (r.nextInt(26)+65); //A 65+25-- Z
                    code+=ch;
                    break;
                case 1:
                    char ch1 = (char) (r.nextInt(26)+97);
                    code+=ch1;
                    break;
                case 2:
                    int nBer= r.nextInt(10);
                    code+=nBer;
                    break;
                default:
                    System.out.println("无此类型");
            }
        }
        return code;
    }
}
