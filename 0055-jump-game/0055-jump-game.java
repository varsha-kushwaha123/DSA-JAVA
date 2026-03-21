class Solution {
    public boolean canJump(int[] nums) {
        int finalposition=nums.length-1;

        for(int i=finalposition-1;i>=0;i--){
            if(i+nums[i]>=finalposition){
                finalposition=i;
            }
        }
        return finalposition==0;


    
        
    }
}