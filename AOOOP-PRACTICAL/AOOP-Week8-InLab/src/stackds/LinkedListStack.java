package stackds;

import java.util.LinkedList;

public class LinkedListStack<T> implements StackInterface<T> {
    private LinkedList<T> list = new LinkedList<>();

    @Override
    public void push(T element) {
        list.addFirst(element);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return list.removeFirst();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return list.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
