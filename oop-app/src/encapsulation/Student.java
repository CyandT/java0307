package encapsulation;

public class Student {
    private int age;
    //此变量:age私有，只能在本类中访问
    public void setAge(int age){
        if(age>=0 && age<=100){
            this.age = age;
        }
        else {
            System.out.println("您输入的数据有问题");
        }
    }
    public int getAge(){
        return age;
    }
}
