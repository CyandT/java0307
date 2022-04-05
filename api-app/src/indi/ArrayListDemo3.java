package indi;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);

        System.out.println("*班的成绩为:");
        System.out.println(scores);
        System.out.println("高于80分的成绩为:");
        //String changeScores = "";
        ArrayList<Integer> changeScores = new ArrayList<>();
        for (int i = 0; i < scores.size(); i++) {
            if(scores.get(i)>80){
               int s = scores.remove(i);
               changeScores.add(s);
            }
        }
        System.out.println(changeScores);
    }
}
