/**
 * Created by Nikhil on 10/19/16.
 */

/**
 * Determine whether an integer is a palindrome
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x;
        int rev = 0;
        while (x != 0) {
            rev = rev * 10 + (x % 10);
            x = x / 10;
        }
        return original == rev;
    }
}
