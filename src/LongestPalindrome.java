import java.util.HashMap;

/**
 * Created by Nikhil on 10/17/16.
 */

/**
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can
 * be built with those letters. This is case sensitive, for example "Aa" is not considered a palindrome here.
 */

public class LongestPalindrome {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> hmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (hmap.containsKey(c)) {
                int currentCount = hmap.get(c);
                hmap.put(c, currentCount + 1);

            } else {
                hmap.put(c, 1);
            }
        }
        boolean flag = true;
        int sum = 0;
        for (Character c : hmap.keySet()) {
            int count = hmap.get(c);
            if (count % 2 == 0) {
                sum += count;
            } else if (count % 2 == 1 && flag == true) {
                sum += count;
                flag = false;
            } else if (count % 2 == 1 && flag == false) {
                count = count - 1;
                sum += count;
            }
        }
        return sum;
    }
}
