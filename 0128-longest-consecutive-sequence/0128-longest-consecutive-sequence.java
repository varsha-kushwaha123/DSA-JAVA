class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        TreeSet<Integer>set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int count=1;
        Integer prev=null;
        int Max=1;
        for(Integer curr:set){
            if (prev != null) {
            int diff = curr - prev;
            if(diff==1){
                count++;
            }
            else{
                count=1;
            }
            
        }
        Max= Math.max(count,Max);
        prev = curr;
    }
    return Max;

        

    }
}