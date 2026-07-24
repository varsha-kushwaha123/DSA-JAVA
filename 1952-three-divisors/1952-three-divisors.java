class Solution {
    public boolean isThree(int n) {
        int i=2;
        int factor=0;
        if(n==0 || n==1 || n==2) return false;
        while(i<n){
            if(n%i==0){
                factor++;
            }
            if(factor>1){
                return false;
            }
            i++;
        }
        if(factor==1) return true;
        return false;

        
    }
}