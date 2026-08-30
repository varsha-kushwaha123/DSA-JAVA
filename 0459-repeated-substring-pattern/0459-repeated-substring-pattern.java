class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int len=1;len<=n/2;len++){
            if(n%len!=0){
                continue;
            }
            String sub=s.substring(0,len);
            boolean match=true;

            for(int i=len;i<n;i+=len){
                if(!s.substring(i,i+len).equals(sub)){
                    match=false;
                    break;
                }
            }
            if(match)
              return true;
        }
        return false;
        
    }
}