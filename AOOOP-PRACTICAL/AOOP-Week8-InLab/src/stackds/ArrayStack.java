package stackds;

public class ArrayStack<T> implements StackInterface<T> {
    private T[] stackArray;
    private int top;
    private int maxSize;

    @SuppressWarnings("unchecked")
    public ArrayStack(int size) {
        maxSize = size;
        stackArray = (T[]) new Object[maxSize];
        top = -1;
    }

    @Override
    public void push(T element) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full.");
            return;
        }
        stackArray[++top] = element;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return stackArray[top--];
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return stackArray[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}
