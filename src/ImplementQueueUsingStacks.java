import java.util.Stack;

/**
 * Created by Nikhil on 12/29/16.
 */

/**
 * Implement Queue using Stacks   Add to List QuestionEditorial Solution  My Submissions
 * Implement the following operations of a queue using stacks.
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 */
public class ImplementQueueUsingStacks {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> bufferStack = new Stack<>();
    private int peek = -1;

    // Push element x to the back of queue.
    public void push(int x) {
        if (peek == -1) {
            peek = x;
        }
        stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (stack.isEmpty()) return;

        while (!stack.isEmpty()) {
            bufferStack.push(stack.pop());
        }
        bufferStack.pop();
        peek = bufferStack.isEmpty() ? -1 : bufferStack.peek();
        while (!bufferStack.isEmpty()) {
            stack.push(bufferStack.pop());
        }
    }

    // Get the front element.
    public int peek() {
        return peek;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty();

    }
}
