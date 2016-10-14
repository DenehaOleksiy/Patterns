package Sorting;

/**
 * Created by Администратор on 14.10.2016.
 */
public class Inserts_Sort {
    public static void main(String[] args) {
        int [] arr = {8,15,2,4,8,99,6,3,2,5,1,24,7,18};
        insertSort(arr);

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }


public static int[] insertSort(int[] arr){

    for (int i = 1; i < arr.length ; i++) {
        int current = arr[i];
        int previous = i-1;

        while (previous >= 0 && arr[previous] > current){
            arr[previous + 1] = arr[previous];
            previous--;
        }
        arr[previous + 1] = current;
    }return arr;
}
}