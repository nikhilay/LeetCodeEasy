import java.util.Arrays;

/**
 * Created by Nikhil on 10/18/16.
 */
public class ClimbStairs {
    public static void main(String[] args) {
        new ClimbStairs().climbStairs(1);
    }
    public int climbStairs(int n) {
        if(n==0)return 0;
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        return climbStairs(n, memo);
    }

    private int climbStairs(int  n,int[] memo){
        if(n<0)return 0;
        if(n==0)return 1;
        if(memo[n]>=0){
            return memo[n];
        }


        int ways = climbStairs(n-1,memo) + climbStairs(n-2,memo);
        memo[n] = ways;

        return memo[n];

    }
}
