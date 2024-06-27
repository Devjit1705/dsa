package dev.sort;

import java.util.Arrays;

import static dev.sort.Swap.swap;

public class BubbleSort {

    public static void main (String[] args) {
        int[] arr = {2, 9, 1, 6, 5, 5, 7, 8};
        //bubbleSort(arr);
        //bubbleSortSecond(arr);
        bubbleSortWithON(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Normal way to do Bubble Sort where time complexity is O(n^2)
    // But Space complexity is O(1)
    // First loop will start from the one less from length of the array till 1
    private static void bubbleSort(int[] array) {
        for(int i=array.length-1; i>0; i--) {
           for(int j=0; j<i; j++) {
               if(array[j] > array[j+1]) {
                   swap(array, j+1, j);
               }
           }
        }
    }



    // Normal way to do Bubble Sort where time complexity is O(n^2)
    // But Space complexity is O(1)
    // First loop will start from 0 of the till length of array
    private static void bubbleSortSecond(int[] array) {
        for(int i=0; i< array.length; i++) {
            for(int j=0; j< array.length-i-1; j++) {
                if(array[j] > array[j+1]) {
                    swap(array, j+1, j);
                }
            }
        }
    }

    // Normal way to do Bubble Sort where time complexity is O(n)
    // But Space complexity is O(1)
    // First loop will start from the one less from length of the array till 1
    private static void bubbleSortWithON(int[] array) {
        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for (int i=0; i< array.length-1; i++) {
                if(array[i] > array[i+1]) {
                    swap(array, i+1, i);
                    sorted = false;
                }
            }
        }
    }
}
