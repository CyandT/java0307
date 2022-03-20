package com.itheima.parameter;

public class ReturnDemo {
    public static void main(String[] args) {
        fire();
        fire("日子国");
        fire("乌可兰",5000);
    }
    public static void fire(){
        System.out.println("发射一枚导弹到美国");
    }
    public static void fire(String location){
        System.out.println("发射一枚导弹到"+location+"~~~~");
    }
    public static void fire(String location,int number){
        System.out.println("发射"+number+"枚导弹到"+location+"~~~~");
    }
}
