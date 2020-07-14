public class Sorting {

    /**
     * Selection Sort
     * Repeatedly searches the lowest element
     * and moves it to the beginning, right
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
    public int[] selectionSort(int[] array) {
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
    public int[] bubbleSort(int[] array) {
        boolean swapped = true; //Did elements swap?
        int temp; //Temp value for swapping elements
        //Loop until elements are being swapped
        while (swapped) {
            swapped = false;
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
    public int[] insertionSort(int[] array) {
        int memory; //The item to be sorted
        int j; //Counter for moving the sorted part
        for (int i = 1; i < array.length; i++) { //Consider the first element already sorted
            memory = array[i]; //Save the element
            j = i - 1;
            //Loop until we find a less or equal number or reach the beginning of the array
            while ((j >= 0) && (array[j] > memory)) {
                array[j + 1] = array[j];
                j--;
            }
            //Put the element in the right place
            array[j + 1] = memory;
        }
        return array;
    }

    public int[] heapSort(int[] array) {
        array = heapSortUp(array);
        return array;
    }

    private int[] heapSortUp(int[] array) {
        int temp; //Temp value for swapping elements
        int parent; //The index of the parent of the element
        int j; //The index of the current element when re-building the heap
        //Loop over all elements
        for (int i = 1; i < array.length; i++) { //We skip the root
            j = i; //Set the index to the index of the current element
            parent = (i - 1) / 2; //Set the parent
            //Loop until parent is lower than current element or until we are in the root
            while (((array[parent] < array[j])) && j != 0) {
                //Swap elements if parent is lower
                if (array[parent] < array[j]) {
                    temp = array[parent];
                    array[parent] = array[j];
                    array[j] = temp;
                }
                j = parent; //Update the position of the current element
                parent = (parent - 1) / 2; //Update the position of the parent
            }
        }
        return array;
    }

    private int[] heapSortDown(int[] array) {

        return array;
    }
}
