import java.util.Stack;

/**
 * Created by Nikhil on 10/20/16.
 */
public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;


    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack();
    }

    public void push(int x) {
        stack.push(x);
        int min = Integer.MAX_VALUE;
        if(minStack.isEmpty()) {
            min = Math.min(min, x);
        }else{
            min = Math.min(minStack.peek(),x);
        }

        minStack.push(min);

    }

    public void pop() {
        stack.pop();
        minStack.pop();

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
