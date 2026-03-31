class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<answers.length;i++){
            map.put(answers[i],map.getOrDefault(answers[i],0)+1); 
        }
        int ans=0;
        for(int key:map.keySet()){
            int val=map.get(key);
            int group=(val+key)/(key+1);
            ans+=group*(key+1);
        }
        return ans;
    }
}