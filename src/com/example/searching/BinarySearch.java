package com.example.searching;

public class BinarySearch {

    /**
     * Binary Search (Recursive)
     * Repeatedly looks at the middle element,
     * compares it to the searched element, if
     * they are not equal, it eliminates the half
     * of the array where the element cannot lie.
     *
     * Time complexity: O(log n)
     *
     * Note: Recursion causes higher time complexity
     *
     * @param array to be searched through
     * @param x to be searched for
     * @param head - the beginning of the current array
     * @param tail - the end of the current array
     * @return index if found, -1 if not found
     */
    public static int binarySearchRecursive(int[] array, int x, int head, int tail) {
        int pivot = (head + tail) / 2;
        if (head > tail) {
            return -1;
        }
        if (x < array[pivot]) {
            return binarySearchRecursive(array, x, head, pivot - 1);
        }
        if (x > array[pivot]) {
            return binarySearchRecursive(array, x, pivot + 1, tail);
        }
        return pivot;
    }

    /**
     * Binary Search (Iterative)
     * Repeatedly looks at the middle element,
     * compares it to the searched element, if
     * they are not equal, it eliminates the half
     * of the array where the element cannot lie.
     *
     * Time complexity: O(log n)
     *
     * @param array to be searched through
     * @param x to be searched for
     * @return index if found, -1 if not found
     */
    public static int binarySearchIterative(int[] array, int x) {
        int head = 0; //Beginning of the current array
        int tail = array.length - 1; //End of the current array
        int pivot;
        if (x < array[head] || x > array[tail]) { //Element out of bounds
            return - 1;
        }
        //Loop till there's an array to halve
        while (head <= tail) {
            pivot = (head + tail) / 2;
            if (x == array[pivot]) {
                return pivot;
            }
            if (x < array[pivot]) {
                tail = pivot - 1;
            } else {
                head = pivot + 1;
            }
        }
        return -1;
    }
}
