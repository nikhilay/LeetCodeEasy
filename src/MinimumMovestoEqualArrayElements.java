/**
 * Created by Nikhil on 12/28/16.
 */

/**
 * Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements
 * Mequal, where a move is incrementing n - 1 elements by 1.
 */
public class MinimumMovestoEqualArrayElements {
    public int minMoves(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int min = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            min = Math.min(min, nums[i]);
        }
        /**
         * m - moves
         * sum+ m(n-1)*1 = x*n;
         * x = min + m;
         * m = sum -min *n
         */
        return sum - min * nums.length;

    }
}
