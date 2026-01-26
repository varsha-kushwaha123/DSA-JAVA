class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer>map=new HashMap<>();
        int have=0;
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<jewels.length();i++){
            char c=jewels.charAt(i);
        
            if(map.containsKey(c)){
                have+=map.get(c);
            }
        }
        return have;
    }
}