
import java.util.LinkedList;

/**
 * Created by Nikhil on 10/16/16.
 */
public class NestedListWeightedSum {
    static class NestedInteger {
        private Integer x;
        private LinkedList<NestedInteger> nestedInteger;
    }

    public static void main(String[] args) {
        LinkedList<NestedInteger> list = new LinkedList<NestedInteger>();
        NestedInteger singleNumber = new NestedInteger();
        singleNumber.x = 1;
        list.add(singleNumber);
        LinkedList<NestedInteger> innerList1 = new LinkedList<NestedInteger>();
        innerList1.add(singleNumber);
        innerList1.add(singleNumber);

        NestedInteger element2 = new NestedInteger();
        element2.nestedInteger = innerList1;
        list.add(element2);
        NestedInteger element3 = new NestedInteger();
        element3.nestedInteger = innerList1;
        list.add(element3);

        new NestedListWeightedSum().getDepth(list);

    }

    public void getDepth(LinkedList<NestedInteger> list) {
        if (list == null || list.size() == 0) {
            System.out.println("List is null or size is empty!!!");
            return;
        }
        int nestedWeightedSum = getDepth(list, 1);
        System.out.println("Sum is " + nestedWeightedSum);
    }

    private int getDepth(LinkedList<NestedInteger> list, int depth) {
        if (list.size() == 0) return 0;
        int sum = 0;
        for (NestedInteger ni : list) {
            if (ni.x != null && ni.nestedInteger == null) {
                sum += ni.x * depth;
            } else if (ni.x == null && ni.nestedInteger != null) {
                sum += getDepth(ni.nestedInteger, depth + 1);
            }
        }
        return sum;
    }
}
