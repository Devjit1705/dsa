package dev.sort;

import java.util.Arrays;

/*
 * @Author Devjit Chakraborty
 * Heapsort on 0 based array
 * Time Complexity : O(N log N), here N is number of elements in array.
 * Auxiliary Space : O(1), since no extra space used.
 */
public class HeapSort {
    public static void main (String[] args) {
        int[] arr = {2, 9, 1, 6, 5, 5, 7, 8};
        int n = arr.length;
        //Build max heap
        buildMaxHeap(arr, n);
        for(int i = n-1; i >= 0; i--) {
            //swap the first element with ith element
            Swap.swap(arr, 0, i);
            heapify(arr, i, 0);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void buildMaxHeap(int[] arr, int n) {
        for(int i = n/2-1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }
    private static void heapify(int[] arr, int n, int i) {
        int left = 2*i+1;
        int right = 2*i+2;
        int max = i;
        if(left < n && arr[left] > arr[max]) {
            max = left;
        }
        if(right < n && arr[right] > arr[max]) {
            max = right;
        }
        if(max != i) {
            Swap.swap(arr, max, i);
            heapify(arr, n, max);
        }
    }
}
