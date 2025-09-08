class Solution {
    public void reverseString(char[] s) {
        int lt=0,rg=s.length-1;
        char temp;
        while(lt<rg){
            temp=s[lt];
            s[lt]=s[rg];
            s[rg]=temp;
            lt++;
            rg--;

        }
    
        
    }
}