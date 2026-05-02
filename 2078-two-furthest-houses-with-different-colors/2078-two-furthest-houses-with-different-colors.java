class Solution {
    public int maxDistance(int[] colors) {
        int dist=0;
        int n=colors.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(colors[i]!=colors[j]){
                    dist=Math.max(dist,j-i);

                }
            }
        }
        return dist;
        
    }
}