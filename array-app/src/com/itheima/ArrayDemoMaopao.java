package com.itheima;

import java.util.Scanner;

public class ArrayDemoMaopao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr =new int[10];
        System.out.println("请输入将要排序的数据");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("排列的结果是:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
