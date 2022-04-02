package indi;

public class StringDemo2 {
    public static void main(String[] args) {
        String s = new String();
        System.out.println(s);

        char [] chars = {'a','b','c','d'};
        String s1 = new String(chars);
        System.out.println(s1);

        byte [] bytes ={97,98,99,65,66,67};
        String s2 = new String(bytes);
        System.out.println(s2);
    }
}
