/**
 * Created by Nikhil on 10/20/16.
 */

/**
 * Given two binary strings, return their sum (also a binary string).
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 */
public class AddBinary {
    public static void main(String[] args) {
        new AddBinary().addBinary("1111", "1");
    }

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        int carry = 0;
        while (indexA >= 0 || indexB >= 0) {
            int cA = 0;
            int cB = 0;
            if (indexA >= 0) {
                cA = a.charAt(indexA) == '1' ? 1 : 0;
            }
            if (indexB >= 0) {
                cB = b.charAt(indexB) == '1' ? 1 : 0;
            }

            int summation = cA + cB + carry;
            int digit = summation > 1 ? summation - 2 : summation;
            sb.append(digit);
            carry = summation > 1 ? 1 : 0;
            indexA--;
            indexB--;
        }
        if (carry == 1) sb.append('1');

        System.out.println(sb.reverse().toString());

        return sb.reverse().toString();

    }
}
