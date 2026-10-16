class Solution {
    public int solve(int[] nums,int k){
        int l=0,r=0,count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                int val=map.get(nums[l]);
                val--;
                if(val==0){
                    map.remove(nums[l]);
                }
                else{
                    map.put(nums[l],val);
                }
                l=l+1;
            }
            count+=(r-l+1);
            r=r+1;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        int x=solve(nums,k);
        int y=solve(nums,k-1);
        return x-y;
        
    }
}