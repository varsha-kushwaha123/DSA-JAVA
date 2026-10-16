class Solution {
    public int solve(int []nums,int k){
        if(k<0) return 0;
        int l=0,r=0,sum=0,count=0;
        while(r<nums.length){
            sum+=nums[r]%2;
            while(sum>k){
                sum-=nums[l]%2;
                l=l+1;
            }
            count=count+(r-l+1);
            r=r+1;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int x=solve(nums,k);
        int y=solve(nums,k-1);
        return x-y;
        
    }
}