class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int [] dp=new int[n+1];
        dp[n]=0;
        dp[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]+dp[i+2]>dp[i+1]) dp[i]=nums[i]+dp[i+2];
            else dp[i]=dp[i+1];
        }
        return dp[0];
    }
}