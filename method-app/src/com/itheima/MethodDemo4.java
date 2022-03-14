package com.itheima;

public class MethodDemo4 {
    public static void main(String[] args) {
            int [] ages={25,6,89,54,63,44};
            int max = getArrayMaxData(ages);
        System.out.println("年龄的最大值是:"+max);
    }

    public static int getArrayMaxData(int[] arr ) {
        int max =arr[0];
        for (int i = 0; i < arr.length; i++) {
              if(arr[i]>max){
                  max = arr[i];
              }
        }
        return max;
    }
}
