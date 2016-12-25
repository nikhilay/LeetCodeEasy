/**
 * Created by Nikhil on 12/25/16.
 */

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */

/**
 * Inspired from
 * https://discuss.leetcode.com/topic/3162/easy-to-understand-java-solution
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        StringBuilder[] sbArr = new StringBuilder[numRows];
        for (int i = 0; i < sbArr.length; i++) {
            sbArr[i] = new StringBuilder();
        }
        int i = 0;
        while (i < s.length()) {
            //vertically Down
            for (int j = 0; j < numRows && i < s.length(); j++) {
                sbArr[j].append(s.charAt(i++));
            }
            for (int j = numRows - 2; j >= 1 && i < s.length(); j--) {
                sbArr[j].append(s.charAt(i++));
            }
        }
        for (int j = 1; j < sbArr.length; j++) {
            sbArr[0].append(sbArr[j]);
        }
        return sbArr[0].toString();

    }
}
