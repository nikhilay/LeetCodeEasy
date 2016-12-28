/**
 * Created by Nikhil on 12/28/16.
 */

/**
 * Write a function that takes a string as input and returns the string reversed.
 * Example:
 * Given s = "hello", return "olleh".
 */
public class ReverseString {
    //Time complexity - O(n)
    //Space Complexity -O(n)
    public String reverseString(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
            i++;
            j--;
        }
        return new String(arr);
    }

    /**
     * Second Way
     */
    public String reverseString2(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = s.length(); i > 0; i--) {
            sb.append(s.charAt(i - 1));
        }
        return sb.toString();
    }
}
