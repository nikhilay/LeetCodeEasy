/**
 * Created by Nikhil on 10/18/16.
 */

/**
 * Given an integer, write a function to determine if it is a power of two.
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        int countOfOne = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                countOfOne++;
            }
            n >>= 1;
        }
        return (countOfOne == 1);
    }
}
