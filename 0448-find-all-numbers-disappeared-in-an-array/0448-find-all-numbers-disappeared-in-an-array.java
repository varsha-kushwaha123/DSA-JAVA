class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer>map=new HashSet<>();
        int x=nums.length;
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=x;i++){
            if(!map.contains(i)){
                list.add(i);
            }
        }
        return list;

        
    
    }
}