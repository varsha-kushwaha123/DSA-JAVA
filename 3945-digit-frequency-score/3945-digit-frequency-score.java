class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Character,Integer>map=new HashMap<>();
        String nums=Integer.toString(n);
        for(Character num:nums.toCharArray()){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        int count=0;
        for(Character key:map.keySet()){
            count+=((key-'0')*map.get(key));
        }
           return count;
    }
 
}