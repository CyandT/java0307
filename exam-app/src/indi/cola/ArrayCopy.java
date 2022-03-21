package indi.cola;

public class ArrayCopy {
    public static void main(String[] args) {
        int []arr={11,22,33,44};
        int []arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }

        System.out.print("[");
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(i!= arr1.length-1?arr1[i]+", ":arr1[i]);
        }
        System.out.println("]");
    }
}
