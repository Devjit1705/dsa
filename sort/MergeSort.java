package dev.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main (String[] args) {
        int[] arr = {2, 9, 1, 6, 5, 5, 7, 8, 0};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    private static int[] mergeSort(int[] array) {
        if(array.length==1) return array;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, array.length/2));
        int[] right = mergeSort(Arrays.copyOfRange(array, array.length/2, array.length));
        return merge(left, right);
    }
    private static int[] merge(int[] a, int[] b) {
        int[] combined = new int[a.length+ b.length];
        int index=0;
        int i=0;
        int j=0;
        while(i< a.length && j<b.length) {
            if(a[i] < b[j]) {
                combined[index] = a[i];
                index++;
                i++;
            } else {
                combined[index] = b[j];
                index++;
                j++;
            }
        }
        while(i< a.length) {
            combined[index] = a[i];
            index++;
            i++;
        }
        while(j< b.length) {
            combined[index] = b[j];
            index++;
            j++;
        }
        return combined;
    }
}
