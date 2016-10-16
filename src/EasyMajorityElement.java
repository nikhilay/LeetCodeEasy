import java.util.HashMap;

/**
 * Created by Nikhil on 10/15/16.
 */
public class EasyMajorityElement {

    public int majorityElement(int[] nums) {
        if(nums.length==1)return nums[0];

        HashMap<Integer,Integer> hmap = new HashMap<>();

        for(int i:nums){
            if(hmap.containsKey(i)){
                int count = hmap.get(i) +1 ;
                if(count>(nums.length/2)){
                    return i;
                }
                hmap.put(i,count);
                continue;
            }
            hmap.put(i,1);
        }
        return 0;
    }
}
