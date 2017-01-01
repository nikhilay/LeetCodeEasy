/**
 * Created by Nikhil on 10/23/16.
 */

/**
 * Given a non-empty string s and an abbreviation abbr, return whether the string matches with the given abbreviation.
 * A string such as "word" contains only the following valid abbreviations:
 * ["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"]
 * Notice that only the above abbreviations are valid abbreviations of the string "word".
 * Any other string is not a valid abbreviation of "word".
 * Note:
 * Assume s contains only lowercase letters and abbr contains only lowercase letters and digits.
 * Example 1:
 * Given s = "internationalization", abbr = "i12iz4n":
 * Return true.
 * Example 2:
 * Given s = "apple", abbr = "a2e":
 * Return false.
 */

public class ValidWordAbbreviation {
    public static void main(String[] args) {
        System.out.println(new ValidWordAbbreviation().validWordAbbreviation("internationalization", "i12iz4n"));
    }

    public boolean validWordAbbreviation(String word, String abbr) {

        int index1 = 0;
        int index2 = 0;

        while (index1 < word.length() && index2 < abbr.length()) {
            char w = word.charAt(index1);
            char a = abbr.charAt(index2);

            if (Character.isDigit(a)) {
                if(a=='0') return false;
                int start = index2;
                index2++;
                for (int i = index2; i < abbr.length(); i++) {
                    a = abbr.charAt(index2);
                    if (Character.isDigit(a)) {
                        index2++;
                    } else {
                        break;
                    }
                }
                int iter;
                index2 = index2+1;
                if (index2 == abbr.length()) {
                    iter = Integer.valueOf(abbr.substring(start));
                } else {
                    iter = Integer.valueOf(abbr.substring(start, index2));
                }
                while (iter != 0) {
                    index1++;
                    iter--;
                }

            } else {
                if (w != a) {
                    return false;
                } else {
                    index1++;
                    index2++;
                }
            }

        }


        return index1 == word.length() && (index2 == abbr.length()) ? true : false;
    }
}
