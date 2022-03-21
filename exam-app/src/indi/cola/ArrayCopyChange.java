package indi.cola;

public class ArrayCopyChange {
    public static void main(String[] args) {
        int[]arr={11,22,33,44};
        int[]arr1 = new int[arr.length];

        arrCopy(arr,arr1);
        System.out.print("arr数组为:");
        print(arr);
        System.out.print("arr1数组为:");
        print(arr1);
    }
    public static void print(int []arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i != arr.length-1?arr[i]+", ":arr[i]);
        }
        System.out.println("]");
    }
    public static void arrCopy(int []arr,int[] arr1){
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
    }
}
