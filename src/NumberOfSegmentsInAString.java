/**
 * Created by Nikhil on 12/29/16.
 */

/**
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of
 * non-space characters.
 * Please note that the string does not contain any non-printable characters.
 */
public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        int segmentCount = 0;
        if (s.length() == 0) return segmentCount;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != ' ' && s.charAt(i + 1) == ' ') {
                segmentCount++;
            }
        }
        int lastWord = s.charAt(s.length() - 1) != ' ' ? 1 : 0;
        return segmentCount + lastWord;
    }
}
