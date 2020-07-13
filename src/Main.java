public class Main {

    public static void main(String[] args) {
        int[] array = {3, 2, 5, 1, 9, 4};

	    Sorting sorting = new Sorting();

        System.out.println("Unordered: ");
        printArray(array);

	    array = sorting.insertionSort(array);

        System.out.println("Ordered: ");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
