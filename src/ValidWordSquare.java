/**
 * Created by Nikhil on 10/19/16.
 */

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
    public static void main(String[] args) {
        String[] input = {"abcd", "bnrt", "crmy", "dty"};

        new ValidWordSquare().isValidWordSquare(input);
    }

    public void isValidWordSquare(String[] input) {
        int stringLen = input[0].length();
        char[][] checker = new char[stringLen][input.length];
        int index = 0;
        for (String s : input) {
            if (stringLen != s.length()) {
                System.out.println(" Words are not of equal length");
                return;
            }
            checker[index] = s.toCharArray();
            index++;
        }
        if (input.length != stringLen) {
            System.out.println("Word square not possible");
            return;
        }
        for (int i = 0; i < checker[0].length; i++) {
            for (int j = 0; j < checker.length; j++) {
                if (checker[i][j] != input[i].charAt(j)) {
                    System.out.println("Not a word square");
                    return;
                }
            }
        }
        System.out.println("Valid word square!!");
    }


}
