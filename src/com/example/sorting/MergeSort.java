package com.example.sorting;

import java.util.Arrays;

public class MergeSort {

    /**
     * Merge Sort
     * Recursively divides the array into halves
     * until there's only a lot of 1-element arrays.
     * Then it compares and merges these sub-arrays into
     * one sorted array.
     *
     * Time complexity: O(n log n)
     * Space complexity: O(n) - we need extra memory for
     *                  the array (including the recursive call stack)
     * Stability: Yes, equal elements are not re-arranged
     * Speed: Fast
     *
     * Pros:
     * - There's not much seeking
     * - Can be overlapped with heap sort
     *
     * Cons:
     * - Requires extra space
     * - Less efficient than smarter sorts
     *
     * @param array to be sorted
     * @return sorted array
     */
    public int[] sort(int[] array) {
        int center = array.length / 2; //The centre of the array for division
        //Base case
        if (center == 0) {
            return array;
        }
        //Creating the sub-arrays
        int[] array1 = Arrays.copyOfRange(array, 0, center);
        int[] array2 = Arrays.copyOfRange(array, center, array.length);
        return merge(sort(array1), sort(array2));
    }

    /**
     * Function used by the Merge Sort,
     * merges two sub-arrays by comparing
     * each element in them
     * @param array1 - the 'left' sub-array
     * @param array2 - the 'right' sub-array
     * @return the merged arrays
     */
    private int[] merge(int[] array1, int[] array2) {
        int[] mergedArrays = new int[array1.length + array2.length];
        int arr1Index = 0; //Current index of array1
        int arr2Index = 0; //Current index of array1
        //Loop until we reach the end of one array
        while ((arr1Index < array1.length) && (arr2Index < array2.length)) {
            //Select the smaller element
            if (array1[arr1Index] < array2[arr2Index]) {
                mergedArrays[arr1Index + arr2Index] = array1[arr1Index];
                arr1Index++; //Increase the current index
            } else {
                mergedArrays[arr1Index + arr2Index] = array2[arr2Index];
                arr2Index++; //Increase the current index
            }
        }
        //Insert the rest of the elements in arr1
        if (arr1Index < array1.length) {
            while (arr1Index < array1.length) {
                mergedArrays[arr1Index + arr2Index] = array1[arr1Index];
                arr1Index++;
            }
        }
        //Insert the rest of the elements in arr2
        if (arr2Index < array2.length) {
            while (arr2Index < array2.length) {
                mergedArrays[arr1Index + arr2Index] = array2[arr2Index];
                arr2Index++;
            }
        }
        return mergedArrays;
    }
}
