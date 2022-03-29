package javabean;
//javabean的标准写法
public class User {
    //1.用private私有化成员变量
    private String name;
    private double height;
    private double weight;

    //3.必须有无参数构造器(有参数构造器可有可无，都可以快捷生成)
    public User() {
    }

    public User(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    //2.为成员变量提供成套的setter和getter方法(可快捷生成)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
