/**
 * Created by Nikhil on 10/17/16.
 */

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] input = {0, 1, 0, 3, 12,0};
        new MoveZeroes().moveZeroes(input);
    }

    public void moveZeroes(int[] input) {
        int count = 0;
        for (int i : input) {
            if (i != 0) {
                input[count++] = i;
            }
        }
        while (count < input.length) {
            input[count++] = 0;
        }

        for (int i : input) {
            System.out.print(i + ", ");
        }


    }
}
