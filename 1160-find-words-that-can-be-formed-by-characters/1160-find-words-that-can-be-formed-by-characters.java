class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer>map1=new HashMap<>();
        for(char ch:chars.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        int count=0;
        for(int i=0;i<words.length;i++){
            HashMap<Character,Integer>map2=new HashMap<>();
            for(int j=0;j<words[i].length();j++){
                char ch2=words[i].charAt(j);
                map2.put(ch2,map2.getOrDefault(ch2,0)+1);
            }
            boolean can=true;
            for(char k:map2.keySet()){
                if(!map1.containsKey(k) || map1.get(k)<map2.get(k)){
                    can=false;
                    break;
                   
                }
            }
            if(can==true){
                count+=words[i].length();
            }
        }
        return count;
    
        

    }
}