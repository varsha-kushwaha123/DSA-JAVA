class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        
        if(n%2 == 0){ // for even power
            double half = myPow(x, n/2);
            return half * half;
        } else { // for odd power
            if(n > 0){ // for odd positive
                return x * myPow(x, n-1);
            } else { // for odd negative
                return 1/x * myPow(x, n+1);
            } 
      
        
        }
    }
}