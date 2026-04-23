class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b) -> a[1]-b[1]);
        int n=boxTypes.length-1;
        int count=0;
        int maxunit=0;
        for(int i=n;i>=0;i--){

            int take=Math.min(truckSize,boxTypes[i][0]);
            maxunit+=take*boxTypes[i][1];
            truckSize-=take;

            if(truckSize==0){
                break;
            }

        }
        return maxunit;
        
    }
}