/**
 * Created by Nikhil on 10/20/16.
 */

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
 * return the length of last word in the string.
 * If the last word does not exist, return 0.
 */
public class LengthOfLastWord {
    //Without using extra space
    public int lengthOfLastWordWithoutSpace(String s) {
        if (s == null || s.length() == 0) return 0;
        int count = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i)!=' ') {
                count++;
            }else {
                return count;
            }

        }
        return count;
    }

}
