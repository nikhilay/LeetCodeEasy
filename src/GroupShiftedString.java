/**
 * Created by Nikhil on 10/18/16.
 */

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Given a string, we can "shift" each of its letter to its successive letter, for example: "abc" -> "bcd". We can keep "shifting"
 * which forms the sequence:
 * "abc" -> "bcd" -> ... -> "xyz"
 * Given a list of strings which contains only lowercase alphabets, group all strings that belong to the same shifting sequence.
 * For example, given: ["abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"],
 */
public class GroupShiftedString {
    public static void main(String[] args) {
        String[] input = {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};
        new GroupShiftedString().groupTheStrings(input);
    }

    public void groupTheStrings(String[] input) {
        HashMap<String, ArrayList<String>> result = new HashMap();

        for (String s : input) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                int difference = (int) s.charAt(i) - (int) s.charAt(0);
                int diff = difference < 0 ? difference + 26 : difference;
                sb.append(String.valueOf(diff));
            }
            String st = sb.toString();
            if (result.containsKey(st)) {
                result.get(st).add(s);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                result.put(st, list);

            }
        }

        for (ArrayList<String> value : result.values()) {
            for (String s : value) {
                System.out.print(s + ", ");
            }
            System.out.print("\n");
        }

    }

}
