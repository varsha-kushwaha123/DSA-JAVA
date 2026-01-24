class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer>map1=new HashMap<>();
        HashMap<Integer,Integer>map2=new HashMap<>();
        HashMap<Integer,Integer>map3=new HashMap<>();
        int length=0;
        int Min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            map1.put(nums[i],map1.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            map2.put(nums[i],i);
        }
        for(int i=nums.length-1;i>=0;i--){
            map3.put(nums[i],i);
        }
        int dig=Collections.max(map1.values());
        for(int i=0;i<nums.length;i++){
            if(map1.get(nums[i])==dig){
                length=map2.get(nums[i])-map3.get(nums[i])+1;
                Min=Math.min(Min,length);

            }
           
        }
        return Min;
        
    
        
    }
}