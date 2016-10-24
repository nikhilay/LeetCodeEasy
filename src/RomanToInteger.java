import java.util.HashMap;

/**
 * Created by Nikhil on 10/24/16.
 */

/**
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 */

public class RomanToInteger {
    public static void main(String[] args) {
        new RomanToInteger().romanToInt("MCMXCVI");
    }

    public int romanToInt(String s) {
        if (s.length() == 0) return 0;
        int sum = 0;
        HashMap<Character, Integer> hmap = new HashMap<>();
        hmap.put('I', 1);
        hmap.put('V', 5);
        hmap.put('X', 10);
        hmap.put('L', 50);
        hmap.put('C', 100);
        hmap.put('D', 500);
        hmap.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            if (i + 1 < s.length()) {
                char c2 = s.charAt(i + 1);
                if (hmap.get(c1) < hmap.get(c2)) {
                    sum += (hmap.get(c2) - hmap.get(c1));
                    i++;
                    continue;
                }
            }

            switch (c1) {
                case 'I':
                    sum += 1;
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    sum += 10;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    sum += 100;
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
                default:
                    sum += 0;
                    break;
            }

        }
        return sum;
    }

}
