class Solution {
    public int pivotInteger(int n) {
     
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=n;i++){
             sum1=(i*(i+1))/2;
             sum2=(n*(n+1))/2-(i*(i-1))/2;
            if(sum1==sum2) return i;
        }
        return -1;
        
        
    }
}