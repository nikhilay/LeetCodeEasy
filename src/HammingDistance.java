/**
 * Created by Nikhil on 12/28/16.
 */

/**
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Given two integers x and y, calculate the Hamming distance.
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int result = x ^ y;
        for (int i = 0; i < 31; i++) {
            if ((result & 1) == 1) {
                count++;
            }
            result >>= 1;
        }
        return count;
    }

}
