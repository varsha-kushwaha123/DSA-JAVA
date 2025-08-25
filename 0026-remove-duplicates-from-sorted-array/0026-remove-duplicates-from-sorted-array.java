class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int i=0,j=1;
        nums[count]=nums[i];
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                count++;
                nums[count]=nums[j];
                i++;
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        return count+1;
    }
}        
