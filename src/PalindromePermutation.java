import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.HashMap;

/**
 * Created by Nikhil on 10/17/16.
 */
public class PalindromePermutation {
    public static void main(String[] args) {
       boolean result = new PalindromePermutation().checkIfPalindromeisPossible("carerac");
        System.out.println("Is the given String palindrome? "+result);
    }

    public boolean checkIfPalindromeisPossible(String s){
        HashMap<Character, Integer> hmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (hmap.containsKey(c)) {
                int currentCount = hmap.get(c);
                hmap.put(c, currentCount + 1);

            } else {
                hmap.put(c, 1);
            }
        }
        boolean flag = true;
        for(Character c : hmap.keySet()){
            int count = hmap.get(c);
            if(count%2==1 &&flag==true){
                flag=false;
            }else if(count%2==1 &&flag==false){
                return false;
            }
        }

        return true;
    }
}
