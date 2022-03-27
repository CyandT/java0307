package Constuctor;

public class Car {
    String name;
    double price;

    //默认自带
    public Car(){
        System.out.println("无参数构造器已被调用!");
    }

    public Car(String name,double price){
        System.out.println("有参数构造器已被调用!");
        this.name = name;
        this.price = price;
    }

    public void goWith(String name){
        System.out.println(this.name+"正在和"+name+"比赛~~");
                //this:访问当前对象的成员变量
    }
}
