/**
 * Created by Nikhil on 10/22/16.
 */

import java.util.HashMap;

/**
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the
 * array such that nums[i] = nums[j] and the difference between i and j is at most k.
 */

public class ContainsDuplicatesTwo {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null) return false;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hmap.containsKey(nums[i])) {
                if (Math.abs(i - hmap.get(nums[i])) <= k) {
                    return true;
                }
            }
            hmap.put(nums[i], i);
        }
        return false;
    }

}
