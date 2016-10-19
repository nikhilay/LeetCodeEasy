import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Nikhil on 10/19/16.
 */
public class IntersectionOfTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i : nums1) {
            if (hmap.containsKey(i)) {
                int currentCount = hmap.get(i);
                hmap.put(i, currentCount + 1);
            } else {
                hmap.put(i, 1);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : nums2) {
            if (hmap.containsKey(i)) {
                if (hmap.get(i) > 1) {
                    int count = hmap.get(i);
                    hmap.put(i, count - 1);
                } else {
                    hmap.remove(i);
                }
                result.add(i);

            } else {
                hmap.remove(i);
            }

        }
        int[] intersection = new int[result.size()];
        for (int i = 0; i < intersection.length; i++) {
            intersection[i] = result.get(i);
        }
        return intersection;
    }
}
