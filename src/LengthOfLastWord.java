/**
 * Created by Nikhil on 10/20/16.
 */

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
 * return the length of last word in the string.
 * If the last word does not exist, return 0.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] strArray = s.split("\\s+");
        if (strArray.length == 0) {
            return 0;
        } else {
            return strArray[strArray.length - 1].toString().length();
        }
    }

    //Without using extra space
    public int lengthOfLastWordWithoutSpace(String s) {
        if (s == null || s.length() == 0) return 0;
        int count = 0;
        boolean flag = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isLetter(s.charAt(i))) {
                flag = true;
                count++;
            } else {
                if (flag) return count++;
            }

        }
        return count;
    }

}
