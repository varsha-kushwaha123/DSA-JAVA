class Solution {
    public int searchInsert(int[] nums, int target) {
        int st=0,end=nums.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                st=mid+1;  
            }
            else{
                end=mid-1;
            }
        }
        if(target<nums[0]){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
               if(target>nums[i]&&target<nums[i+1]){
                    return i+1;
                }
               
        }
         return nums.length;
    }
}