class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int inc=1;
        int i=0;
        int inc1=1;
        while(i<nums.length-1){
            if(nums[i]<nums[i+1]){
                inc++;
                i++;
            }
            else{
                inc1=Math.max(inc1,inc);
                inc=1;
                i++;
            }
            

        }
        return Math.max(inc,inc1);
    }
}