package com.itheima.parameter;

public class ArrayParamDemo1 {
    public static void main(String[] args) {
           int [] arr = {11,22,33,44};
           printArray(arr);
    }

    public static void printArray(int [] arr){
        System.out.print("该数组内容为: [");
        if(arr != null && arr.length>0){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(i == arr.length-1?arr[i] : arr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
