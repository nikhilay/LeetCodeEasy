import java.util.LinkedList;

/**
 * Created by Nikhil on 10/17/16.
 */

/**
 * A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59).
 * Each LED represents a zero or one, with the least significant bit on the right.
 */
public class BinaryWatch {
    public LinkedList<String> readBinaryWatch(int num) {
        LinkedList<String> result = new LinkedList<String>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                int total = countNumbers(i) + countNumbers(j);
                if (total == num) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    sb.append(":");

                    if (j < 10) {
                        sb.append(0);
                        sb.append(j);
                    } else {
                        sb.append(j);
                    }
                    result.add(sb.toString());


                }
            }
        }
        return result;

    }

    private int countNumbers(int num) {
        int result = 0;

        while (num > 0) {
            if ((num & 1) == 1) {
                result++;
            }
            num >>= 1;
        }
        return result;
    }
}
