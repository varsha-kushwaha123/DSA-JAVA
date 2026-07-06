class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[n];
            nums[n]+=1;

        }
        return sum;

        
    }
}