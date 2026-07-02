class Solution {
    public long maximumScore(int[] nums) {
        int n=nums.length;
        long prefixsum=0;
        long maxscore=Long.MIN_VALUE;
        int []sufmin=new int[n];
        sufmin[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            sufmin[i]=Math.min(nums[i],sufmin[i+1]);
        }
        for(int i=0;i<nums.length-1;i++){
            prefixsum+=nums[i];
            maxscore=Math.max(maxscore,prefixsum-sufmin[i+1]);
                
            
        }
        return maxscore;
        
    }
}