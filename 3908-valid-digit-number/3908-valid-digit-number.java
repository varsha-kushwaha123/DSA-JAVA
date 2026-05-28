class Solution {
    public boolean validDigit(int n, int x) {
      Boolean present=false;
      int z=n;
      while(z>0){
        int rem=z%10;
        if(rem==x){
            present=true;
            break;
        }
        z=z/10;
      }
      int k=n;
      while(k>=10){
        k=k/10;
      }
      if(k==x) {
        present=false;
      }
      return present; 
    }
}