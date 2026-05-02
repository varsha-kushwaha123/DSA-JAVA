class Solution {
    public int maxDistance(int[] colors) {
        int dist=0;
        int n=colors.length-1;
        for(int i=n;i>=0;i--){
            if(colors[i]!=colors[0]){
                dist=Math.max(dist,i-0);
                break;
            }
        }
        for(int i=0;i<=n;i++){
            if(colors[i]!=colors[n]){
                dist=Math.max(dist,n-i);
                break;
            }
        }
        return dist;
        
        
    }
}