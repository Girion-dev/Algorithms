package com.example.sorting;

public class InsertionSort {

    /**
     * Insertion Sort
     * Takes the left part of the array as an
     * sorted part and the rest as an unsorted
     * part. Repeatedly keeps inserting the
     * next element into the sorted part.
     * Best of the simple sorting algorithms.
     *
     * Time complexity: O(n^2)
     * Space complexity: Sorted in place - O(1)
     * Stability: Yes, equal elements are not re-arranged
     * Speed: Fast on small arrays
     *
     * Used when:
     * - The array is nearly sorted
     * - There is memory usage constraints
     * - Simplicity is desired
     * - The array is relatively small
     * - Sorting 'online' is needed - that is sorting
     * elements as they come in
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
        int memory; //The item to be sorted
        int j; //Counter for moving the sorted part
        for (int i = 1; i < array.length; i++) { //Consider the first element already sorted
            memory = array[i]; //Save the element
            j = i - 1; //The first element to be moved
            //Loop until we find a less or equal number or reach the beginning of the array
            while ((j >= 0) && (array[j] > memory)) {
                array[j + 1] = array[j];
                j--;
            }
            //Put the element from memory in the right place
            array[j + 1] = memory;
        }
        return array;
    }
}
