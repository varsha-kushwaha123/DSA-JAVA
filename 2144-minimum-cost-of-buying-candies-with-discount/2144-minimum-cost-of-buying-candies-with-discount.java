class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n=cost.length;
        int mincost=0;
        int i=n-1;
        while(i>=2){
            mincost+=cost[i];
            mincost+=cost[i-1];
            i-=3;

        }
        while(i>=0){
            mincost+=cost[i];
            i--;
        }
        return mincost;
        
    }
}