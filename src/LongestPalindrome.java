gi

/**
 * Created by Nikhil on 10/17/16.
 */

/**
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can
 * be built with those letters. This is case sensitive, for example "Aa" is not considered a palindrome here.
 */

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        int[] tracker = new int[256];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            tracker[c]++;
        }
        int even=0;
        int odd =0;
        boolean flag = false;
        for(int i=0;i<tracker.length;i++){
            if(tracker[i]%2==0){
                even+=tracker[i];
            }else{
                odd = odd + tracker[i]-1;
                flag = true;
            }
        }
        int flagValue = flag==true?1:0;
        return odd+even+ flagValue;

    }
}
