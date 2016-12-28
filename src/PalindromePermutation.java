
/**
 * Created by Nikhil on 10/17/16.
 */

/**
 * Given a string, determine if a permutation of the string could form a palindrome.
 * For example,
 * "code" -> False, "aab" -> True, "carerac" -> True.
 */
public class PalindromePermutation {

    public boolean checkIfPalindromeisPossible(String s) {
        int[] helper = new int[256];
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            helper[c]++;
        }
        boolean flag = true;
        for (int i : helper) {
            if (i % 2 == 1 && flag == true) {
                flag = false;
            } else if (i % 2 == 1 && flag == false) {
                return false;
            }
        }

        return true;
    }
}
