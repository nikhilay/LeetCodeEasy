/**
 * Created by Nikhil on 12/28/16.
 */

/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * For example:
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 */
public class AddDigits {
    public int addDigits(int num) {
        return 1 + (num - 1) % 9;
    }
}
