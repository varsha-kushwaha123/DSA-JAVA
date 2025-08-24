class Solution {
    public int searchInsert(int[] nums, int target) {
        int st=0,end=nums.length-1,mid=-1;
        while(st<=end){
             mid=(st+end)/2;
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
        return st;
    }
}