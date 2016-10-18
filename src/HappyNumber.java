import java.util.HashSet;

/**
 * Created by Nikhil on 10/18/16.
 */
public class HappyNumber {
    public static void main(String[] args) {
        new HappyNumber().isHappy(7);
    }
    public boolean isHappy(int n) {
        HashSet<Integer> hset = new HashSet<>();
        while (!hset.contains(n)) {
            int summation = getSum(n);
            if (summation == 1) {
                return true;
            } else {
                hset.add(n);
                n = summation;
            }

        }
        return false;
    }

    private int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n = n / 10;
        }
        return sum;
    }
}
