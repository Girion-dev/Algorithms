public class Main {

    public static void main(String[] args) {
        int[] array = {-1, 0, 10, 8, 2, 4, 5, -5};

	    Sorting sorting = new Sorting();

        System.out.println("Unordered: ");
        printArray(array);

	    array = sorting.quickSort(array);

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
