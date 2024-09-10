package utilities;

public class MinMaxFinderImpl<T extends Comparable<T>> implements MinMaxFinder<T> {

    @Override
    public T findMin(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    @Override
    public T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
