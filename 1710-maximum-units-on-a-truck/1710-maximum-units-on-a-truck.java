class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b) -> a[1]-b[1]);
        int n=boxTypes.length-1;
        int count=0;
        int maxunit=0;
        for(int i=n;i>=0;i--){
            truckSize=truckSize-boxTypes[i][0];
            if(truckSize>=0){
                maxunit+=boxTypes[i][0]*boxTypes[i][1];
            }
            else{
                maxunit+=(truckSize+boxTypes[i][0])*boxTypes[i][1];
                break;
            }

        }
        return maxunit;
        
    }
}