package sorting;

public class BubbleSortTest {

    public static void main(String[] args) {
        // Test with Integer array
        Integer[] intArray = {5, 2, 9, 1, 5, 6};
        System.out.println("Original Integer Array:");
        printArray(intArray);
        BubbleSort.bubbleSort(intArray);
        System.out.println("Sorted Integer Array:");
        printArray(intArray);

        // Test with Double array
        Double[] doubleArray = {3.14, 2.71, 1.41, 1.73, 2.58};
        System.out.println("Original Double Array:");
        printArray(doubleArray);
        BubbleSort.bubbleSort(doubleArray);
        System.out.println("Sorted Double Array:");
        printArray(doubleArray);

        // Test with String array
        String[] stringArray = {"banana", "apple", "pear", "orange", "grape"};
        System.out.println("Original String Array:");
        printArray(stringArray);
        BubbleSort.bubbleSort(stringArray);
        System.out.println("Sorted String Array:");
        printArray(stringArray);
    }

    private static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
