
/**
 * Created by Nikhil on 10/20/16.
 */

/**
 * Given an array of integers A and let n to be its length.
 * Assume Bk to be an array obtained by rotating the array A
 * k positions clock-wise, we define a "rotation function" F on A as follow:
 * F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1].
 * Calculate the maximum value of F(0), F(1), ..., F(n-1).
 */
public class MaxRotateFunction {

    public static void main(String[] args) {

    }

    //Naive Way - O(n^2)
    public int maxRotateFunction(int[] A) {
        if (A.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        int n = A.length;

        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = 0; j < A.length; j++) {
                sum += A[(i + j) % n] * j;
            }
            max = Math.max(sum, max);
        }

        return max;
    }

    //smarter Way
    public int maxRotateFunctionSmarterWay(int[] A) {
        if (A.length == 0) return 0;
        int n = A.length;
        int sum = 0;
        int t = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            t += i * A[i];
        }
        int max = t;
        for (int j = 1; j < A.length; j++) {
            t = t + sum - n * A[n - j];
            max = Math.max(max, t);
        }
        return max;

    }


}
