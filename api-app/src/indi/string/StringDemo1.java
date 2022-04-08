package indi.string;

public class StringDemo1 {
        public static void main(String[] args) {
                String name = "帝国";
                name += "昂扬";
                name += "不灭";
                System.out.println(name);

                String A1 = "ABC";
                String A2 = "ABC";
                System.out.println(A1==A2);
                //用""来创建的字符串对象，在堆内存常量池只存储一个

                char [] chars = {'a','b','c'};
                String b1 = new String(chars);
                String b2 = new String(chars);
                System.out.println(b1==b2);
                //用 new来创建的字符串对象，每new一次，堆内存中就会多一个新的对象，地址并不相等

        }
}
