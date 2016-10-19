/**
 * Created by Nikhil on 10/19/16.
 */
public class PlusOne {
    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {
        int carry = 0;
        int summation = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                summation = digits[digits.length - 1] + 1;
            } else {
                summation = digits[i] + carry;
            }
            carry = summation - 10 >= 0 ? summation / 10 : 0;
            digits[i] = summation % 10;
        }
        if (carry != 0) {
            int[] result = new int[digits.length + 1];
            int index = 1;
            result[0] = carry;
            for (int i : digits) {
                result[index] = i;
                index++;
            }
            return result;
        }
        return digits;
    }
}
