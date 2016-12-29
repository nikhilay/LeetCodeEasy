/**
 * Created by Nikhil on 10/17/16.
 */

import java.util.HashSet;

/**
 * Given an array of integers, find if the array contains any duplicates. Your function should return true if any
 * value appears at least twice in the array, and it should return false if every element is distinct.
 */
public class ContainsDuplicates {

    public boolean checkIfitContainDuplicates(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();
        for (int i : nums) {
            if (hset.contains(i)) {
                return true;
            } else {
                hset.add(i);
            }
        }
        return false;
    }

}
