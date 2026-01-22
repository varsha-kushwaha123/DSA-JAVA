class Solution {
    public int findLHS(int[] nums) {
        TreeMap<Integer,Integer>map=new TreeMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Integer key:map.keySet()){
            Integer next=map.higherKey(key);
            if(next!=null && next-key==1){
                int val1=map.get(key);
                int val2=map.get(next);
                if(val1+val2>count){
                    count=val1+val2;
                }
                

            }
        }
        return count;
    }
}