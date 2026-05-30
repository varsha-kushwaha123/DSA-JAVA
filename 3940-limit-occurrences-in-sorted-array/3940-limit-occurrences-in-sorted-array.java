class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        LinkedHashMap<Integer,Integer>list=new LinkedHashMap<>();
        int n=nums.length;
        for(int num:nums){
            list.put(num,list.getOrDefault(num,0)+1);
        }
        ArrayList<Integer>arr=new ArrayList<>();
         for(Map.Entry<Integer,Integer> entry : list.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            if(value<k){
                for(int i=0;i<value;i++){
                    arr.add(key);
                }
            }
            if(value>=k){
                for(int i=0;i<k;i++){
                    arr.add(key);
                }
            }
         }
         int[] ans = new int[arr.size()];

        for(int i=0;i<arr.size();i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}