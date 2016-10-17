/**
 * Created by Nikhil on 10/17/16.
 */

/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 */
public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        new ExcelSheetColumnNumber().titleToNumber("BA");
    }

    public int titleToNumber(String s) {
        s = s.toLowerCase();
        int power = -1;
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int asciiValue = (int) c - 97+1;
            sum += 26 * Math.pow(26, power)*asciiValue;
            power++;

        }
        System.out.println("Column number is " + sum);
        return sum;
    }
}
