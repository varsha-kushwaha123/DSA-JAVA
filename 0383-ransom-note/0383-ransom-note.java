class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char k:ransomNote.toCharArray()){
            map.put(k,map.getOrDefault(k,0)+1);
        }
        for(int i=0;i<magazine.length();i++){
            if(map.containsKey(magazine.charAt(i))){
                if(map.get(magazine.charAt(i))!=0){
                map.put(magazine.charAt(i),map.get(magazine.charAt(i))-1);
            }
          }
        }
        Boolean ans=true;
        for(Integer key : map.values()) {
                if(key>0){
                    return false;
                }
            }
        return ans;
    }
}