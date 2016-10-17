/**
 * Created by Nikhil on 10/17/16.
 */

/**
 * Problem Description:
 * Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.
 * For example,
 * Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
 * Given word1 = "coding", word2 = "practice", return 3.
 * Given word1 = "makes", word2 = "coding", return 1.
 * Note:
 * You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.
 */
public class ShortestWordDistance {

    public static void main(String[] args) {
        String[] words = {"practice", "makes", "perfect", "coding", "makes"};
        new ShortestWordDistance().getShortestDistance(words,"coding","practice");
    }


    public void getShortestDistance(String[] words, String word1, String word2) {
        int distance = Integer.MAX_VALUE;
        int indexOfWord1 = -1;
        int indexOfWord2 = -1;
        if (words.length == 0 || (word1.equals(word2))) return;
        for (int i = 0; i < words.length; i++) {
            if (word1.equals(words[i])) {
                indexOfWord1 =i;
                if (indexOfWord2 != -1) {
                    distance = Math.min(distance, Math.abs(indexOfWord1 - indexOfWord2));
                }
            } else if (word2.equals(words[i])) {
                indexOfWord2 =i;
                if (indexOfWord1 != -1) {
                    distance = Math.min(distance, Math.abs(indexOfWord1 - indexOfWord2));
                }

            }
        }
        System.out.println("Minimum distance is " + distance);

    }
}


