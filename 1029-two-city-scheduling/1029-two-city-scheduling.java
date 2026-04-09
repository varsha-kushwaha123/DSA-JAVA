class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n=costs.length;
        int cost=0;
        int arr[][]=new int[n][2];
        int idx[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i][0]=costs[i][0]-costs[i][1];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a,b) ->a[0]-b[0]);
        for(int i=0;i<n;i++){
            idx[i]=arr[i][1];
        }
        for(int j=0;j<n/2;j++){
            cost+=costs[idx[j]][0];

        }
        for(int j=(n/2);j<n;j++){
            cost+=costs[idx[j]][1];
        }
        return cost;


        
    }
}