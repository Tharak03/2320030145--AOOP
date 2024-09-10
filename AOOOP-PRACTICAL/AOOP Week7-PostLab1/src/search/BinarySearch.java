package search;

public class BinarySearch<T extends Comparable<T>> {

    public int search(T[] array, T key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            T midValue = array[mid];
            
            int comparison = midValue.compareTo(key);

            if (comparison < 0) {
                low = mid + 1;
            } else if (comparison > 0) {
                high = mid - 1;
            } else {
                return mid; // key found
            }
        }
        return -1; // key not found
    }
}
