//stack;
import java.util.*;
public class ex3 {
    public static void main(String[] args) {
        // Create a stack and a queue
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }

        // Pop elements from the stack and dequeue elements from the queue
        System.out.println("Stack pop: " + stack.pop());
    }
}
