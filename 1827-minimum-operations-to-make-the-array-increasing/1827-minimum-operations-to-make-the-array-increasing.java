class Solution {
    public int minOperations(int[] nums) {
        if (nums.length==1) return 0;
        int n=nums.length;
        int ans=0;
        int curr=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i] <= curr){
                curr++;
                ans+=curr-nums[i];
            }
            else{
                curr=nums[i];
            }
        }
        return ans;

        
    }
}