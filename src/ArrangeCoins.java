/**
 * Created by Nikhil on 12/29/16.
 */

/**
 * You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.
 * Given n, find the total number of full staircase rows that can be formed.
 * n is a non-negative integer and fits within the range of a 32-bit signed integer.
 */
public class ArrangeCoins {
    //O(1) method
    public int arrangeCoins(int n) {
        return (int) ((-1 + Math.sqrt(8 * (long) n + 1)) / 2);
    }

    //O(n) method
    public int arrangeCoinsN(int n) {
        int rows = 0;
        for (int i = 1; i <= n; i++) {
            n = n - i;
            if (n >= 0) rows++;
        }
        return rows;
    }
}

