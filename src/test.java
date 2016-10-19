import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.zip.CheckedInputStream;

/**
 * Created by Nikhil on 10/17/16.
 */
public class test {

    public static void main(String[] args) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        hmap.put('A',2);
        hmap.put('a',3);

//        for(Character c:hmap.keySet()){
//            System.out.print(c +" ");
//        }
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);

        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
