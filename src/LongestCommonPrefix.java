/**
 * Created by Nikhil on 10/24/16.
 */

/**
 * Given a set of strings, find the longest common prefix.
 * Input  : {“geeksforgeeks”, “geeks”, “geek”, “geezer”}
 * Output : "gee"
 * Input  : {"apple", "ape", "april"}
 * Output : "ap"
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] input = {"apple", ""};
        String result = new LongestCommonPrefix().longestCommonPrefix(input);
        System.out.println(result);
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        int minLength = Integer.MAX_VALUE;

        for (String s : strs) {
            minLength = Math.min(minLength, s.length());
        }

        for (int i = 0; i < minLength; i++) {
            for (int j = 1; j < strs.length; j++) {
                String s1 = strs[j];
                String s2 = strs[j - 1];
                if (s1.charAt(i) != s2.charAt(i)) {
                    return s1.substring(0, i);
                }
            }
        }
      return strs[0].substring(0,minLength);
    }
}
