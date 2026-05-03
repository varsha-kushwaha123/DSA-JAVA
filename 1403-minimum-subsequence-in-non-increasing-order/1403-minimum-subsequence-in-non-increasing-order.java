class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer>list=new ArrayList<>();
        int totalsum=0;
        int currsum=0;
        int n=nums.length-1;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        for(int i=n;i>=0;i--){
            currsum+=nums[i];
            list.add(nums[i]);
            if(currsum>totalsum-currsum){
                break;
            }
        }
        return list;

        

        
    }
}