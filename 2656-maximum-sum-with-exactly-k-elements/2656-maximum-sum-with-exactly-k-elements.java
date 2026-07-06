class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>max)max=i;
        }
        int sum=max;
        max++;
        for(int i=1;i<k;i++){
            sum=sum+(max);
            max++;
        }
        return sum;

        
    }
}