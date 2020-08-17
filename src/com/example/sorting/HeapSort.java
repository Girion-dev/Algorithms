package com.example.sorting;

public class HeapSort {

    public int[] sort(int[] array) {
        array = up(array);
        int temp;
        for (int i = array.length - 1; i >= 0; i--) {
            temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            array = down(array, i);
        }
        return array;
    }

    public int[] up(int[] array) {
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

    private int[] down(int[] array, int lastIndex) {
        int child;
        int temp;
        int i = 0;
        child = 2 * i + 1;
        while (array[i] < array[child] && i <= lastIndex) {
            if (array[child + 1] > array[i]) {
                child++;
            }
            if (array[child] > array[i]) {
                temp = array[i];
                array[i] = array[child];
                array[child] = temp;
                i = child;
            }
        }
        return array;
    }
}
