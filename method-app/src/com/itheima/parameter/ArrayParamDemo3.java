package com.itheima.parameter;

public class ArrayParamDemo3 {
    public static void main(String[] args) {
           int []arr1 = {10,20,30,140};
           int []arr2 = {10,20,30,40};
           boolean i = compare(arr1,arr2);
        System.out.println(i);
    }
    public static boolean compare(int [] arr1, int [] arr2){
        if(arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                  if(arr1[i]!=arr2[i]){
                      return false;
                  }
            }
            return true;
        }else
        return false;
    }
}
