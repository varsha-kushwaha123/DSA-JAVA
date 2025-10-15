class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int n=prices.length-1;
        int x=prices[0];
        int i;
        for(i=1;i<=n;i++){
            profit=Math.max(profit,prices[i]-x);
            x=Math.min(x,prices[i]);
        }
        return profit;
        
        
    }
}