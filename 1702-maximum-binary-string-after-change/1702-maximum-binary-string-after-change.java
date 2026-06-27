class Solution {
    public String maximumBinaryString(String binary) {
        int firstzero=-1;
        int zerocount=0;
        int n=binary.length();
        for(int i=0;i<n;i++){
            if(binary.charAt(i)=='0'){
                zerocount++;
            
            if(firstzero==-1){
                firstzero=i;
            }
            } 
        }
        if(zerocount<=1){
            return binary;
        }
    
            char[] ans=new char[n];
            for(int i=0;i<n;i++){
                ans[i]='1';
            }
        ans[firstzero+zerocount-1]='0';
        return new String(ans);
        
    }
}