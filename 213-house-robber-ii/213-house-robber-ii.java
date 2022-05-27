class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        if(nums.length==2)return Math.max(nums[0],nums[1]);
        int n=nums.length;
        int [] numl=new int[n-1];
        int [] numr=new int[n-1];
        for(int i=1;i<n;i++)
        {
            numl[i-1]=nums[i];
            numr[i-1]=nums[i-1];
        }
        return Math.max(robber(numl),robber(numr));
        
        
    }
    
     public int robber(int[] nums) {
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