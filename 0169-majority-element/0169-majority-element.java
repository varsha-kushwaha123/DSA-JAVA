class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int count=1;
        int i=0;
        int x=n/2;
        while(i<n-1){

            if(nums[i]==nums[i+1]){
                count++;
                i++;
                if(count>x){
                    break;
                }
            }
            else{
                count=1;
                i++;
            }

        }
        return nums[i];
        
        
    }
}