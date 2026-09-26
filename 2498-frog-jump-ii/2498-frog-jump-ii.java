class Solution {
    public int maxJump(int[] stones) {
        int n=stones.length;
        // if(n==2) return stones[1];
        // int max_difference=0;
        // for(int i=0;i<n-2;i+=2){
        //     int diff1=Math.abs(stones[i]-stones[i+1]);
        //     int diff2=Math.abs(stones[i]-stones[i+2]);
        //     int max1=Math.max(diff1,diff2);
        //     max_difference=Math.max(max_difference,max1);
        // }
        // return max_difference;
        int ans=stones[1]-stones[0];
        for(int i=2;i<n;i++){
            ans=Math.max(ans,stones[i]-stones[i-2]);
        }
        return ans;
        
    }
}