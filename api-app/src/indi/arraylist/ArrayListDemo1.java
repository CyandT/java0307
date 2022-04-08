package indi.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
     public static void main(String[] args) {
          ArrayList<String> list = new ArrayList<>();
          list.add("重返帝国");
          list.add("之");
          list.add("大败");
          list.add("yyt");
          list.add(1,"清幽");
          System.out.println(list);

          ArrayList<Integer> list1 = new ArrayList<>();
          list1.add(5);
          list1.add(20);
          list1.add(1,4);
          System.out.println(list1);
     }
}
