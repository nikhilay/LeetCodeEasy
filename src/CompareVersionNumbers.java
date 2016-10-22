/**
 * Created by Nikhil on 10/21/16.
 */


/**
 * Compare two version numbers version1 and version2.
 * If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
 * You may assume that the version strings are non-empty and contain only digits and the . character.
 * The . character does not represent a decimal point and is used to separate number sequences.
 * For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision
 * of the second first-level revision.
 */
public class CompareVersionNumbers {

    public int compareVersion(String version1, String version2) {
        String[] version1arr = version1.split("\\.");
        String[] version2arr = version2.split("\\.");

        int i = 0;
        while (i < version1arr.length || i < version2arr.length) {
            if (i < version1arr.length && i < version2arr.length) {
                if (Integer.valueOf(version1arr[i]) > Integer.valueOf(version2arr[i])) {
                    return 1;
                } else if (Integer.valueOf(version1arr[i]) < Integer.valueOf(version2arr[i])) {
                    return -1;
                }

            } else if (i < version1arr.length) {
                if (Integer.valueOf(version1arr[i]) != 0) {
                    return 1;
                }

            } else if (i < version2arr.length) {
                if (Integer.valueOf(version2arr[i]) != 0) {
                    return -1;
                }

            }
            i++;
        }
        return 0;
    }
}
