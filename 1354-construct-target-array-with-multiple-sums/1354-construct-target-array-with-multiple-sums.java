class Solution {
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        long sum=0;
        for(int x:target){
            pq.offer(x);
            sum+=x;
        }
        while(true){
            int largest=pq.poll();
            long rest=sum-largest;
            if(largest==1 || rest==1) return true;
            if(rest==0 || largest<rest) return false;
            int prev=(int)(largest % rest);
            if(prev==0)
             return false;

             pq.offer(prev);
             sum=rest + prev;
        }
        
    }
}