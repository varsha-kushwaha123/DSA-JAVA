class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(Integer num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int count=0;
        for(Integer k:map.keySet()){
            if(map.get(k)==1){
                count++;
            }

        }
        for(Integer k:map.keySet()){
            if(map.get(k)==count){
                return k;
            }
        }
        return -1;
    
    }
}