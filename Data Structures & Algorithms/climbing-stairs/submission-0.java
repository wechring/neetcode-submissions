class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];

        dp[1] = 1;
        dp[0] = 1;

        for(int x = 2; x <= n; x++){
            dp[x] = dp[x-1] + dp[x-2];
        }

        return dp[n];
    }
}
