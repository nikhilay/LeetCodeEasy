import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nikhil on 12/29/16.
 */

/**
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 * Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
 * The order of output does not matter.
 */

/**
 * Inspired from
 * https://discuss.leetcode.com/topic/64434/shortest-concise-java-o-n-sliding-window-solution/3
 */
public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new LinkedList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) return res;
        int left = 0;
        int right = 0;
        int count = p.length();
        int[] hash = new int[256];
        for (int i = 0; i < p.length(); i++) {
            int index = p.charAt(i);
            hash[index]++;
        }
        while (right < s.length()) {
            if (hash[s.charAt(right)] > 0) {
                count--;
            }

            hash[s.charAt(right)]--;
            right++;

            if (count == 0) {
                res.add(left);
            }
            if (right - left == p.length()) {
                if (hash[s.charAt(left)] >= 0) {
                    count++;
                }
                hash[s.charAt(left)]++;
                left++;
            }

        }
        return res;
    }
}
