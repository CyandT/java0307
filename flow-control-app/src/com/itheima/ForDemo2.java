package com.itheima;

public class ForDemo2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 10 ; i+=2) {
            sum += i;
        }
        System.out.println("1~10的奇数和是:"+sum);//1 3 5 7 9



        int sum1 = 0;
        for (int j = 1; j < 10; j++) {
            if(j % 2 == 1)
            {
                sum1 += j;
            }
        }
        System.out.println("1~10的奇数和是:"+sum1);
        int count = 0;
        for (int k = 1; k < 10; k++) {
            if(k%2==1){
                System.out.print(k+"\t");
                count++;
            }
        }
        System.out.println();
        System.out.println("1~10的个数是:" + count);
    }
}
