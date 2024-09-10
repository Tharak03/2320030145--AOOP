package priorityqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PriorityQueueImpl<T extends Comparable<T>> implements PriorityQueueInterface<T> {
    private List<T> queue;

    public PriorityQueueImpl() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void enqueue(T element) {
        queue.add(element);
        Collections.sort(queue); // Sort to maintain priority order
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        return queue.remove(0); // Remove the element with the highest priority (lowest value)
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return queue.get(0); // Peek the element with the highest priority
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
