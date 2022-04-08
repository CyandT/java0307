package indi.string;

import java.util.Scanner;

public class StringApiDemo1 {
    public static void main(String[] args) {
        //1.定义正确的用户名和密码
        String sysName = "huang7ing8ei";
        String sysCode = "123456";

        //2.用户自己输入密码
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入用户名:");
        String inputName = sc.next();
        System.out.println("请输入密码:");
        String inputCode = sc.next();

        //3.输入的用户名和正确的作比较! ----> equals
        if(sysName.equals(inputName) && sysCode.equals(inputCode)){
            System.out.println("欢迎你,登陆成功");
        }else{
            System.out.println("用户名或密码错误!");
        }

        //4.equals的另外用法:equalsI..用于不区别大小写字母验证码的输入比较
        String sysCode1 = "54CyTs";
        String sysCode2 = "54cYtS";
        boolean rs = sysCode1.equalsIgnoreCase(sysCode2);
        System.out.println(rs);
    }
}
