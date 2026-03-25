class Solution {
    public int minCostToMoveChips(int[] position) {
        int oddct=0;
        int evenct=0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0){
                evenct++;
            }
            else{
                oddct++;
            }
        }
        return Math.min(evenct,oddct);
        
    }
}