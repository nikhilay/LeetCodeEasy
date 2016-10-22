import java.util.Stack;

/**
 * Created by Nikhil on 10/21/16.
 */

/**
 * Contributors: Admin
 * Implement the following operations of a queue using stacks.
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 */
public class MyQueue {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        System.out.println(obj.peek());
    }

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> bufferStack = new Stack<>();

    // Push element x to the back of queue.
    public void push(int x) {
        stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (stack.isEmpty()) return;

        while (!stack.isEmpty()) {
            bufferStack.push(stack.pop());
        }
        bufferStack.pop();
        while (!bufferStack.isEmpty()) {
            stack.push(bufferStack.pop());
        }
    }

    // Get the front element.
    public int peek() {
        if (stack.isEmpty()) return -1;

        while (!stack.isEmpty()) {
            bufferStack.push(stack.pop());
        }
        int val = bufferStack.peek();
        while (!bufferStack.isEmpty()) {
            stack.push(bufferStack.pop());
        }
        return val;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty();

    }
}
