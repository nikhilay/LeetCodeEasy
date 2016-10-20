import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nikhil on 10/19/16.
 */

/**
 * Given an index k, return the kth row of the Pascal's triangle.
 * For example, given k = 3,
 * Return [1,3,3,1].
 */
public class PascalsTriangleTwo {
    public static void main(String[] args) {
        new PascalsTriangleTwo().generate(2);
    }

    public List<Integer> generate(int numRows) {
        List<Integer> previous = new LinkedList<Integer>();
        previous.add(1);
        if (numRows == 0) {
            return previous;
        } else {
            for (int i = 0; i < numRows; i++) {
                List<Integer> row = new LinkedList<Integer>();
                row.add(1);
                for (int j = 0; j < previous.size() - 1; j++) {
                    int sum = previous.get(j) + previous.get(j + 1);
                    row.add(sum);
                }
                row.add(1);
                previous = row;

            }

        }

        for (int i : previous) {
            System.out.print(i + " ");
        }
        return previous;
    }
}
