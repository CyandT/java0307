package work;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1.创建一个数组来存储电影对象的信息
        Movie[] movies = new Movie[3];

        System.out.println("输入搜索国内最新电影，即可了解最新电影资讯!");
        Scanner sc = new Scanner(System.in);
        String select = sc.next();
        movies[0] = new Movie("长津湖","中国","剧情 / 历史 / 战争","陈凯歌 / 徐克 / 林超贤","吴京 / 易烊千玺 / 段奕宏 / 朱亚文 / 李晨");
        movies[1] = new Movie("我和我的父亲","中国","历史 / 战争","陈凯歌 / 徐克 / 林超贤","吴京 / 易烊千玺");
        if (select.equals("国内最新电影")) {
            for (int i = 0; i < movies.length; i++) {
                Movie m = movies[i];
                if(m!=null){
                System.out.println("电影名:"+m.getName());
                System.out.println("地区:"+m.getLocation());
                System.out.println("剧情:"+m.getType());
                System.out.println("导演:"+m.getDirector());
                System.out.println("演员:"+m.getPerformer());
                System.out.println("-----------------");
               }
                else
                    System.out.println("");
        }
    }
}}