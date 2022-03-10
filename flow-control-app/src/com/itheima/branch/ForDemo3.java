package com.itheima.branch;

public class ForDemo3 {
    public static void main(String[] args) {
        int count = 0;
        for (int flower = 100; flower <=999 ; flower++) {
            int n1=flower/100,n2=flower/10%10,n3=flower%10;
            if(n1*n1*n1+n2*n2*n2+n3*n3*n3==flower){
                System.out.print(flower+" ");
                count++;    //每输出一次，count+1;
            }
        }
        System.out.println(); //换行
        System.out.println("水仙花个数是:"+ count);
    }
}
