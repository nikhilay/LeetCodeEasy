import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Nikhil on 10/18/16.
 */

/**
 * A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).
 * Write a function to determine if a number is strobogrammatic. The number is represented as a string.
 * For example, the numbers "69", "88", and "818" are all strobogrammatic.
 */
public class StrobogrammaticNumber {

    public boolean isStrobogrammaticNumber(String st) {
        HashMap<Character, Character> hmap = new HashMap<>();
        hmap.put('0', '0');
        hmap.put('1', '1');
        hmap.put('8', '8');
        hmap.put('6', '9');
        hmap.put('9', '6');

        int end = st.length() - 1;
        int start = 0;
        while (start <= end) {
            char startChar = st.charAt(start);
            char endChar = st.charAt(end);
            if (!hmap.containsKey(startChar) || !hmap.containsKey(endChar)) return false;
            if (hmap.get(startChar) != endChar) return false;
            start++;
            end--;
        }
        return true;

    }


}
