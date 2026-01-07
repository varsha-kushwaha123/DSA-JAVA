class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
            map.put(nums[i][j], map.getOrDefault(nums[i][j], 0) + 1);
        }
        } 
        int n=nums.length;
        List<Integer>list=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==n){
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
       return list; 
    }
}