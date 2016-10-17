/**
 * Created by Nikhil on 10/17/16.
 */

/**
 * Given  an  arbitrary  ransom  note  string  and  another  string  containing  letters from  all  the  magazines,  write  a  function
 *  that  will  return  true  if  the  ransom   note  can  be  constructed  from  the  magazines ;  otherwise,  it  will  return  false.
 * Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.
 */
public class RansomNote {
    
    public void canConstruct(String ransomNote, String magazine) {

        int[] tracker = new int[128];

        for (int i = 0; i < magazine.length(); i++) {
            int index = (int) magazine.charAt(i);
            int currentCount = tracker[index];
            tracker[index] = currentCount + 1;

        }
        for (int i = 0; i < ransomNote.length(); i++) {
            int index = (int) ransomNote.charAt(i);
            int currentCount = tracker[index];
            tracker[index] = currentCount - 1;
            if (currentCount - 1 < 0) {
                System.out.println("Cannot be constructed!!");
                return;
            }
        }
        System.out.println("Can be constructed!!");
        return;

    }
}
