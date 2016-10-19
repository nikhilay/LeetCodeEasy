/**
 * Created by Nikhil on 10/19/16.
 */

import java.util.HashMap;

/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 11 12 21, ...
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth sequence.
 */

public class CountAndSay {

    public static void main(String[] args) {
        new CountAndSay().countAndSay(5);
    }

    public String countAndSay(int n) {
        String currentNumber = "1";
        if (n == 1) return currentNumber;
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int count =1;
            for (int j = 1; j < currentNumber.length(); j++) {
                if(currentNumber.charAt(j)==currentNumber.charAt(j-1)){
                    count++;
                }else{
                    sb.append(count);
                    sb.append(currentNumber.charAt(j-1));
                    count =1;
                }

            }
            sb.append(count);
            sb.append(currentNumber.charAt(currentNumber.length()-1));
            currentNumber = sb.toString();
        }
        System.out.println("Number is " + currentNumber);
        return currentNumber;
    }
}
