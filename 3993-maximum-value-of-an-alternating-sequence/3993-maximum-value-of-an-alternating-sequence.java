class Solution {
    public long maximumValue(int n, int s, int m) {
        if (n == 1) {
            return s;
        }
        long max1=0;
        long max2=0;

       int even =n/2;
       int odd=n-even;
       if(n%2==0){
        max1 = s + (long) even * m - (odd - 1);
        max2 = s + (long) (odd - 1) * m - (even - 1);
       }
       else{
         max1 = s + (long) even * m - (odd - 2);
        max2 = s + (long) (odd - 1) * m - even;
       }
       return Math.max(max1,max2);
    }
}