package dev.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main (String[] args) {
        int[] arr = {2, 9, 1, 6, 5, 5, 7, 8};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int minIndex = i;
            for(int j=i+1; j< arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                Swap.swap(arr, i, minIndex);
            }
        }
    }
}
