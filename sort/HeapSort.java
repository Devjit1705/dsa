package dev.sort;

import java.util.Arrays;

public class HeapSort {
    public static void main (String[] args) {
        int[] arr = {2, 9, 1, 6, 5, 5, 7, 8};
        buildMaxHeap(arr);
        for(int i=arr.length-1; i>=0; i--) {
            Swap.swap(arr, 0, arr.length-1);
            heapify(arr, 0);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void buildMaxHeap(int[] array) {
        for(int i=array.length/2-1; i>=0; i--) {
            heapify(array, i);
        }
    }
    private static void heapify(int[] array, int i) {
        int left = 2*i+1;
        int right = 2*i+2;
        int max=i;
        if (left <= array.length-1 && array[left] > array[i]) {
            max = left;
        } else {
            max = i;
        }
        if(right <=array.length-1 && array[right] > array[max]) {
            max = right;
        }
        if(max != i) {
            Swap.swap(array, i, max);
            heapify(array, max);
        }
    }
}
