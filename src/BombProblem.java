/**
 * Created by Nikhil on 10/23/16.
 */
public class BombProblem {
    public static void main(String[] args) {
        int[] input ={1,1,2,2,3,4,4,5,5,6};
        System.out.println(new BombProblem().bomb(input));
    }
    public boolean bomb(int[] nums) {
        if (nums.length < 6) return false;
        int currCount = 1;
        int consecutiveCount = 0;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i - 1] == nums[i]) {
                currCount++;
            } else {

                if (nums[i - 1] + 1 == nums[i] && currCount >= 2) {
                    consecutiveCount++;
                    currCount=1;
                }else{
                    consecutiveCount=0;
                    currCount=1;
                }

            }
            if(consecutiveCount>=2 && currCount>=2){
                return true;
            }
        }
        return false;
    }
}
