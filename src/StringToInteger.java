/**
 * Created by Nikhil on 10/21/16.
 */
public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(new StringToInteger().myAtoi("123"));
    }

    public int myAtoi(String str) {
        if (str == null || str.length() == 0 || (str.contains("+") && str.contains("-"))) return 0;
        char c = '+';
        str = str.trim();
        int i = 0;
        if (str.charAt(i) == c) {
            i++;

        } else if (str.charAt(i) == '-') {
            c = '-';
            i++;
        }
        double result = 0;
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + ((int) str.charAt(i) - (int) '0');
            i++;
        }

        if (c == '-') {
            result = result * -1;
        }

        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) result;
    }
}
