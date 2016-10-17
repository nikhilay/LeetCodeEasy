import java.util.HashMap;
import java.util.zip.CheckedInputStream;

/**
 * Created by Nikhil on 10/17/16.
 */
public class test {

    public static void main(String[] args) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        hmap.put('A',2);
        hmap.put('a',3);

        for(Character c:hmap.keySet()){
            System.out.print(c +" ");
        }
    }
}
