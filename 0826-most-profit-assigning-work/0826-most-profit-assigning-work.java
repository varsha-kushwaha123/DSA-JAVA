class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n= difficulty.length;
        int arr[][]= new int [n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=difficulty[i];
            arr[i][1]=profit[i];
        }
        Arrays.sort(arr,(a,b) -> a[0]-b[0]);
        Arrays.sort(worker);
        int m=worker.length;
        int maxprofit=0;
        int best=0;
        int i=0;

        for(int j=0;j<m;j++){
        
            while(i<n && arr[i][0]<=worker[j]){
                
                   best=Math.max(best,arr[i][1]);
                   i++;
            }
            maxprofit += best;      

                
                
        }
        return maxprofit;

        
    }
}