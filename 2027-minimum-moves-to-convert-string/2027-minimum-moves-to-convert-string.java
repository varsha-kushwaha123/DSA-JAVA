class Solution {
    public int minimumMoves(String s) {
        int n=s.length();
        int ans=0;
        int i=0;
        while(i<n){
            if(s.charAt(i)=='X'){
                ans++;
                i+=3;

            }
            else{
                i++;
            }
        }
        return ans;
    }
}