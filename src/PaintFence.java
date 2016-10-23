/**
 * Created by Nikhil on 10/23/16.
 */

/**
 * There is a fence with n posts, each post can be painted with one of the k colors. You have to paint all
 * the posts such that no more than two adjacent fence posts have the same color. Return the total number of ways
 * you can paint the fence.
 */
public class PaintFence {
    public static void main(String[] args) {
        new PaintFence().findNoOfWaysToPaintFence(3,4);
    }
    public int findNoOfWaysToPaintFence(int n, int k) {
        int[] memo = {0, k, k * k, 0};
        if (n <= 2) return memo[n];

        for (int i = 2; i < n; i++) {
            memo[3] = (k - 1) * (memo[1] + memo[2]);
            memo[1] = memo[2];
            memo[2] = memo[3];

        }
        System.out.println("No of ways is "+memo[3]);
        return memo[3];
    }
}
