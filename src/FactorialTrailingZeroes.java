/**
 * Created by Nikhil on 10/19/16.
 */

/**
 * Given an integer n, return the number of trailing zeroes in n!.
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int count =0;
        int five = 5;
        for (long i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;

    }
}
