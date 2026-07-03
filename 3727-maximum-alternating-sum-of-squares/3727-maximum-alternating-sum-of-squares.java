class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int n=nums.length;
        int x=n/2;
        long minus=0;
        long sum=0;
        int j=0;
        for( j=0;j<x;j++){
            minus+=1L*nums[j]*nums[j];

        }
        for(int k=j;k<n;k++){
            sum+=1L*nums[k]*nums[k];
        }
        return sum-minus;
        
    }
}