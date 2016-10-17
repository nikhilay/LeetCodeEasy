import java.util.HashSet;

/**
 * Created by Nikhil on 10/17/16.
 */
/*
 * Given two arrays, write a function to compute their intersection.
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> list1 = new HashSet<>();
        for(int i: nums1){
            list1.add(i);
        }
        HashSet<Integer> list2 = new HashSet<>();
        for(int i: nums2){
            if(list1.contains(i)){I
                list2.add(i);
            }
        }
        int[] result = new int[list2.size()];
        int index =0;
        for(Integer i:list2){
            result[index] =i;
            index++;
        }
        return result;

    }
}
