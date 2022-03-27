package ShopCarExam;

import java.util.Scanner;

public class ShopCar {
    public static void main(String[] args) {
        //1.定义一个商品类Goods；
        //2.定义一个购物车对象，使用一个数组对象表示；
        Goods[] shopCar = new Goods[100];
        //3.创建客户操作架构；
        while (true) {
            System.out.println("请您输入命令进行购物车操作~~");
            System.out.println("添加商品至购物车中:      add");
            System.out.println("查询购物车中的商品信息:   query");
            System.out.println("修改商品购买信息:        update");
            System.out.println("结算商品金额:           pay");
            Scanner sc =new Scanner(System.in);
            String command = sc.next();
            switch (command){
                case "add":
                    addGoods(shopCar,sc);
                    break;
                case "query":
                    queryGoods(shopCar);
                    break;
                case "update":
                    updateGoods(shopCar,sc);
                    break;
                case "pay":
                    payGoods(shopCar);
                    break;
                default:
                    System.out.println("无此操作选项!请重新选择~~");
            }
        }
    }

    private static void payGoods(Goods[] shopCar) {
        queryGoods(shopCar);

        Goods g = new Goods();
        double money = 0;
        for (int i = 0; i < shopCar.length; i++) {
            g = shopCar[i];
            if(g!=null){
                money+=(g.buyNumber*g.price);
            }
            else {
                break;
            }
        }
        System.out.println("您的购物车商品需要支付:" + money);
    }

    private static void updateGoods(Goods[] shopCar,Scanner sc) {
       OUT:
        while (true) {
            for (int i = 0; i < shopCar.length; i++) {
                Goods g = shopCar[i];
                System.out.println("请输入要修改数量的商品的id:");
                if(g.id== sc.nextInt()){
                    System.out.println("请您输入修改后该买的数量");
                    g.buyNumber = sc.nextInt();
                    System.out.println("该商品的购买数量修改完成!");
                    break OUT;
                }
                else {
                    System.out.println("购物车没有该商品信息!");
                    break OUT;
                }
            }
        }
    }
    private static void queryGoods(Goods[] shopCar) {
        System.out.println("=============购物车商品信息==============");
        System.out.println("编号  名称    价格  购买数量");
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                System.out.println(g.id + "   " + g.name + "    " + g.price + "   " + g.buyNumber);
            }
            else {
            System.out.println("---    ---    ---    ---");
            System.out.println();
                break;
            }
        }
    }
    private static void addGoods(Goods[] shopCar,Scanner sc) {
        //1.添加商品的信息;
        System.out.println("请输入商品名:");
        String name = sc.next();
        System.out.println("请输入商品的编号:");
        int id = sc.nextInt();
        System.out.println("请输入此商品的购买数量:");
        int buyNumber = sc.nextInt();
        System.out.println("请输入商品的价格:");
        double price = sc.nextDouble();

        //2.把每个商品的信息封装到一个商品对象中;
        Goods g = new Goods();
        g.name = name;
        g.id =id;
        g.buyNumber = buyNumber;
        g.price = price;

        //3.用循坏把商品存入购物车对象中
        for (int i = 0; i < shopCar.length; i++) {
            if(shopCar[i]==null){
                shopCar[i] = g;
                break;
            }
        }
        System.out.println("商品添加成功!");
    }
}
