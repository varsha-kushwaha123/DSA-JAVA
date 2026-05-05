class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int i;
        int count=0;
        int n=nums.length;
        for(i=1;i<n;i++){
            if(nums[i]<=nums[i-1]){
                int needed=nums[i-1]+1;
                count+=needed-nums[i];
                nums[i]=needed;

            }
        }
        return count;

        
    }
}