class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int i,j;
        int x=-1,y=-1;
        int ans=Integer.MAX_VALUE;
        

        for(i=0,j=0;i<nums.length&&j<nums.length;i++,j++){
            if(nums[i]==1){
                x=i;
            }
            if(nums[j]==2){
                y=j;
            }
            if(x!=-1 && y!=-1){
              ans=Math.min(ans,Math.abs(x-y));
            }  

        }
        return (ans==Integer.MAX_VALUE) ? -1:ans;
    }
}