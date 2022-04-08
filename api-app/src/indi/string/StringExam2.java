package indi.string;

import java.util.Scanner;

//需求:输入密码，只有三次机会
public class StringExam2 {
    public static void main(String[] args) {
        //1.定义一个正确的用户名和密码
        String okLoginName = "Huang7ing8ei";
        String okPassword = "123456";

        //2.循环三次，判断输入的密码是否正确
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入您的用户名:");
            String loginName = sc.next();
            System.out.println("请输入您的密码:");
            String loginPassword = sc.next();

            if (okLoginName.equals(loginName)) {
                if(okPassword.equals(loginPassword)){
                    System.out.println("登录成功!");
                    break;
                }
                else {
                    System.out.println("您的密码输入错误!请重新输入!你还有" + (3 - i) + "次机会");
                    System.out.println();
                }
            }
            else {
                System.out.println("您的用户名输入错误!请重新输入!你还有" + (3 - i) + "次机会");
            }
        }
    }
}
