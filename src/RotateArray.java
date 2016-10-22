/**
 * Created by Nikhil on 10/21/16.
 */

/**
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        new RotateArray().rotateBetterWay(input, 3);
        for (int i : input) {
            System.out.println(i);
        }
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[(nums.length - k + i) % (nums.length)];
        }
        System.arraycopy(result, 0, nums, 0, result.length);
    }

    //With O(N) time complexity and O(1) space complexity

    public void rotateBetterWay(int[] nums, int k) {
        if (nums == null || nums.length == 0) return;
        k = k % nums.length;
        int len = nums.length - k;

        arrReverse(nums, 0, len - 1);
        arrReverse(nums, len, nums.length - 1);
        arrReverse(nums, 0, nums.length - 1);
    }

    private void arrReverse(int[] nums, int startIndex, int endIndex) {

        while (startIndex < endIndex) {
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;
            startIndex++;
            endIndex--;

        }
    }
}
