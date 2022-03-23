package indi.cola;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CodeLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您加密的密码的个数:");
        int n=sc.nextInt();
        int [] code = new int[n];

        System.out.println("请输入您要加密的密码:");

        for (int i = 0; i < code.length; i++) {
            code[i] = sc.nextInt();
        }
        codeBefore(code);
        codeChange(code,n);
    }
    public static void codeBefore(int []code){
        System.out.println("您加密前的密码是:");
        for (int i = 0; i < code.length; i++) {
            System.out.print(code[i]+" ");
        }
        System.out.println();
    }
    public static void codeChange(int[]code,int n){
        for (int i = 0; i < code.length; i++) {
            code[i]+=5;
            code[i]%=10;
        }
        if(n>=2) {
            for (int i = 0; i < code.length; i++) {
                for (int j = 0; j < code.length; j++) {
                    if(i<j){
                        int temp = code[i];
                        code[i] = code[j];
                        code[j] = temp;
                    }
                }
            }
        }
        System.out.println("加密后的密码为:");
        for(int i = 0; i < code.length; i++) {
            System.out.print(code[i]+" ");
        }
    }

}
