package stackds;

public class StackDemo {
    public static void main(String[] args) {
        // Testing LinkedListStack
        StackInterface<Integer> linkedListStack = new LinkedListStack<>();
        System.out.println("Testing LinkedListStack with Integer:");
        linkedListStack.push(10);
        linkedListStack.push(20);
        linkedListStack.push(30);
        System.out.println("Top element (peek): " + linkedListStack.peek());
        System.out.println("Pop element: " + linkedListStack.pop());
        System.out.println("Top element (peek): " + linkedListStack.peek());

        // Testing ArrayStack
        StackInterface<String> arrayStack = new ArrayStack<>(5);
        System.out.println("\nTesting ArrayStack with String:");
        arrayStack.push("A");
        arrayStack.push("B");
        arrayStack.push("C");
        System.out.println("Top element (peek): " + arrayStack.peek());
        System.out.println("Pop element: " + arrayStack.pop());
        System.out.println("Top element (peek): " + arrayStack.peek());

        // Checking if stacks are empty
        System.out.println("\nIs LinkedListStack empty? --> " + linkedListStack.isEmpty());
        System.out.println("Is ArrayStack empty? --> " + arrayStack.isEmpty());
    }
}
