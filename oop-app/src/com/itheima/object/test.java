package com.itheima.object;

public class test {
    public static void main(String[] args) {
          Car c = new Car();
          c.name = "宝马";
          c.price = 5000000;

        System.out.println(c.name);
        System.out.println(c.price);

        c.start();
        c.run();
    }
}
