/**
 * Created by Nikhil on 10/21/16.
 */

/**
 * Implement strStr().
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (needle.length() > haystack.length()) return -1;
        int needleLength = needle.length();

        if (!haystack.contains(needle)) {
            return -1;
        } else {
            for (int i = 0; i < haystack.length(); i++) {
                char c = haystack.charAt(i);
                if (c == needle.charAt(0)) {
                    if ((i + needleLength) <= haystack.length() && needle.equals(haystack.substring(i, i + needleLength))) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
