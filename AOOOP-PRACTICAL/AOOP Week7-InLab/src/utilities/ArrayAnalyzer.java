package utilities;

public class ArrayAnalyzer {
    public static void main(String[] args) {
        MinMaxFinder<Integer> intFinder = new MinMaxFinderImpl<>();
        Integer[] intArray = {4, 7, 1, 9, 3};
        System.out.println("Integer Array - Min: " + intFinder.findMin(intArray));
        System.out.println("Integer Array - Max: " + intFinder.findMax(intArray));

        MinMaxFinder<String> stringFinder = new MinMaxFinderImpl<>();
        String[] stringArray = {"apple", "orange", "banana", "kiwi"};
        System.out.println("String Array - Min: " + stringFinder.findMin(stringArray));
        System.out.println("String Array - Max: " + stringFinder.findMax(stringArray));

        MinMaxFinder<Character> charFinder = new MinMaxFinderImpl<>();
        Character[] charArray = {'c', 'a', 'z', 'b'};
        System.out.println("Character Array - Min: " + charFinder.findMin(charArray));
        System.out.println("Character Array - Max: " + charFinder.findMax(charArray));

        MinMaxFinder<Float> floatFinder = new MinMaxFinderImpl<>();
        Float[] floatArray = {4.2f, 2.5f, 3.8f, 1.1f};
        System.out.println("Float Array - Min: " + floatFinder.findMin(floatArray));
        System.out.println("Float Array - Max: " + floatFinder.findMax(floatArray));
    }
}
