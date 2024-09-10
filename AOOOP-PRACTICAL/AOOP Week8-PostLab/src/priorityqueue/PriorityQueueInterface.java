package priorityqueue;

public interface PriorityQueueInterface<T extends Comparable<T>> {
    void enqueue(T element);
    T dequeue();
    T peek();
    boolean isEmpty();
}
