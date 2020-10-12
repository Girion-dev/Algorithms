package com.example.searching;

public class SequentialSearch {

    /**
     * Basic algorithm for finding an element
     * in an unordered array.
     *
     * Time complexity: O(n)
     *
     * @param array to be searched through
     * @param x to be searched for
     * @return index if found, -1 if not found
     */
    public static int sequentialSearch(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Improved version of sequential search.
     * Note: In the method call, we need to check
     * if the returned index isn't equal to
     * array.length - 1 (sentinel).
     *
     * Time complexity: O(n)
     *
     * @param array to be searched through
     * @param x to be searched for
     * @return index of the element
     */
    public static int sequentialSearchSentinel(int[] array, int x) {
        array[array.length - 1] = x;
        int i = 0;
        while (true) {
            if (array[i] == x) {
                return i;
            }
            i++;
        }
    }
}
