import java.util.HashMap;

/**
 * Created by Nikhil on 10/20/16.
 */

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (hmap.containsKey(nums[i])) {
                result[0] = hmap.get(nums[i]);
                result[1] = i;
                return result;

            } else {
                hmap.put(target - nums[i], i);
            }

        }
        return result;
    }
}
