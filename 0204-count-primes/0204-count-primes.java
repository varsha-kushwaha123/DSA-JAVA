class Solution {
    public int countPrimes(int n) {
        int []prime=new int[n+1];
        for(int i=2;i<=n;i++){
            prime[i]=1;
        }
        for(int i=2;i<=n;i++){
            if(prime[i]==1){
                blackbox(i,n,prime);
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(prime[i]==1){
                count++;
            }
        }
        return count;

    }
    public void blackbox(int i,int n,int []prime){
        for(int j=2*i;j<=n;j+=i){
            prime[j]=0;
        }
    }
}