import java.util.TreeMap;

/**
 * Created by Nikhil on 10/20/16.
 */

/**
 * Given a non-empty array of integers, return the third maximum number in this array.
 * If it does not exist, return the maximum number. The time complexity must be in O(n).
 **/

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i : nums) {
            if (treeMap.containsKey(i)) {
                int currentCount = treeMap.get(i);
                treeMap.put(i, currentCount + 1);

            } else {
                treeMap.put(i, 1);
            }
        }
        int count = 3;
        for (int i : treeMap.descendingKeySet()) {
            count--;
            if (count == 0) {
                return i;
            }


        }
        return treeMap.lastKey();

    }

}
