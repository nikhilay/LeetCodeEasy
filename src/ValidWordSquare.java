/**
 * Created by Nikhil on 10/19/16.
 */

import java.util.List;

/**
 * Given a sequence of words, check whether it forms a valid word square.
 * A sequence of words forms a valid word square if the kth row and column read the exact same string,
 * where 0 ≤ k < max(numRows, numColumns).
 * Note:
 * The number of words given is at least 1 and does not exceed 500.
 * Word length will be at least 1 and does not exceed 500.
 * Each word contains only lowercase English alphabet a-z.
 */

public class ValidWordSquare {

    public boolean validWordSquare(List<String> words) {
        if (words == null || words.size() == 0) return true;
        int n = words.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                if (j>=n||words.get(j).length()<=i||words.get(i).charAt(j) != words.get(j).charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

}
