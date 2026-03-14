class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tgas=0;
        int tcost=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            tgas+=gas[i];
        }
        for(int i=0;i<cost.length;i++){
            tcost=tcost+cost[i];
        }
        if(tgas<tcost) return -1;
        else{
            int currgas=0;
            for(int i=0;i<gas.length;i++){
                 currgas=gas[i]-cost[i]+currgas;
                if(currgas<0){
                    currgas=0;
                    start=i+1;
                }
                
                
            }
        }
        return start;
        
    }
}