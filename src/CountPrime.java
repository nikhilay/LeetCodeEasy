import java.util.HashSet;

/**
 * Created by Nikhil on 10/20/16.
 */

/**
 * Count the number of prime numbers less than a non-negative number, n
 */
public class CountPrime {
    public static void main(String[] args) {
        int primeCount = new CountPrime().countPrimes(5);
        System.out.println(primeCount);
    }
    public int countPrimes(int n) {
        if (n == 1 ||n==0) {
            return 0;
        } else if (n == 2) {
            return 0;
        } else if (n == 3) {
            return 1;
        }
        HashSet<Integer> primeSet = new HashSet<>();
        primeSet.add(2);
        primeSet.add(3);
        OuterLoop:
        for (int i = 4; i < n; i++) {
            for (int p : primeSet) {
                int check = i % p;
                if (check == 0) {
                    continue OuterLoop;
                }
            }
            primeSet.add(i);
        }

        return primeSet.size();
    }
}
