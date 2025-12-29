class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int i=0;
        for( i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1 );
            }
        }
        int maxfreq=0;
        int answer=-1;
       
       Set<Integer> keyset = hm.keySet();

        for(Integer key:keyset){
         
            if(key%2==0){
                int freq=hm.get(key);
                
                if(freq>maxfreq || (freq==maxfreq && key<answer)){
                    maxfreq=freq;
                    answer=key;
                }
                
                
            }
           
        }
        return answer;
          
            
    }   
}