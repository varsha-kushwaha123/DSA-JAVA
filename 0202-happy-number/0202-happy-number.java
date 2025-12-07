class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
         do{
            slow=sumsq(slow);
            fast=sumsq(sumsq(fast));
        }while(slow!=fast);
         if(slow==1){
            return true;
         }
         else{
            return false;
         }
        
        

    }
    public int sumsq(int n){
        int sum=0;
        int rem;
        while(n>0){
            rem=n%10;
            sum=sum+(rem*rem);
            n=n/10;
        }
        return sum;
    }
}