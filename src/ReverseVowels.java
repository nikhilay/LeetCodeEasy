import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Nikhil on 10/18/16.
 */

/**
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * Example 1:
 * Given s = "hello", return "holle".
 * Example 2:
 * Given s = "leetcode", return "leotcede".
 */
public class ReverseVowels {
    public String reverseVowels(String s) {
        char[] temp = s.toCharArray();
        HashSet<Character> hset = new HashSet<>();
        hset.add('a');
        hset.add('e');
        hset.add('i');
        hset.add('o');
        hset.add('u');
        hset.add('A');
        hset.add('E');
        hset.add('I');
        hset.add('O');
        hset.add('U');

        int i = 0;
        int j = temp.length - 1;
        while (i < j) {
            if (!hset.contains(temp[i])) {
                i++;
                continue;

            }
            if (!hset.contains(temp[j])) {
                j--;
                continue;
            }

            char c = temp[i];
            temp[i] = temp[j];
            temp[j] = c;
            i++;
            j--;


        }
        return String.valueOf(temp).toString();
    }
}
