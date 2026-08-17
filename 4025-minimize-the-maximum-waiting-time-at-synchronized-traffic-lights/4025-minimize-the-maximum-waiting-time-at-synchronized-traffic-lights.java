class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int maxpenalty=0;
        int wait=0;
        int maxlight=0;
        for(int i=0;i<lights.length;i++){
            maxlight=Math.max(maxlight,lights[i]);

        }
        for(int i=0;i<arrivalTime.length;i++){
            int r=arrivalTime[i]%period;
           
                if(r<maxlight){
                    wait=0;
                }
                else{
                    wait=period-r;
                }
                
            
            maxpenalty=Math.max(maxpenalty,wait);
        }
        return maxpenalty;
    
        
    }
}