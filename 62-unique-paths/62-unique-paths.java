class Solution {
    public int uniquePaths(int m, int n) {
      int [] [] dp=new int[m][n];
        return paths(m,n,dp);        
    }
    public int paths(int m, int n, int [][] dp)
    {
        int ways=0;
        if(m==1 && n==1)return 1;
        if(m > 1)
        {
            if(dp[m-2][n-1] >0) ways=ways+dp[m-2][n-1];
            else ways=ways+paths(m-1,n,dp);
        } 
        if(n > 1)
        {
            if(dp[m-1][n-2] >0) ways=ways+dp[m-1][n-2];
            else ways=ways+paths(m,n-1,dp);
        } 
        return dp[m-1][n-1]=ways;
    }
}