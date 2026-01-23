class Solution {
    public int[] findErrorNums(int[] nums) {
        TreeMap<Integer,Integer>map=new TreeMap<>();
        int[]arr=new int[2];
        int duplicate=-1;
        int missing=-1;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Integer keys:map.keySet()){
            if(map.get(keys)==2){
                duplicate=keys;
                break;
            }   
        }
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                missing=i;
                break;
            }
        }
        arr[0]=duplicate;
        arr[1]=missing;
        return arr;
       
        
    }
}