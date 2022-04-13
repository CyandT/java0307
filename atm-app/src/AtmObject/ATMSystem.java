package AtmObject;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("====================ATM系统====================");
            System.out.println("1.用户登陆");
            System.out.println("2.账户开户");

            System.out.println("请您选择1、2命令进行操作:");
            int command = sc.nextInt();

            switch (command) {
                case 1:
                    //用户登陆操作;
                    userLogin(accounts, sc);
                    break;
                case 2:
                    //账户开户操作;
                    getUserMessage(accounts, sc);
                    break;
                default:
                    System.out.println("没有该选项,请重新选择!!");
            }
        }
    }

    /**
     * 登陆功能
     * @param accounts 全部对象的集合
     * @param sc 扫描器
     */
    private static void userLogin(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("====================系统登陆操作===================");
        if(accounts.size()==0){
            System.out.println("对不起,系统中还没有创建账户!请先开户再登陆!");
            return;
        }
        while (true) {
            System.out.println("请输入您的卡号:");
            String idCard = sc.next();
            Account acc = compareIdCard(accounts, idCard);
            if (acc == null) {
                System.out.println("不存在该卡号");
            } else {
                while (true) {
                    System.out.println("请您输入您的密码:");
                    String passWord = sc.next();
                    if(acc.getPassWord().equals(passWord)){
                        System.out.println("恭喜您!"+acc.getName()+"女士/先生,您的密码正确!登陆成功!");
                        System.out.println("您的卡号是:" + acc.getIdCard());
                        userDoThing(sc,acc);
                        return;
                    }
                    else {
                        System.out.println("密码错误!请您重新输入密码!");
                    }
                }
            }
        }
    }

    /**
     * 进入用户操作界面
     * @param sc 扫描器
     * @param acc 当前账户对象
     */
    private static void userDoThing(Scanner sc,Account acc) {
        System.out.println("======================欢迎您进入**银行用户操作界面=====================");
        while (true) {
            System.out.println("1、查询");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、修改密码");
            System.out.println("6、退出");
            System.out.println("7、注销当前账户");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    searchUserMessage(acc);
                    break;
                case 2:
                    depositMoney(acc,sc);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    exitSystem();
                    return;
                case 7:

                    break;
                default:
                    System.out.println("没有该指令!请重新输入!");
            }
        }
    }

    /**
     * 用户存款功能
     * @param acc 当前账户对象
     * @param sc 扫描器
     */
    private static void depositMoney(Account acc, Scanner sc) {
    }

    /**
     * 用户退出
     */
    private static void exitSystem() {
        System.out.println("退出成功,期待您下次操作!");
    }

    /**
     * 用户查询信息界面
     * @param acc 当前账户对象
     */
    private static void searchUserMessage(Account acc) {
        System.out.println("==================欢迎您进入**银行用户详情界面=================");
        System.out.println("您的账户信息如下:");
        System.out.println("卡号:" + acc.getIdCard());
        System.out.println("姓名:" + acc.getName());
        System.out.println("余额:" + acc.getBalance());
        System.out.println("当次取现额度:" + acc.getXianE());
    }

    /**
     * 得到用户的开户资料
     * @param accounts 接受的账户集合
     * @param sc
     * @return
     */
    private static void getUserMessage(ArrayList<Account> accounts,Scanner sc) {
        System.out.println("==================系统开户操作===============");
        //1.定义一个对象，把属性封装到对象中，最后添加到集合里
         Account account = new Account();


        System.out.println("请输入您的用户名:");
        String name = sc.next();
        account.setName(name);

        while (true) {
            System.out.println("请设置您的密码:");
            String passWord = sc.next();
            System.out.println("请再次确认您的密码:");
            String okPassWord = sc.next();
            if(passWord.equals(okPassWord)){
                account.setPassWord(okPassWord);
                break;
            }
            else {
                System.out.println("两次输入的密码不一致,请再次输入!");
            }
        }

        System.out.println("请设置每次转账的限制额度");
        double xianE = sc.nextDouble();
        account.setXianE(xianE);

        //2.取得卡号
         String idCard = getIdCard(accounts);
         account.setIdCard(idCard);

         //3.把这个对象添加到集合中
        accounts.add(account);
        System.out.println("开户成功!"+name+"先生/女士\t您的卡号是:" + idCard);

    }

    private static String getIdCard(ArrayList<Account> accounts) {
        Random r = new Random();
        while (true) {
            String idCard = "";
            for (int i = 0; i < 8; i++) {
                idCard += r.nextInt(10);
            }

            Account acc = compareIdCard(accounts,idCard);
            if(acc == null){
                return idCard;
            }
        }
    }

    private static Account compareIdCard(ArrayList<Account> accounts, String idCard) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if(acc.getIdCard().equals(idCard)){
                return acc;
            }
        }
        return null;
    }

}
