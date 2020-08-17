package com.example.sorting;

import java.util.Arrays;

public class QuickSort {

    public int[] sort(int[] array) {
        return sort(array, 0);
    }

    private int[] sort(int[] array, int pivot) {
        int[] result = new int[array.length];
        pivot = 0;
        pivot = divide(array, pivot);
        //Creating the sub-arrays
        int[] array1 = Arrays.copyOfRange(array, 0, pivot);
        int[] array2 = Arrays.copyOfRange(array, pivot + 1, array.length);
        if (array1.length == 1) {
            return array1;
        }
        if (array2.length == 1) {
            return array2;
        }
        sort(array1, pivot);
        sort(array2, pivot);
        return result;
    }

    private int divide(int[] array, int pivot) {
        int temp = array[array.length - 1];
        array[array.length - 1] = array[pivot];
        array[pivot] = temp;
        pivot = array.length - 1;
        int pos = 0;
        while (array[pos] < array[pivot]) {
            pos++;
        }
        if (pos == array.length - 1) {
            return pivot;
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[pivot]) {
                temp = array[i];
                array[i] = array[pos];
                array[pos] = temp;
                pos++;
            }
        }
        temp = array[pos];
        array[pos] = array[pivot];
        array[pivot] = temp;
        pivot = pos;
        return pivot;
    }
}
