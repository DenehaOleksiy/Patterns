package Sorting;

/**
 * Created by Администратор on 14.10.2016.
 */
public class Bubble_Sort {
    public static void main(String[] args) {
        int [] arr = {6,9,88,1,2,4,7,8,12,32,5,2};
        bubbleSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] bubbleSort(int[]arr){

        boolean bool = true;
        int count = 0;
        while (bool){
            bool = false;
            for (int i = 0; i < arr.length-1-count; i++) {
                if (arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    bool = true;
                }
            }count++;
        }return arr;
    }
}
