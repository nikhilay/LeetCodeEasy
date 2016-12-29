/**
 * Created by Nikhil on 10/19/16.
 */

/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * (Note: The order of elements can be changed. It doesn't matter what you leave beyond the new length.)
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;

        while (i < nums.length) {
            if (nums[i] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;

            }
            i++;

        }
        return j;
    }
}
