class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s=s.replace("-","");
        int n=s.length();
        s=s.toUpperCase();
        if(n==1) return s;
        int x=n%k;
        StringBuilder sb=new StringBuilder(s);
        if(x==0){
            for(int i=k;i<sb.length();i+=k+1){
                sb.insert(i,'-');

            }
        }
        else{
            sb.insert(x,'-');
             for(int i=(x+1)+k;i<sb.length();i+=k+1){
                sb.insert(i,'-');

            }

        }
        String str=sb.toString();
        return str;
        
    }
}