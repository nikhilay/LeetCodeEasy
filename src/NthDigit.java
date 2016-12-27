/**
 * Created by Nikhil on 12/26/16.
 * <p>
 * Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...
 * Note:
 * n is positive and will fit within the range of a 32-bit signed integer (n < 231).
 */

/**
 * Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...
 * Note:
 * n is positive and will fit within the range of a 32-bit signed integer (n < 231).
 */

/**
 * Inspired from
 * https://discuss.leetcode.com/topic/64846/java-solution-with-comments/2
 */
public class NthDigit {
    public static void main(String[] args) {
        new NthDigit().findNthDigit(3);
    }

    public int findNthDigit(int n) {
        long base = 1;
        long k = 1;
        //Find the array
        while (n > base * 9 * k) {
            n -= base * 9 * k;
            base *= 10;
            k++;
        }
        //Find the number
        String num = String.valueOf(base + (n - 1) / k);
        return (num.charAt((int) ((n - 1) % k)) - '0');

    }
}

