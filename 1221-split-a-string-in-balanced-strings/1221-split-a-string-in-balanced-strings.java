class Solution {
    public int balancedStringSplit(String s) {
        int noR=0;
        int noL=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(noR==noL){
                count++;
                noR=0;
                noL=0;
            }
            if(s.charAt(i)=='R'){
                noR++;
            }
            else{
                noL++;
            }
        }
        return count++;
    
    }
}