class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int posinedur=0;
        posinedur=timeSeries.length * duration;
        for(int i=0;i<timeSeries.length-1;i++){
            int gap=timeSeries[i+1]-timeSeries[i];
            if(gap<duration){
                posinedur-=(duration-gap);
            }
            
        }
        return posinedur;
        
    }
}