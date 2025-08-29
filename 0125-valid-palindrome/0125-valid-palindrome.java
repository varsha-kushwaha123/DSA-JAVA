class Solution {
    public boolean isPalindrome(String s) {
        String str1=s.toLowerCase();
        String str2=str1.replaceAll("[^a-z0-9]","");
        int n=str2.length();
        for(int i=0;i<str2.length()/2;i++){
            if(str2.charAt(i)!=str2.charAt(n-i-1)){
                return false;
            }
        }
        return true;
        
    }
}