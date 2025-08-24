class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int count=0;
        while(i<nums.length){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
            i++;
        }
        return count;
    }
}