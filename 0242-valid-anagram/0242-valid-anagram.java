class Solution {
    public boolean isAnagram(String s, String t) {
        
        char []ch1=s.toCharArray();
        char[]ch2=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String s1=new String(ch1);
        String s2=new String(ch2);
        if(s1.equals(s2)){
            return true;
        }
        else{
            return false;
        }

        
            
        
    }
}