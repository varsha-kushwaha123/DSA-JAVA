class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character,Integer>map1=new HashMap<>();
        String s="";
        licensePlate = licensePlate.replaceAll("[^a-zA-Z]", "").toLowerCase();
        for(int i=0;i<licensePlate.length();i++){
            map1.put(licensePlate.charAt(i),map1.getOrDefault(licensePlate.charAt(i),0)+1);
        }
        for(int i=0;i<words.length;i++){
             HashMap<Character,Integer>map2=new HashMap<>();
             String word = words[i].toLowerCase();
            for(int j=0;j<words[i].length();j++){
                map2.put(words[i].charAt(j),map2.getOrDefault(words[i].charAt(j),0)+1);
               
            }
            boolean ok=true;
            for(char ch:map1.keySet()){
                if(!map2.containsKey(ch) || map2.get(ch)<map1.get(ch)){
                    ok=false;
                    break;
                }
            }
            if (ok) {
                if (s.equals("") || word.length() < s.length()) {
                    s = word;
                }
            }
        }
        return s;
        
    }
}