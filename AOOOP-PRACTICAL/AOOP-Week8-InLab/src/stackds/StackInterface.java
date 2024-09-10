package stackds;

public interface StackInterface<T> {
    void push(T element);
    T pop();
    T peek(); // Peek at the top element without removing it
    boolean isEmpty(); // Check if the stack is empty
}
