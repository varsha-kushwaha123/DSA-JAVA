class Solution {
    public int countValidPrefixes(String s) {
        int n=s.length();
        int ans=0;
        int count_0=0;
        int count_1=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                count_0++;
            }
            else{
                count_1++;
            }
            if(Math.abs(count_0-count_1)<=1){
                ans++;

            }
        }
        return ans;
    }
}