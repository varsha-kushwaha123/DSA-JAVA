class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i=0;
        int j=1;
        while(i<nums.length && j<nums.length){
            if(nums[i]%2==0){
                i=i+2;
            }
            else if(nums[j]%2!=0){
                j=j+2;
            }
            else{
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i=i+2;
                j=j+2;

            }
        }
        return nums;
        
    }
}