class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int rem,rev=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(rev==original){
            return true;
        }
        else{
            return false;
        }
    }
}