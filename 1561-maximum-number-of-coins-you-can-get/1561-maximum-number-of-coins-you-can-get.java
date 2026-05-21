class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n=piles.length;
        int right=n-2;
        int ans=0;
        for(int i=0;i<n/3;i++){
            ans+=piles[right];
            right-=2;

        }
        return ans;
        
    }
}