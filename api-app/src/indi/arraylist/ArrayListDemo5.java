package indi.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        //1.定义一个学生类，定义集合来存储学生对象
        ArrayList<StudentDemo5> stuSys = new ArrayList<>();

        //2.将学生信息存储到集合中
        StudentDemo5 s1 = new StudentDemo5("20180302","叶孤城",23,"护理一班");
        StudentDemo5 s2 = new StudentDemo5("20180303","东方不败",23,"推拿二班");
        StudentDemo5 s3 = new StudentDemo5("20180304","西门吹雪",26,"中医学四班");
        StudentDemo5 s4 = new StudentDemo5("20180305","梅超风",26,"神经班2班");
        stuSys.add(s1);
        stuSys.add(s2);
        stuSys.add(s3);
        stuSys.add(s4);

        //3.遍历集合
        System.out.println("学号         姓名        年龄       班级");
        for (int i = 0; i < stuSys.size(); i++) {
            StudentDemo5 tot = stuSys.get(i);
            System.out.println(tot.getId()+"\t"+tot.getName()+"\t\t"+tot.getAge()+"\t\t"+tot.getClassN());
        }

        //5.使用死循环不断查找学生信息
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入您要查找的学号:");
            String studentNumber = sc.next();
            StudentDemo5 stu = searchN(stuSys,studentNumber);
            if(stu==null){
                System.out.println("没有该学生信息!");
            }
            else
                System.out.println("该学生信息是:");
            System.out.println("学号         姓名        年龄       班级");
            System.out.println(stu.getId()+"\t"+stu.getName()+"\t\t"+stu.getAge()+"\t\t"+stu.getClassN());
        }

    }

    //4.创建方法通过学号查找学生对象
    /**
     * 根据学生的学号返回学生对象
     * @param s  存储全部学生对象集合
     * @param studentNumber  搜索学生的学号
     * @return  学生对象/null
     */
    public static StudentDemo5 searchN(ArrayList<StudentDemo5> s,String studentNumber){
        for (int i = 0; i < s.size(); i++) {
            StudentDemo5 s1 = s.get(i);
            if(s1.getId().equals(studentNumber)){
                return s1;
            }
        }
        return null;
    }
}
