class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
         List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        getpermutation(nums,0,ans);
        return ans;
        
    }
    public void getpermutation(int[] nums,int idx,List<List<Integer>>ans){
        if(idx==nums.length){
            List<Integer>temp=new ArrayList<>();
            for(int num:nums){
                temp.add(num);
            }
            ans.add(temp);
            return;
        }
        HashSet<Integer>set=new HashSet<>();
        for(int i=idx;i<nums.length;i++){
            if(set.contains(nums[i])) continue;
            set.add(nums[i]);
            swap(nums,idx,i);
            getpermutation(nums,idx+1,ans);
            swap(nums,idx,i);
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
        
    
}