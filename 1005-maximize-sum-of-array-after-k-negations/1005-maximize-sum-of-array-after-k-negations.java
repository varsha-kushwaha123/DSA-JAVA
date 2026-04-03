class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int t=0;
        int i=0;
        int sum=0;
        for( i=0;i<nums.length;i++){
            if(nums[i]<0){
                t=1;
                break;
            }
        }
        if(t==0){
            if(k%2==1){
                nums[0]=-nums[0];
            }
        }
        else{
            while(i<nums.length &&nums[i]<0 && k>0){
                nums[i]=-nums[i];
                i++;
                k--;
            }
            Arrays.sort(nums);
            if(k%2==1){
                nums[0]=-nums[0];
            }
        } 

        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
        }
        return sum;
        
    }
}