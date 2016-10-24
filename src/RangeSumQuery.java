/**
 * Created by Nikhil on 10/23/16.
 */

import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 * The update(i, val) function modifies nums by updating the element at index i to val.
 * Example:
 * Given nums = [-2, 0, 3, -5, 2, -1]
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 * Note:
 * You may assume that the array does not change.
 * There are many calls to sumRange function.
 */

public class RangeSumQuery {
    int[] memo;

    public static void main(String[] args) {
        int[] input = { -2, 0, 3, -5, 2, -1};
        RangeSumQuery obj = new RangeSumQuery();
        obj.NumArray(input);
        System.out.println(obj.sumRange(0, 5));
    }

    public void NumArray(int[] nums) {
        memo = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            memo[i + 1] = memo[i] + nums[i];
        }

    }

    public int sumRange(int i, int j) {
        return memo[j + 1] - memo[i];
    }

}
