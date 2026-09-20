class Solution {
    public int solve(int n,int []dp){
        if(n==0) return 1;
        if(n==1) return 1;
        if(dp[n]!=-1){
            return dp[n];
        }
        int left=solve(n-1,dp);
        int right=solve(n-2,dp);
        dp[n]= left+right;
        return dp[n];
    }
    public int climbStairs(int n) {
    int []dp=new int[n+1];
    Arrays.fill(dp,-1);
    return solve(n,dp);   
    }
}