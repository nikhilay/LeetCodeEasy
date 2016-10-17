import java.util.HashMap;

/**
 * Created by Nikhil on 10/17/16.
 */
//Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
public class FirstUniqueCharacter {
    public int firstUniqueChar(String s) {

        HashMap<Character, Integer> hmap = new HashMap<>();

        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(hmap.containsKey(c)){
                int currentCount = hmap.get(c);
                hmap.put(c,currentCount +1);

            }else{
                hmap.put(c,1);
            }
        }

        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(hmap.get(c)==1){
                return i;
            }
        }
        return -1;
    }

}
