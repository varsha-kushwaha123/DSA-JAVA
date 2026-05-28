class Solution {
    public int compareBitonicSums(int[] nums) {
        int n=nums.length;
        long sum1=nums[0];
        long sum2=0;
         int i;
        for(i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                sum1+=nums[i];
            }
            else{
                break;
            }

        }
        for(int j=i-1;j<n-1;j++){
            if(nums[j]>nums[j+1]){
                sum2+=nums[j];
            }
        }
        sum2+=nums[n-1];
        if(sum1>sum2) return 0;
        if(sum2>sum1) return 1;
        return -1;
        
        
    }
}