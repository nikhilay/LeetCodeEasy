/**
 * Created by Nikhil on 10/18/16.
 */

/**
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 */
public class PowerOfFour {

    public boolean checkIfItsPowerOfFour(int num) {
        int countOfOne = 0;
        int countOfZero = 0;

        while (num > 0) {
            if ((num & 1) == 1) {
                countOfOne++;
            } else {
                countOfZero++;
            }
            num >>= 1;
        }

        return (countOfOne == 1) && (countOfZero % 2 == 0);
    }
}
