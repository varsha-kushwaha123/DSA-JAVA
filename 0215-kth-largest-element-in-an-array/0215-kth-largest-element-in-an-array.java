class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:nums){
            pq.add(x);
        }
        int ans=0;
        for(int i=0;i<k;i++){
             ans=pq.remove();
        }
        return ans;
        
    }
}