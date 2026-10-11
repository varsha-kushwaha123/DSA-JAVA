class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,maxlen=0,zero=0;
        int n=nums.length;
        while(r<n){
            if(nums[r]==0){
                zero++;
            }
            while(zero>k){
                    if(nums[l]==0){
                        zero--;
                    }
                    l++;
                
            }
            if(zero<=k){
              maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
          
        }
        return maxlen;
        
    }
}