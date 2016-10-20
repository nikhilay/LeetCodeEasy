import java.util.HashMap;

/**
 * Created by Nikhil on 10/20/16.
 */

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * For example, "Red rum, sir, is murder" is a palindrome, while "Programcreek is awesome" is not.
 * Note:
 * Have you consider that the string might be empty? This is a good question to ask during an interview.
 * For the purpose of this problem, we define empty string as valid palindrome.
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        boolean result = new ValidPalindrome().isPalindrome("abb");
        System.out.println(result);
    }

    //Naive Approach
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            char startChar = s.charAt(start);
            char endChar = s.charAt(end);

            if ((Character.isDigit(startChar) || Character.isLetter(startChar))
                    && (Character.isDigit(endChar) || Character.isLetter(endChar))) {
                if (startChar == endChar) {
                    start++;
                    end--;
                } else {
                    return false;
                }

            } else if ((Character.isDigit(startChar) || Character.isLetter(startChar))
                    && !(Character.isDigit(endChar) || Character.isLetter(endChar))) {
                end--;

            } else if ((!(Character.isDigit(startChar) || Character.isLetter(startChar))
                    && (Character.isDigit(endChar) || Character.isLetter(endChar)))) {
                start++;
            } else {
                start++;
                end--;
            }

        }
        return true;
    }

    // Two Pointers without the need of many else if condition
    public boolean isPalindromeSecondWay(String s) {
        if (s.length() == 0) return true;
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            char startChar = s.charAt(start);
            char endChar = s.charAt(end);
            if (startChar == endChar) {
                start++;
                end--;
            } else {
                return false;
            }

        }
        return true;
    }


}
