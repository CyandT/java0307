package com.itheima;

public class WhileDemo {
    public static void main(String[] args) {
        double peakHeight = 8848860;
        double paperThickness = 0.1;
        int i = 0;
        while (paperThickness < peakHeight){
            paperThickness*=2;
            i++;
        }
        System.out.println(i);
        System.out.println(paperThickness);
    }
}
