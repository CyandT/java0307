package javabean;

public class Test {
    public static void main(String[] args) {
        //1.无参数构造器
        User u = new User();
        u.setName("十弦次郎");
        u.setHeight(172.0);
        u.setWeight(120.0);
        System.out.println(u.getName());
        System.out.println(u.getHeight());
        System.out.println(u.getWeight());
        //2.有参数构造器
        User u1 = new User("九弦柱",183,130);
        System.out.println(u1.getName());
        System.out.println(u1.getHeight());
        System.out.println(u1.getWeight());
    }
}
