class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder t=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==y){
                t.append(y);
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=y){
                t.append(s.charAt(i));
            }
        }
        return t.toString();
        
    }
}