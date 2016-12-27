/**
 * Created by Nikhil on 12/26/16.
 */

/**
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.S
 */
public class SumOfTwoIntegers {
    public int getSum(int a, int b) {

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
