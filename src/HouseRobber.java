/**
 * Created by Nikhil on 10/18/16.
 */

/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of
 * money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have
 * security system connected and it will automatically contact the police if two adjacent houses were broken
 * into on the same night.Given a list of non-negative integers representing the amount of money of each house,
 * determine the maximum amount of money you can rob tonight without alerting the police.
 */

public class HouseRobber {

    public void maxTheft(int[] input) {
        int[] memo = new int[input.length + 1];
        memo[0] = 0;
        memo[1] = input[0];
        for (int i = 2; i < input.length; i++) {
            int maxAmount = Math.max(memo[i-2]+input[i],memo[i-1]);
            memo[i]= maxAmount;

        }
        System.out.println("The maximum amount which can be stolen is "+ memo[input.length]);

    }

}
