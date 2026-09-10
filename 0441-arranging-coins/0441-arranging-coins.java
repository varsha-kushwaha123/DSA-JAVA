class Solution {
    public int arrangeCoins(int n) {
        long sum= 1;
        int i;
        for( i=2;i<=n;i++){
            sum+=i;
            if(sum>n){
                break;
            }
           
        }
        return i-1;
    }
}