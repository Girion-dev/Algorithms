package com.example.sorting;

public class BubbleSort {

    /**
     * Bubble Sort
     * Repeatedly compares adjacent elements
     * and swaps them if they are in wrong order.
     * The max value therefore 'sinks' to the end of
     * the array (or the min at the beginning).
     *
     * Time complexity: O(n^2)
     * Space complexity: Sorted in place - O(1)
     * Stability: Yes, equal elements are not re-arranged
     * Speed: Very slow
     *
     * Used when:
     * - The array is partially sorted
     * - There is memory usage constraints
     * - Simplicity is desired
     * - The array is relatively small
     *
     * NOT used when:
     * - The array is large
     * - The array is completely unsorted
     * - Faster run time is desired (and memory is not
     * a concern)
     *
     * @param array to be sorted
     * @return sorted array
     */
    public int[] sort(int[] array) {
        boolean swapped = true; //Did elements swap?
        int temp; //Temp value for swapping elements
        //Loop until elements are being swapped
        while (swapped) {
            swapped = false; //Assume elements won't be swapped
            //Loop for all the elements in the array
            for (int i = 0; i < (array.length - 1); i++) {
                //If right element is lower, swap with left
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true; //We swapped
                }
            }
        }
        return array;
    }
}
