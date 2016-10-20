import java.util.HashMap;

/**
 * Created by Nikhil on 10/20/16.
 */

/**
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character but a character may map to itself.
 * For example,
 * Given "egg", "add", return true.
 * Given "foo", "bar", return false.
 * Given "paper", "title", return true.
 */
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> hmap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);
            if (hmap.containsKey(key)) {
                if (hmap.get(key) != value) {
                    return false;
                }
            } else {
                if (hmap.containsValue(value)) {
                    return false;
                }
                hmap.put(key, value);
            }
        }
        return true;
    }
}
