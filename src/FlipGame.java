/**
 * Created by Nikhil on 10/17/16.
 */

import java.util.LinkedList;

/**
 * You are playing the following Flip Game with your friend: Given a string that contains only these two characters: + and -,
 * you and your friend take turns to flip twoconsecutive "++" into "--". The game ends when a person can no longer make a
 * move and therefore the other person will be the winner.
 * Write a function to compute all possible states of the string after one valid move.
 * For example, given s = "++++", after one move, it may become one of the following states:
 */
public class FlipGame {

    public static void main(String[] args) {
     new FlipGame().generatePossibleNextMoves("++++");
    }

    public void generatePossibleNextMoves(String s) {
        LinkedList<String> result = new LinkedList();
        for (int i = 0; i < s.length() - 1; i++) {
            StringBuilder sb = new StringBuilder();
            if (s.charAt(i) == '+' && s.charAt(i + 1) == '+') {
                  sb.append(s.substring(0,i));
                  sb.append("--");
                  sb.append(s.substring(i+2));
                result.add(sb.toString());
            }
        }

        for(String str: result){
            System.out.println(str);
        }
    }
}
