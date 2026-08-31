class Solution {
    public int repeatedStringMatch(String a, String b) {
        String repeated="";
        int count=0;
        while(repeated.length()< b.length()){
            repeated+=a;
            count++;

        }
        if(repeated.contains(b)){
            return count;
        }
        else{
            repeated+=a;
            count++;
            if(repeated.contains(b)){
                return count ;
            }
            else{
                return -1;
            }
        }
        
        
    }
}