package indi;

import java.util.Random;

public class StringExam1 {
    public static void main(String[] args) {
        //1.定义一个字符串中包含验证码所需的字符
        String codeBesides = "abcdefghijklnmopqrstuvwxyzABCDEFGHIJKLNMOPQRSTUVWXYZ0123456789";

        //2.循环五次，每次随机出一个索引，再把索引所指的对象提取出来
        Random r = new Random();
        String code = "";
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(codeBesides.length());
            char c = codeBesides.charAt(index);
            code += c;
        }
        System.out.println(code);
    }
}
