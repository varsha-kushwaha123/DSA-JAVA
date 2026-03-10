class Solution {
    Boolean istriangle(int a,int b,int c){
        if((a+b)>c){
            if((a+c)>b){
                if((b+c)>a){
                    return true;
                }
            }

        }
        return false;
    }
    public int largestPerimeter(int[] nums) {
        if(nums.length<3) return 0;
        int Max=0,perimeter;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
           int lp=i+1,rp=lp+1;
            while(rp<nums.length){
                if(istriangle(nums[i],nums[lp],nums[rp])){
                    perimeter=nums[i]+nums[lp]+nums[rp];
                    Max=Math.max(Max,perimeter);
    
                }
                lp++;
                rp++;
            }
        }
        if(Max==0) return 0;
        return Max;

        
    }
}