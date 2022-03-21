package indi.cola;

public class SuNum {
    public static void main(String[] args) {
        for (int i = 101; i <=200 ; i++) {


            boolean flag = true;
            for (int j = 2; j <i / 2 ; j++) {
                if(i % j == 0 ){ //能相除说明不是素数
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }
    }
}