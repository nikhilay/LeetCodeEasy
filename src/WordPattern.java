import java.util.HashMap;

/**
 * Created by Nikhil on 10/20/16.
 */

/**
 * Given a pattern and a string str, find if str follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 * Examples:
 * pattern = "abba", str = "dog cat cat dog" should return true.
 * pattern = "abba", str = "dog cat cat fish" should return false.
 * pattern = "aaaa", str = "dog cat cat dog" should return false.
 * pattern = "abba", str = "dog dog dog dog" should return false.Ò
 */

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        if (pattern.isEmpty()) return false;
        String[] t = str.split("\\s+");
        if (pattern.length() != t.length) return false;
        HashMap<Character, String> hmap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            String value = t[i];
            if (hmap.containsKey(key)) {
                if (!hmap.get(key).equals(value)) {
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

