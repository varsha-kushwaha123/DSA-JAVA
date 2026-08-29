class Solution {
    public String maskPII(String s) {
        StringBuilder sb=new StringBuilder();
        if(!s.contains("@")){
            s=s.replaceAll("[+\\-() ]","");
            int n=s.length();
                sb=sb.append('*');
                sb=sb.append('*');
                sb=sb.append('*');
                sb=sb.append('-');
                sb=sb.append('*');
                sb=sb.append('*');
                sb=sb.append('*');
                sb=sb.append('-');
                for(int i=n-4;i<n;i++){
                    sb=sb.append(s.charAt(i));
                }
                if(n==11){
                    sb.insert(0,"+*-");
                }
                if(n==12){
                    sb.insert(0,"+**-");
                }
                if(n==13){
                    sb.insert(0,"+***-");
                }
        }
        else{
            
            sb=sb.append(Character.toLowerCase(s.charAt(0)));
            sb=sb.append('*');
            sb=sb.append('*');
            sb=sb.append('*');
            sb=sb.append('*');
            sb=sb.append('*');
            int idx=s.indexOf('@');
            sb=sb.append(Character.toLowerCase(s.charAt(idx-1)));
            sb=sb.append('@');
            for(int i=idx+1;i<s.length();i++){
                char ch=Character.toLowerCase(s.charAt(i));
                sb=sb.append(ch);
            }
        }
        return sb.toString();
        
    }
}