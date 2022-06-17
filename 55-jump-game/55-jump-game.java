class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        boolean [] dp=new boolean [n];
        dp[n-1]=true;
        for(int i=n-2 ;i>=0;i--)
        {
            for(int j=i+nums[i];j>i;j--)
            {
                if(i+nums[i]>=n-1)
                {
                    dp[i]=true;
                    break;
                }
                else
                {
                    if(dp[j]==true)
                    {
                        dp[i]=dp[j];
                        break;
                    }
                    
                }
            }
        }
        return dp[0];
        
    }
}