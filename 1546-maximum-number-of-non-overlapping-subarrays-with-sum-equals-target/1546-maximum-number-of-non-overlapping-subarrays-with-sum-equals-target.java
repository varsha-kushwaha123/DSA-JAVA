class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
        HashSet<Integer>set=new HashSet<>();
        set.add(0);
         int count=0;
         int prefix=0;
          for(int num:nums){
            prefix+=num;
             if(set.contains(prefix-target)){
                count++;
                set.clear();
                set.add(0);
                prefix=0;
             }
             else{
                set.add(prefix);
             }
          }
          return count;
    }
}