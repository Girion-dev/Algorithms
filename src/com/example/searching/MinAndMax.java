package com.example.searching;

public class MinAndMax {

    /**
     * Basic algorithm for finding a minimum
     * value in an array.
     *
     * Time complexity: O(n)
     *
     * @param array to be sorted
     * @return the index of the minimum value
     */
    public static int min(int[] array) {
        int min = 0; //Set the minimum to the first index
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
        return min;
    }

    /**
     * Basic algorithm for finding a maximum
     * value in an array.
     *
     * Time complexity: O(n)
     *
     * @param array to be sorted
     * @return the index of the maximum value
     */
    public static int max(int[] array) {
        int max = 0; //Set the maximum to the first index
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[max]) {
                 max = i;
            }
        }
        return max;
    }
}
