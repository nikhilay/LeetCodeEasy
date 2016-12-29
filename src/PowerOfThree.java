

/**
 * Created by Nikhil on 10/18/16.
 */

/**
 * Given an integer, write a function to determine if it is a power of three.
 */
public class PowerOfThree {

    //Best Solution
    public boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int
        return n>0 && (Math.pow(3,19)%n)==0;

    }
    //Without Math
    public boolean isPowerOfThreeWithoutMath(int n) {
        float input = n;
        while (input != 0) {
            if (input == 1f) {
                return true;
            }
            input = input / 3f;
        }
        return false;
    }

    //With Math
    public boolean isPowerOfThreeWithMath(int n) {
        if (n == 0) return false;
        return n == Math.pow(3, Math.ceil(Math.log(n) / Math.log(3)));
    }
}
