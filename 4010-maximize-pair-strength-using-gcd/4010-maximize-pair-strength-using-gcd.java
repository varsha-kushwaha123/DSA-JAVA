class Solution {
    public long maxPairStrength(int[] nums) {
        long max_strength=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                long gcd=getgcd(nums[i],nums[j]);
                long curr_strength=((long)nums[i]*nums[j])/(gcd*gcd);
                max_strength=Math.max(max_strength,curr_strength);

            }
        }
        return max_strength;
    }
    public long getgcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return Math.abs((long)a);
    }
}