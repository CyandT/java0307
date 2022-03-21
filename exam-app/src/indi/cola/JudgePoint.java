package indi.cola;

import java.util.Scanner;

public class JudgePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] scores =new int[6];
        System.out.println("请输入评委的分数:");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }

        for (int i = 0; i < scores.length-1; i++) {
            for (int j = 0; j < scores.length-i-1; j++) {
                if(scores[j]>scores[j+1]) {
                    int temp = scores[j + 1];
                    scores[j + 1] = scores[j];
                    scores[j] = temp;
                }
            }
        }
        double sum = 0;
        for (int i = 1; i < scores.length-1; i++) {
             sum += scores[i];
        }
        sum = sum/(scores.length-2);
        System.out.println("最低分是:"+scores[0]);
        System.out.println("最高分是:"+scores[scores.length-1]);
        System.out.println("最后的平均分为:"+sum);
    }
}
