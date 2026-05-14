class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n= difficulty.length;
        int arr[][]= new int [n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=difficulty[i];
            arr[i][1]=profit[i];
        }
        Arrays.sort(arr,(a,b) -> a[0]-b[0]);
        int m=worker.length;
        int maxprofit=0;

        for(int j=0;j<m;j++){
            int best=0;
            for(int i=0;i<n;i++){
                if(arr[i][0]<=worker[j]){
                   best=Math.max(best,arr[i][1]);

                }
                else{
                    break;
                }
            }
            maxprofit +=best;
        }
        return maxprofit;

        
    }
}