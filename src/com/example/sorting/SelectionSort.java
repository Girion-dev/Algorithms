package com.example.sorting;


public class SelectionSort {

    /**
     * Selection Sort
     * Repeatedly searches the lowest element
     * and moves it at the beginning, right
     * after the last sorted element, swapping
     * its position with the element at this
     * position.
     *
     * Time complexity: O(n^2)
     * Space complexity: Sorted in place - O(1)
     * Stability: No, equal elements might be re-arranged
     * Speed: Slow
     *
     * Used when:
     * - The array is NOT partially sorted
     * - There is memory usage constraints
     * - Simplicity is desired
     * - The array is relatively small
     *
     * NOT used when:
     * - The array is large
     * - The array is nearly sorted
     * - Faster run time is desired (and memory is not
     * a concern)
     *
     * @param array to be sorted
     * @return sorted array
     */
    public int[] sort(int[] array) {
        int temp; //Temp value for swapping elements
        int min; //The lowest element
        //Loop over all values
        for (int i = 0; i < array.length; i++) {
            //Find min value
            min = i; //Set the min to the current first element
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            //Swap the elements
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }
}
