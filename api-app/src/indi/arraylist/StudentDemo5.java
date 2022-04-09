package indi.arraylist;

public class StudentDemo5 {
       private String id;
       private String name;
       private int age;
       private String classN;

    public StudentDemo5() {
    }

    public StudentDemo5(String id, String name, int age, String classN) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classN = classN;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassN() {
        return classN;
    }

    public void setClassN(String classN) {
        this.classN = classN;
    }
}
