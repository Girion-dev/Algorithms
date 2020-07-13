public class Sorting {

    /**
     * Selection Sort
     * Repeatedly searches the lowert element
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
            min = i;
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
     * the array.
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

    public int[] insertionSort(int[] array) {
        int memory;
        for (int i = 1; i < array.length; i++) {
            memory = i;
            for (int j = array.length - 1; j > 0; j--) {

            }
        }
        return array;
    }
}
