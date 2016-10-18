/**
 * Created by Nikhil on 10/18/16.
 */

/**
 * Given two non-negative numbers num1 and num2 represented as string, return the sum of num1 and num2.
 * Note:
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class AddStrings {
    public static void main(String[] args) {
        String result = new AddStrings().addStrings("1", "9");
        System.out.println("Result is " + result);
    }

    public String addStrings(String num1, String num2) {
        String shorterString = num1.length() > num2.length() ? num2 : num1;
        String longerString = num1.length() > num2.length() ? num1 : num2;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int l = longerString.length() - 1;
        int s = shorterString.length() - 1;
        while (l >= 0 || s >= 0) {
            if (s >= 0) {
                int summation = ((int) longerString.charAt(l) - 48) + ((int) shorterString.charAt(s) - 48) + carry;
                carry = summation / 10 > 0 ? summation / 10 : 0;
                sb.append(summation - 10 >= 0 ? String.valueOf(summation - 10) : String.valueOf(summation));
                l--;
                s--;
            } else {
                int summation = ((int) longerString.charAt(l) - 48) + carry;
                carry = summation / 10 > 0 ? summation / 10 : 0;
                sb.append(summation - 10 > 0 ? String.valueOf(summation - 10) : String.valueOf(summation));
                l--;
            }
        }
        sb.append(carry > 0 ? String.valueOf(carry) : "");

        return sb.reverse().toString();

    }
}
