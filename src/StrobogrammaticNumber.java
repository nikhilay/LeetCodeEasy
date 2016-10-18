import java.util.HashSet;

/**
 * Created by Nikhil on 10/18/16.
 */
public class StrobogrammaticNumber {
    public static void main(String[] args) {
        new StrobogrammaticNumber().isStrobogrammaticNumber(6969 );
    }

    public boolean isStrobogrammaticNumber(int n) {
        String st = String.valueOf(n);
        HashSet<Character> hset = new HashSet<>();
        hset.add('0');
        hset.add('1');
        hset.add('8');

        int end = st.length() - 1;
        for (int start = 0; start <= end; start++) {
            char startChar = st.charAt(start);
            char endChar = st.charAt(end);
            if ((hset.contains(startChar)) && (hset.contains(endChar))) {
                end--;
            } else if ((startChar == '6' && endChar == '9')||(startChar == '9' && endChar == '6')){
                end--;

            } else{
                System.out.println("Not a Strobogrammatic Number");
                return false;
            }
        }
        System.out.println("Its a Strobogrammatic Number");
        return true;

    }


}
