import static com.sun.tools.javac.jvm.ByteCodes.ret;

/**
 * Created by Nikhil on 10/18/16.
 */

/**
 * Given an integer, write a function to determine if it is a power of three.
 */
public class PowerOfThree {

    public static void main(String[] args) {
        new PowerOfThree().isPowerOfThreeWithoutMath(76);
        System.out.println(new PowerOfThree().isPowerOfThreeWithMath(76));
    }

    //Without Math

    public boolean isPowerOfThreeWithoutMath(int n) {
        float input = n;
        while (input != 0) {
            if (input == 1f) {
                System.out.println("It is power of three");
                return true;
            }
            input = input / 3f;
        }
        System.out.println("It is not power of three");
        return false;
    }


    //With Math
    public boolean isPowerOfThreeWithMath(int n) {
        if (n == 0) return false;
        return n == Math.pow(3, Math.log(n) / Math.log(3));
    }
}
