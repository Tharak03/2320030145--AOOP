package priorityqueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Testing with Integers
        PriorityQueueInterface<Integer> intQueue = new PriorityQueueImpl<>();
        System.out.println("Testing PriorityQueue with Integers:");
        intQueue.enqueue(30);
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        System.out.println("Peek element: " + intQueue.peek());
        System.out.println("Dequeue element: " + intQueue.dequeue());
        System.out.println("Peek element: " + intQueue.peek());
        

        // Testing with Doubles
        PriorityQueueInterface<Double> doubleQueue = new PriorityQueueImpl<>();
        System.out.println("\nTesting PriorityQueue with Doubles:");
        doubleQueue.enqueue(2.5);
        doubleQueue.enqueue(1.1);
        doubleQueue.enqueue(3.3);
        System.out.println("Peek element: " + doubleQueue.peek());
        System.out.println("Dequeue element: " + doubleQueue.dequeue());
        System.out.println("Peek element: " + doubleQueue.peek());

        
        // Testing with Strings
        PriorityQueueInterface<String> stringQueue = new PriorityQueueImpl<>();
        System.out.println("\nTesting PriorityQueue with Strings:");
        stringQueue.enqueue("Banana");
        stringQueue.enqueue("Apple");
        stringQueue.enqueue("Cherry");
        System.out.println("Peek element: " + stringQueue.peek());
        System.out.println("Dequeue element: " + stringQueue.dequeue());
        System.out.println("Peek element: " + stringQueue.peek());
        

        // Checking if queues are empty
        System.out.println("\nIs Integer queue empty? --> " + intQueue.isEmpty());
        System.out.println("Is Double queue empty? --> " + doubleQueue.isEmpty());
        System.out.println("Is String queue empty? --> " + stringQueue.isEmpty());
    }
}
