class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int n=towers.length;
        int [][] arr=new int[n][4];

        for(int i=0;i<n;i++){
            int x= Math.abs(center[0]-towers[i][0])+Math.abs(center[1]-towers[i][1]);
            arr[i][0]=x;
            arr[i][1]=towers[i][2];
            arr[i][2]=towers[i][0];
            arr[i][3]=towers[i][1];
        }
        int maxquality=-1;
        int []ans={-1,-1};
        for(int i=0;i<n;i++){
            if(arr[i][0]<=radius){
                if(arr[i][1]>maxquality){
                    maxquality=arr[i][1];
                    ans[0]=arr[i][2];
                    ans[1]=arr[i][3];

                }
                else if(arr[i][1]==maxquality){
                     if (arr[i][2] < ans[0] ||
                       (arr[i][2] == ans[0] &&
                        arr[i][3] < ans[1])) {

                        ans[0] = arr[i][2];
                        ans[1] = arr[i][3];
                    }
                }
               

            }
        }
        return ans;
    
        
    }
}