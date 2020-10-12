package com.example;

import com.example.searching.BinarySearch;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 5, 8, 14, 39, 58, 66, 1012, 2584};

        System.out.println(BinarySearch.binarySearchIterative(array, 103));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
