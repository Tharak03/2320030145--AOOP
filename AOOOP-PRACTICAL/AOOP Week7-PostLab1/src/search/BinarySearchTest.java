package search;

public class BinarySearchTest {

    public static void main(String[] args) {
        BinarySearch<Integer> integerSearch = new BinarySearch<>();
        Integer[] intArray = {1, 3, 5, 7, 9, 11};
        System.out.println("Integer Search - Key 5: " + integerSearch.search(intArray, 5));
        System.out.println("Integer Search - Key 8: " + integerSearch.search(intArray, 8));

        BinarySearch<Double> doubleSearch = new BinarySearch<>();
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("Double Search - Key 4.4: " + doubleSearch.search(doubleArray, 4.4));
        System.out.println("Double Search - Key 6.6: " + doubleSearch.search(doubleArray, 6.6));

        BinarySearch<String> stringSearch = new BinarySearch<>();
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};
        System.out.println("String Search - Key 'cherry': " + stringSearch.search(stringArray, "cherry"));
        System.out.println("String Search - Key 'grape': " + stringSearch.search(stringArray, "grape"));
    }
}
