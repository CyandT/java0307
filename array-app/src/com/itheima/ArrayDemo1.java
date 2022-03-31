package com.itheima;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //数组: 数据类型[] 数组名字
        int [] ages = {18, 36, 55};
        //             0    1   2
        System.out.println(ages[2]);
        System.out.println(ages.length);//元素的个数
        ages[2]=100;
        System.out.println(ages[2]);// 修改数组元素
        System.out.println(ages.length - 1);//数组最大索引 前提:元素个数>0
    }
}
