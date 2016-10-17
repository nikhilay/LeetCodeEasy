/**
 * Created by Nikhil on 10/17/16.
 */

/**
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */

public class ValidAnagram {

    public static void main(String[] args) {
        new ValidAnagram().isValidAnagram("nikhil", "likhin");
    }

    public boolean isValidAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] count = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            count[(int) str1.charAt(i)]++;
            count[(int) str2.charAt(i)]--;
        }
        for (int i : count) {
            if (i != 0) {
                System.out.println("Not a Valid Anagram");
                return false;
            }
        }
        System.out.println("Valid anagram");
        return true;

    }
}
