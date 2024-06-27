package dev.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main (String[] args) {
        int[] arr = {2, 9, 1, 6, 5, 5, 7, 8, 0};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] array) {
        sortHelper(array, 0, array.length-1);
    }

    private static void sortHelper(int[] array, int left, int right) {
        if(left<right) {
            int swapIn = pivot(array, left, right);
            sortHelper(array, left, swapIn - 1);
            sortHelper(array, swapIn + 1, right);
        }
    }

    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for(int i=pivotIndex+1; i<=endIndex; i++) {
            if(array[i] < array[pivotIndex]) {
                swapIndex++;
                Swap.swap(array, swapIndex, i);
            }
        }
        Swap.swap(array, pivotIndex, swapIndex);
        return swapIndex;
    }
}
