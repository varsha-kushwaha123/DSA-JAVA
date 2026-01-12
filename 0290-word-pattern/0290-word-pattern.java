class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map1= new HashMap<>();
        HashSet<String> map2=new HashSet<>();
        String[] word=s.split(" ");
        if(pattern.length()!=word.length)
                   return false;
        for(int i=0;i<pattern.length();i++){

            char ch=pattern.charAt(i);
            String t=word[i];

            if(map1.containsKey(ch)){
               
               if(!map1.get(ch).equals(t)){
                return false;
               }
            }
            else{
                if(map2.contains(t)){
                        return false;
                }
                else{
                    map1.put(ch,t);
                    map2.add(t);
                }
            }
        }
        return true;
        
    }
}