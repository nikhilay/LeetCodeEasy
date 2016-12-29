/**
 * Created by Nikhil on 12/28/16.
 */

/**
 * Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies
 * of the substring together. You may assume the given string consists of lowercase English letters only and its length
 * will not exceed 10000.
 */

/**
 * Inspired from
 * https://discuss.leetcode.com/topic/67992/java-simple-solution-with-explanationg
 */
public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String str) {
        int l = str.length();
        for (int i = l / 2; i >= 1; i--) {
            if (l % i == 0) {
                int m = l / i;
                String s = str.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < m; j++) {
                    sb.append(s);
                }
                if (sb.toString().equals(str)) return true;

            }
        }
        return false;

    }
}
