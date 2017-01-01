/**
 * Created by Nikhil on 1/1/17.
 */

import java.util.HashMap;

/**
 * An abbreviation of a word follows the form <first letter><number><last letter>. Below are some examples of
 * word abbreviations:Assume you have a dictionary and given a word, find whether its abbreviation is unique in the
 * dictionary. A word's abbreviation is unique if no other word from the dictionary has the same abbreviation.
 */
public class UniqueWordAbbreviation {
    HashMap<String, String> tracker;

    public UniqueWordAbbreviation(String[] dictionary) {
        tracker = new HashMap<>();
        for (String s : dictionary) {
            String key = getKey(s);
            if(tracker.containsKey(key)){
                if(!tracker.get(key).equals(s)){
                    tracker.put(key,"");
                }
            }else{
                tracker.put(key, s);
            }


        }

    }

    private String getKey(String str) {
        if (str.length() <= 2) return str;
        return str.charAt(0) + Integer.toString(str.length() - 2) + str.charAt(str.length() - 1);

    }

    public boolean isUnique(String word) {
        String key = getKey(word);
        return !tracker.containsKey(key) || tracker.get(key).equals(word);
    }

}

