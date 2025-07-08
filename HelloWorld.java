import java.util.*;

public class HelloWorld {

    public static void main(String[] args) {        
        Queue<Integer> pq = new PriorityQueue<Integer>();
        // This is a comment.
        System.out.println("Hello, Codespaces with Java 21!");
        // Example to test code completion (type "new Prio" and see suggestions)
        java.util.PriorityQueue<String> myQueue = new java.util.PriorityQueue<>();
        myQueue.add("First");
        myQueue.add("Second");
        System.out.println("Queue element: " + myQueue.poll());

        // Example to test error highlighting (this line intentionally has a syntax error if enabled)
        // String myString = "hello; // Missing closing quote
    }
}