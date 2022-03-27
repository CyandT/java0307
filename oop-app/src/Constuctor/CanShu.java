package Constuctor;

public class CanShu {
    public static void main(String[] args) {

        Car c = new Car();
        Car c1 = new Car("雷克萨斯",599.9);
        System.out.println(c1.name);
        System.out.println(c1.price);

        c1.goWith("奔驰");

    }
}
