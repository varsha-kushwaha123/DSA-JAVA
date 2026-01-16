class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=0;
        boolean hasodd=false;
        
        Set<Character>key=map.keySet();
        for(Character k:key){
            if(map.get(k)%2==0){
               
             count=count+map.get(k);
            }
            else{
                count+=map.get(k)-1;
                hasodd=true;
            }
            
        } 
        if(hasodd){
            count+=1;
        
        }
        return count;
    
    }
}