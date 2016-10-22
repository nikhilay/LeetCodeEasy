/**
 * Created by Nikhil on 10/21/16.
 */

import java.util.HashMap;

/**
 * Design and implement a TwoSum class. It should support the following operations: add and find.
 * add - Add the number to an internal data structure.
 * find - Find if there exists any pair of numbers which sum is equal to the value.
 */

public class TwoSumThree {
    private HashMap<Integer, Integer> hmap = new HashMap<>();

    public static void main(String[] args) {
        TwoSumThree obj = new TwoSumThree();
        obj.add(2);
        obj.add(2);
        obj.add(5);
        obj.find(4);
    }


    public void add(int n) {
        if (hmap.containsKey(n)) {
            int currentCount = hmap.get(n);
            hmap.put(n, currentCount + 1);

        } else {
            hmap.put(n, 1);
        }
        System.out.println(n + " has been added");
    }

    public boolean find(int sum) {
        for (int k : hmap.keySet()) {
            int diff = Math.abs(sum - k);
            if (hmap.containsKey(diff)) {
                if (diff != k) {
                    System.out.println("Sum is possible");
                    return true;
                } else if (hmap.get(k) > 1) {
                    System.out.println("Sum is possible");
                    return true;
                }
            }
        }
        System.out.println("Sum is not possible");
        return false;

    }
}
