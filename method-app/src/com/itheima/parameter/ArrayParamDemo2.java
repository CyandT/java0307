package com.itheima.parameter;

public class ArrayParamDemo2 {
    public static void main(String[] args) {
        int [] arr = {11,22,33,44,55};
        int index = getArrayData(arr,22);
        System.out.println(index);
    }
    public static int getArrayData(int [] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
