/**
 * Created by Nikhil on 10/21/16.
 */
public class ReverseInteger {
    public static void main(String[] args) {
        int result = new ReverseInteger().reverse(1534236469);
        System.out.println(result);
    }

    public int reverse(int x) {
        int originalNumber = x;
        x = Math.abs(x);
        long sum = 0;
        while (x > 0) {
            sum = sum * 10 + (x % 10);
            x = x / 10;
        }
        if (sum > Integer.MAX_VALUE) return 0;
        return originalNumber > 0 ? (int)sum :(int) (sum) * (-1);

    }
}
