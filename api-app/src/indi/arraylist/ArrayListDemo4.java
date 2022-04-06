package indi.arraylist;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<MovieDemo4> movieDemo4s = new ArrayList<>();
        MovieDemo4 m1 = new MovieDemo4("肖申克的救赎",9.7,"罗宾斯");
        MovieDemo4 m2= new MovieDemo4("霸王别姬",9.7,"张国荣、张丰毅");
        MovieDemo4 m3 = new MovieDemo4("阿甘正传",9.5,"汤姆汉克斯");

        movieDemo4s.add(m1);
        movieDemo4s.add(m2);
        movieDemo4s.add(m3);

        for (int i = 0; i < movieDemo4s.size(); i++) {
            MovieDemo4 type = movieDemo4s.get(i);
            System.out.println("电影名称:"+type.getName());
            System.out.println("电影评分:"+type.getScores());
            System.out.println("电影演员:"+type.getActor());
            System.out.println("--------------------");
        }
   }
}
