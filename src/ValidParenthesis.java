import java.util.HashMap;
import java.util.Stack;

/**
 * Created by Nikhil on 10/23/16.
 */
public class ValidParenthesis {
    //([]){}
    public boolean isValid(String s) {

        HashMap<Character, Character> hmap = new HashMap<>();
        hmap.put('(', ')');
        hmap.put('{', '}');
        hmap.put('[', ']');
        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hmap.containsKey(c)) {
                stack.add(c);

            } else {
                if (hmap.containsValue(c)) {
                    if (!stack.isEmpty() && hmap.get(stack.peek()) == c) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }

            }


        }
        return stack.isEmpty();
    }
}
