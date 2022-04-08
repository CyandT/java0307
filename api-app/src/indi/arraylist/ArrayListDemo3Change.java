package indi.arraylist;

import java.util.ArrayList;

public class ArrayListDemo3Change {
    public static void main(String[] args) {
        ArrayList<Integer> oScores = new ArrayList<>();
        oScores.add(98);
        oScores.add(77);
        oScores.add(66);
        oScores.add(89);
        oScores.add(79);
        oScores.add(50);
        oScores.add(100);

        System.out.println("*班的成绩为:");
        System.out.println(oScores);
        //集合删除元素:从集合的后面开始删除,不会造成bug
        for (int i = oScores.size()-1; i >=0 ; i--) {
            int nScores = oScores.get(i);
            if(nScores<80){
                oScores.remove(i);
            }
        }
        System.out.println("高于80分的成绩是:");
        System.out.println(oScores);
    }
}
