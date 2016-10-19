import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nikhil on 10/19/16.
 */

/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 * For example, given numRows = 5,
 * Return
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class PascalsTriangle {


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (numRows == 0) return result;
        List<Integer> row1 = new LinkedList<Integer>();
        row1.add(1);
        result.add(row1);
        if (numRows == 1) {
            return result;
        } else {
            for (int i = 1; i < numRows; i++) {
                List<Integer> row = new LinkedList<Integer>();
                row.add(1);
                for (int j = 0; j < result.get(i - 1).size() - 1; j++) {
                    if (i == 1) break;
                    int sum = result.get(i - 1).get(j) + result.get(i - 1).get(j + 1);
                    row.add(sum);
                }
                row.add(1);
                result.add(row);

            }

        }
        return result;
    }

}
