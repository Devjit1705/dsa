package dev.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main (String[] args) {
        int[] arr = {2, 9, 1, 6, 5, 5, 7, 8};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int i=1; i< arr.length; i++) {
            int j=i-1;
            int temp=arr[i];
            while(j>-1 && arr[j]>temp) {
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
